package presenter;

/**
 * The MazeSize program implements an application that realize the methods from CommonCommand.
 * This class apply the mazeSize method that display the size of the maze in memory.
 * 
 * @author Mor Basson & Reut Sananes
 * @version 1.0
 */
public class MazeSize extends CommonCommand {

	/**
	 * Constructor
	 * @param presenter
	 */
	public MazeSize(Presenter presenter) {
		super(presenter);
	}

	@Override
	public void doCommand(String command) {
		String[] tempArr = command.split(" ");
		if (tempArr.length != 2) {
			presenter.getView().display("Invalid parameters");
		} else {
			String nameMaze = tempArr[1];
			presenter.getModel().mazeSize(nameMaze);
		}
	}
}

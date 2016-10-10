package presenter;
/**
 * The Command is an Interface class that has one method that 
 * will be implement differently in each class.
 * 
 * @author Mor Basson & Reut Sananes
 * @version 1.0
 */
public interface Command {
	public void doCommand(String command);
}

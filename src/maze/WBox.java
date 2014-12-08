package maze;
import java.io.PrintWriter;


public class WBox extends MBox{
	
	public WBox(Maze maze,int line, int column) {
		super(maze, line, column,"W");
	}
	
	public boolean isAccessible() {
		return false;
	}

	@Override
	public void writeCharTo(PrintWriter printer) {
		printer.print('W');
		
	}
	
	
}

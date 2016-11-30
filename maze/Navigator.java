package maze;

public class Navigator {
	
	public int x;
	public int y;
	
	public Navigator(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public boolean canGo(Maze maze, int x, int y){
		if(maze.mazeModel[x][y]==0){
			return true;
		}else return false;
	}
	
	public boolean notEnd(){
		if(x==8 && y==8){
			return false;
		}else return true;
	}

}

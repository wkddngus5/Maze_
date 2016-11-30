package maze;

public class Maze {
	
	public int [][] mazeModel ={
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{1, 0, 1, 1, 1, 0, 1, 1, 1, 1},
			{1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
			{1, 1, 1, 0, 0, 0, 1, 0, 1, 1},
			{1, 1, 1, 0, 1, 1, 1, 0, 1, 1},
			{1, 1, 0, 0, 1, 0, 0, 0, 0, 1},
			{1, 0, 1, 1, 1, 0, 1, 1, 1, 1},
			{1, 1, 0, 1, 1, 0, 0, 0, 0, 1},
			{1, 0, 1, 1, 0, 1, 1, 1, 0, 1},
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}		
	};
	
	public void drawMaze(){
		for(int i=0; i<10;i++){
			for(int j=0; j<10;j++){
				System.out.print(" "+this.mazeModel[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}

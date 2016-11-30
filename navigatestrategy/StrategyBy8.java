package navigatestrategy;

import maze.Maze;
import maze.Navigator;

public class StrategyBy8 implements INavigateStrategy{
	
	public int count=0;

	@Override
	public void navigating(Maze maze, Navigator navigator) {
		
		int nowX=navigator.x;
		int nowY=navigator.y;
		maze.mazeModel[nowX][nowY]=2; 
		if(nowX==8 && nowY==8){
			System.out.println("이동 횟수: "+count);
			maze.drawMaze();
			return;
		}
		
		count++;
		
		if(navigator.canGo(maze, nowX-1, nowY+1)){
			navigator.x-=1;
			navigator.y+=1;
			navigating(maze, navigator);
			navigator.x+=1;
			navigator.y-=1;
		}//EN 
		if(navigator.canGo(maze, nowX, nowY+1)){
			navigator.y+=1;
			navigating(maze, navigator);
			navigator.y-=1;
		}//E
		if(navigator.canGo(maze, nowX+1, nowY+1)){
			navigator.y+=1;
			navigator.x+=1;
			navigating(maze, navigator);
			navigator.y-=1;
			navigator.x-=1;
		}//ES
		if(navigator.canGo(maze, nowX+1, nowY)){
			navigator.x+=1;
			navigating(maze, navigator);
			navigator.x-=1;
		}//S
		if(navigator.canGo(maze, nowX+1, nowY-1)){
			navigator.x+=1;
			navigator.y-=1;
			navigating(maze, navigator);
			navigator.x-=1;
			navigator.y+=1;
		}//WS 
		if(navigator.canGo(maze, nowX, nowY-1)){
			navigator.y-=1;
			navigating(maze, navigator);
			navigator.y+=1;
		} //W
		if(navigator.canGo(maze, nowX-1, nowY-1)){
			navigator.x-=1;
			navigator.y-=1;
			navigating(maze, navigator);
			navigator.x+=1;
			navigator.y+=1;
		}//WN
		if(navigator.canGo(maze, nowX-1, nowY)){
			navigator.x-=1;
			navigating(maze, navigator);
			navigator.x+=1;
		}//N
		
		return;
	}
	
	

}

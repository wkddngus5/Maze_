package maze;

import maze.navigatestrategy.INavigateStrategy;
import maze.navigatestrategy.StrategyBy4;
import maze.navigatestrategy.StrategyBy8;

public class MazeTest {

	public static void main(String[] args) {
		
		System.out.println("StrategyBy4");
		Navigator startNav1 = new Navigator(1, 1);
		Maze maze1 = new Maze();
		StrategyBy4 strategyBy4 = new StrategyBy4();
		strategyBy4.navigating(maze1, startNav1);
		
		System.out.println();
		System.out.println("StrategyBy8");
		Navigator startNav2 = new Navigator(1, 1);
		Maze maze2 = new Maze();
		StrategyBy8 strategyBy8 = new StrategyBy8();
		strategyBy8.navigating(maze2, startNav2);
		
	}
}


public class Driver {

	public static void main(String[] args) {
		Board board = new Board(9);
		int[][] array = {{0,0,0,0,8,6,4,0,5}, //1
				         {1,0,3,2,4,0,0,0,0}, //2
				         {5,0,4,7,0,3,1,0,6}, //3
				         {8,0,0,0,0,2,3,5,0}, //4
				         {0,0,6,9,5,0,7,0,0}, //5
				         {4,0,5,0,7,0,0,0,0}, //6
				         {0,0,0,0,3,0,5,0,2}, //7
				         {2,0,0,0,6,1,0,0,7}, //8
				         {7,5,0,4,0,0,6,0,0}}; //9		         
		
		
		board.inputBoardAsArray(array);
		board.print();
		
				
		
		
	}

}

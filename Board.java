/* 1.) create a 2d array that is empty
 * 2.) Step through the input 
 * 3.) Function that passes the board
 */

public class Board {
	int size = 4;
	Square[][] board;

	Board(int size) {
		setSize(size);
		board = new Square[getSize()][getSize()];
		
	}
	
	
	
	public void inputBoardAsArray(int[][] array) { 
		for(int row = 0;row < getSize();row++) {
			for (int col = 0; col < getSize();col++) {
				board[col][row] = new Square(array[row][col]); // took a while to fix. 			 
				
			}
		}
	}
		
		
	
	
	public void print() {  // print out board.
		for(int row = 0; row < size;row++) {
			for (int col = 0; col < size;col++) {
				Square square = board[col][row];
				if(square.getNum() == 0) {
					System.out.print("*");
				}else {
					System.out.print(square.getNum());
				}
				
			}
			System.out.println();
		}
	}
	
	public void solveByRowX(int col,int row) {
		// solve by looking at numbers horizontal.
		// remove numbers from posNum if already in row.
	}
	public void solveByRowY(int col,int row) {
		// solve by looking at number vertical.
		//remove numbers from posNum if already in row. 
	}
	public void solveByBlock(int col,int row) {
		// look at numbers in block and remove from posNum. 
	}
		
	
	
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}



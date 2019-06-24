
public class Row {
	Square[] row;
	int[] list;
	int[] coordinate ; // where the first cell is from left or top. 
	boolean isVertical;
	int size;

	Row(int[] coordinate ,boolean isVertical, int size){
		row = new Square[size];
		list = new int[size];
		this.coordinate  = coordinate ;
		this.isVertical = isVertical;
		this.size = size;
		
	}
	
	public void fillRow(int[][] board, boolean isVertical) {
		int[] coordinate = getCoordinate();
		int rowC = coordinate[0];
		int colC = coordinate[1];
		
		if(!isVertical) { // find out how to take info form board 
			for(int i = 0; i< getSize(); i++) {
				list[i] = board[rowC][colC + i];
			}
		}
		else if(isVertical) {
			for(int i = 0; i< getSize(); i++) {
				list[i] = board[rowC+i][colC];
			}
		}
	}
	
	public int[] getCoordinate() {
		return coordinate;
	}
	
	public void setCoordinate(int[] coordinate) {
		this.coordinate = coordinate; 
	}
	
	public void printRow(){
		for(int i =0; i < size; i++) {
			if(!(list[i] == 0)) {
				System.out.print(list[i]);
			}
			else {
				System.out.print(".");
			}
		}
	}
	public int getSize() {
		return size;
	}
	
	public int[] filledNums(int[] coordinates){ 
		int[] numsUsed = new int[9];
		for(int i=0; i<9;i++) {
			
		}
		
		return numsUsed; 
	}
	
}

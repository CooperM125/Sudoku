
public class Square {
	int number;
	int[] posNum = {1,2,3,4,5,6,7,8,9}; 
	
	/*=== constructors ===*/
	Square(){
		this.number = 0;
	}
	Square(int number){
		this.number = number;
	}
	
	/*=== Behavor ===*/
	public void testIfOnePosNum() {
		
		// if there is only one number left then set square to that number.
	}
	
	/*===Set Funstions===*/
	public void rmvPosNum(int rmvNum){
		for(int i =0;i < 9;i++) {
			if(rmvNum == posNum[i]) {
				posNum[i] = 0;
				break;
			}
		}
	}
	public void setNum(int number) {
		this.number = number; 
	}
	
	
	/*=== Get functions ===*/
	public int[] getPosNum() {
		return posNum;
	}
	
	
	public int getNum() {
		return number;
	}
	
	/*
	  
	Square( int number,int x,int y){
		this.x = x;
		this.y = y;
		
	}

	public void setCoordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int x;
	int y;
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	 */
	
}

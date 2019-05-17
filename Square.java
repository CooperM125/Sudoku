
public class Square {
	int number;
	int[] posNum = {1,2,3,4,5,6,7,8,9}; 
	int[] coordinate; 
	Square(){
		this.number = 0;
		
	}
	Square(int number){
		this.number = number;
	}
	Square(int number,int[] coordinate){
		this.coordinate = coordinate;
		if(number == 0) {
			for(int i =0; i<9;i++) {
				posNum[i] = 0;
			}
		}
		
		
	}
	public void rmvPosNum(int rmvNum){
		for(int i =0;i < 9;i++) {
			if(rmvNum == posNum[i]) {
				posNum[i] = 0;
				break;
			}
		}
	}
	public void testIfOnePosNum() {
		// if there is only one number left then set square to that number.
	}
	
	public int[] getPosNum() {
		return posNum;
	}
	
	public void setCoordinate(int x, int y) {
		this.coordinate[0] = x;
		this.coordinate[1] = y;
	}
	
	public int getX() {
		return coordinate[0];
	}
	
	public int getY() {
		return coordinate[1];
	}
	public int getNum() {
		return number;
	}
	public void setNum(int number) {
		this.number = number; 
	}
	
	
}

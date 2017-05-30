/**
 * Position.java
 * The position class that sets up row and col
 * @author Jake Jeffries/Michael Jaffe
 * @version 5/30/17
 */
public class Position {
	private	int row;
	private int col;
	
	/**
	 * constructor that sets the row and column as -1
	 */
	public Position() {
		row = -1;
		col = -1;
	}
	
	/**
	 * constructor that sets the row and col to the correct values
	 * @param r
	 * @param c
	 */
	public Position(int r, int c) {
		row = r;
		col = c;
	}
	
	/**
	 * accessor for row
	 * @return row
	 */
	public int getRow(){
		return row;
	}
	
	/**
	 * accessor for column
	 * @return col
	 */
	public int getColumn(){
		return col;
	}
	
	/**
	 * sets the row to a new value
	 * @param r
	 */
	public void setRow(int r){
		row = r;
	}
	
	/**
	 * sets the col to a new  value
	 * @param c
	 */
	public void setCol(int c){
		col = c;
	}
	
	/**
	 * Finds if two Positions are equal
	 * @return true or false depending on if they're equal
	 */
	public boolean equals(Object other){
		if (other instanceof Position) {
			Position otherPos = (Position)other;
			if (otherPos.getRow() == this.getRow() && otherPos.getColumn() == this.getColumn()){
				return true;
			}
		}
		return false;
	}
}

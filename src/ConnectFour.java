import javax.swing.text.Position;


public class ConnectFour {
	private int[][] board; // game board for playing ConnectFour 
	private int currentPlayer; // stores the current player's turn 
	private Position[] winningPositions; //stores row+colum
	// coordinates when someone
	// wins
	private int winner; // stores which player wins (0 == draw)
	
	
	
	public void play(int i) {
		// TODO Auto-generated method stub
		
	}

	public void newGame() {
		for(int i = 0;i<board.length;i++){
			
		}
		
		
	}

	public Object gameOver() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int getWinner() {
		return winner;
	}

	public boolean columnFull(int c) {
		return (board[0][c] !=0 );
	}

	public Position[] getWinningPositions(){
		return winningPositions;
		
	}
	
	public int[][] getBoard(){
		return board;
		
	}
	
}

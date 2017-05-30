/**
 * ConnectFour.java
 * Contains methods to be used in gameplay for ConnectFourGUI.java
 * @author 19jaffe/18jeffries
 * @version 5-29-15
 *
 */
public class ConnectFour implements BoardGame {
    private int[][] board;
    private int currentPlayer;
    private Position[] winningPositions;
    private int winner;
    
    /**
     * constructor for ConnectFour
     */
    public ConnectFour(){
    	board = new int[6][7];
    	winningPositions = new Position[4];
    	winner = 0;
    	currentPlayer = 1;
    }
    
    /**
     * creates new game
     */
    public void newGame(){
        for(int row = 0; row < board.length; row++){
        	for(int col = 0; col < board[0].length; col++)
        		board[row][col] = 0;
        }
        for(int i = 0; i < winningPositions.length; i++)
        	winningPositions[i] = new Position();
    }

    /**
     * determines if game is over or not
     * @return boolean if game is over or not
     */
    public boolean gameOver() {
    	if(getWinner()!= 0)
    		return true;
    	else{
    		for(int i : board[0]){
    			if(i == 0)
    				return false;
    		}
    	}
    	return true;
    }

    /**
     * determines if there is a winner and which player has won
     * @return player, or 0 if no one has won
     */
    public int getWinner() {
     
     for(int player = 1; player < 3; player++){
     	for(int row = 0; row < 6; row++){
     		for(int col = 0; col < 4; col++){
     			if(board[row][col] == player && board[row][col+1] == player && board[row][col+2] == player && board[row][col+3] == player){
     				winningPositions[0] = new Position(row, col);
 					winningPositions[1] = new Position(row, col + 1);
 					winningPositions[2] = new Position(row , col + 2);
 					winningPositions[3] = new Position(row, col  + 3);
     				return player;
     			}
     		}
     	}
     }
     
     for(int player = 1; player < 3; player++){
     	for(int col = 0; col < 7; col++){
     		for(int row = 0; row <= 2; row++){
     			if(board[row][col] == player && board[row+1][col] == player && board[row+2][col] == player && board[row+3][col] == player){
     				winningPositions[3] = new Position(row, col);
 					winningPositions[2] = new Position(row + 1, col);
 					winningPositions[1] = new Position(row + 2, col);
 					winningPositions[0] = new Position(row + 3, col);
     				return player;
     			}
     		}
     	}
     }
     for(int player = 1; player <= 2; player++){
     	for(int row = 3; row < 6; row++){
     		for(int col = 0; col < 4; col++){
     			if(board[row][col] == player && board[row-1][col+1] == player && board[row-2][col+2] == player && board[row-3][col+3] == player){
     					winningPositions[0] = new Position(row, col);
     					winningPositions[1] = new Position(row - 1, col + 1);
     					winningPositions[2] = new Position(row - 2, col + 2);
     					winningPositions[3] = new Position(row - 3, col + 3);
     				return player;
     			}
     		}
     	}
     }
     for(int player = 1; player <= 2; player++){
     	for(int row = 0; row <= 2; row++){
     		for(int col = 0; col <= 3; col++){
     			if(board[row][col] == player && board[row+1][col+1] == player && board[row+2][col+2] == player && board[row+3][col+3] == player){
     				winningPositions[3] = new Position(row, col);
 					winningPositions[2] = new Position(row + 1, col + 1);
 					winningPositions[1] = new Position(row + 2, col + 2);
 					winningPositions[0] = new Position(row + 3, col + 3);
     				return player;
     			}
     		}
     	}
     }
        return 0;
    }

    /**
     * accessor method that returns array of winning positions
     * @return winningPositions
     */
    public Position[] getWinningPositions() {
        return winningPositions;
    }

    /**
     * determines if a column is full
     * @param column
     * @return boolean if column is full
     */
    public boolean columnFull(int column){
        return (board[0][column] != 0);
    }
    
    /**
     * play method that plays each token in selected column
     * @param column
     */
    public void play(int column) {
    	if(!columnFull(column)){
    		for(int row = board.length-1; row >= 0; row--){
            	if(board[row][column] == 0) {
                	board[row][column] = currentPlayer;
                	break;
            	}
        	}
    		currentPlayer = currentPlayer % 2 + 1;
    	}
    }

    /**
     * accessor method for state of the board
     * @return board
     */
    public int[][] getBoard() {
        return board;
    }
}

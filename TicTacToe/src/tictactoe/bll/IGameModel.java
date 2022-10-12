package tictactoe.bll;

import tictactoe.gui.controller.TicTacViewController;

/**
 *
 * @author Stegger
 */
public interface IGameModel
{

    /**
     * Returns 0 for player 0, 1 for player 1.
     *
     * @return int ID of the next player.
     */
    public int getNextPlayer();

    /**
     * Attempts to let the current player play at the given coordinates. If the
     * attempt is successful the current player has ended his turn, and it is the
     * next players turn.
     *
     * @param col column to place a marker in.
     * @param row row to place a marker in.
     * @return true if the move is accepted, otherwise false. If gameOver ==
     * true this method will always return false.
     */
    public boolean play(int col, int row);

    /**
     * Tells us if the game has ended either by draw or by meeting the winning
     * condition.
     *
     * @return true if the game is over, else it will return false.
     */
    public boolean isGameOver();

    /**
     * Gets the id of the winner, -1 if it's a draw or if the game is still running.
     *
     * @return int id of winner, or -1 if draw or if gameOver() == false.
     */
    public int getWinner();

    /**
     * Resets the game to a new game state.
     */
    public void newGame();

    public void updatePlayField(int row, int col, String symbol);

    public int getCurrentPlayer();
    public void chooseAIMove();

    public void updateIsSinglePlayer(boolean value);

    public void setController(TicTacViewController ticTacViewController);

    public Integer[] getWinningFields();

}

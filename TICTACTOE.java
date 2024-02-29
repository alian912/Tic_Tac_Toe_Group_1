import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.Position;
public class TICTACTOE 
{
    private static int[][] board = new int[3][3]; // 1: X, -1: O, 0: blank
    private int cWins = 0; //computer wins
    private int hWins = 0; //human wins
    private int position;
    public static void main(String[] args) 
    {
        Board board1 = new Board();
        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                board[i][j] = 0;
            }
        }

        Scanner input = new Scanner(System.in);
    
    }
    
    public static boolean hasWon(int[][] board)
    {
        boolean result = false;
        
        for (int i = 0; i < 3; i++) { // 3 possible configurations for a win
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                result = true;
            }
        }

        if ((board [0][0] == board[1][1] && board[0][0] == board[2][2]) || (board[0][2] == board[1][1] && board[0][2] == board[0][2]))
            result = true;


        return result;
    }

    public static boolean freeSpace(int position){
        boolean result = false;
        int x = (position-1)%3 , y = (position-1)/3;
        return result;
    }
}
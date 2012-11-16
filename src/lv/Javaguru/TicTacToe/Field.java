/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.Javaguru.TicTacToe;

/**
 *
 * @author Vitalij
 */
public class Field {
    
   private static int Crust =1;
    private static int Null = 2;
    private static int Space = 0;
    private static int win_lenght = 3;
    
    public int board[][]=new int[2][2];
    
    public boolean isThisCellEmpty(int x, int y)
    {
        return(board[x][y]==Space);
    }
    
    public boolean IsThisCoordinatesIsInRange(int x, int y)
    {
        return((x<=2) && (y<=2) && (x>0) && (y>0));     
    }
    public boolean isThisValidCell(int x, int y)
    {
        return( (IsThisCoordinatesIsInRange(x, y)) && (isThisCellEmpty(x, y)));
    }
    public void drawBoard()
    {
        System.out.println(" "+" "+"1"+" "+"2"+" "+" 3");
        
        for(int i=0;i<3;i++)
        {
            System.out.println((i+1)+" ");
            for(int j=0;j<3;j++)
            {
                System.out.println(board[i][j]+" ");
            }
            System.out.println();        }
    }
    
    public void clearBoard()
    {
        for(int i=0;i<3;i++)
          for(int j=0;j<3;j++)
        {
            board[i][j]=Space;
        }
            
    }
    public void fillCell(int x, int y)
    {
        int value=0;          // opredelitj kakoi znak stavitj
        board[x][y]=value;
        
    }
}

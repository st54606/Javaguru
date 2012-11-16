/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.Javaguru;

/**
 *
 * @author Vitalij
 */
public class Field {
    Field field = new Field();
    int[][] playground;
    
    public void FillField()
    {
        
        
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            {
                field.playground[i][j]=0;
            }
    }
    
}

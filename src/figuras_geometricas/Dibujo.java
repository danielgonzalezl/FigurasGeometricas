/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras_geometricas;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Daniel
 */
public class Dibujo {
    public static void Hacerlinea (Graphics g, int x1, int y1, int x2, int y2)
    {
        g.setColor(Color.red);
        g.drawLine(x1, y1, x2, y2);
    }    
    
    public static void HacerCuadro(Graphics g, int x, int y, int ancho, int alto)
    {
        g.setColor(Color.BLUE);
        g.drawRect(x, y, ancho, alto);
    }
    
    public static void HacerCirculo(Graphics g, int x, int y, int x1, int y1)
    {
        g.setColor(Color.PINK);
        g.drawOval(x, y, x1, y1);
}

    public static void HacerRectangulo(Graphics g, int x, int y, int x1, int y1)
    {
        g.setColor(Color.GREEN);
        g.drawRect(x, y, x1, y1);
        
}
   
    public static void HacerElipse(Graphics g, int x, int y, int x1, int y1 ) 
     {
         g.setColor(Color.YELLOW);
        g.drawOval(x, y, x1, y1);
    }
   
        }


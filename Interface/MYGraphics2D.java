/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sun.awt.image.ImageAccessException;

/**
 *
 * @author Nelson
 */
public class MYGraphics2D extends JPanel{

    Graphics2D graphics2D;
    BufferedImage bufferImage;
    BufferedImage bufferSubimage;
    FirstWindows first = new FirstWindows();
    public MYGraphics2D() throws IOException {
        super();
        this.setPreferredSize(new Dimension(800, 600));
        bufferImage = ImageIO.read(new FileInputStream("C:\\Users\\Emmanuel\\Pictures\\captain-america-civil_war_movie (1).jpg"));
    } // constructor
    //\\beneficio comple II.png"
    private void init(Graphics2D graphics2D){       
        //diferente con respecto a graphics
        AffineTransform toCenterAt = new AffineTransform();
        toCenterAt.translate(this.getWidth()/2, this.getHeight()/2);
        graphics2D.setTransform(toCenterAt);
        
        //para rotar
        AffineTransform rotation = graphics2D.getTransform();
        
        //manejo de imagenes
        rotation.rotate(Math.toRadians(-40));
        graphics2D.drawImage(bufferImage, 0, 0, null);
        
        // subimagen
//        AffineTransform rotateSubimage = new AffineTransform();
//        rotateSubimage.rotate(Math.toRadians(50));
//        bufferSubimage = bufferImage.getSubimage(0, 0, 110, 93);
//        graphics2D.drawImage(bufferSubimage, rotateSubimage, null);           
        
        //BufferedImage
        System.out.println("Image dimensions: \n Width: " + bufferImage.getWidth() + " - Height: " + bufferImage.getHeight());
    }
    
    @Override
    protected void paintComponent(Graphics g){        
        super.paintComponent(g);
        
        graphics2D = (Graphics2D)g;
        this.init(graphics2D);
        for (int y = 0; y < bufferImage.getHeight(); y += 50) {
            g.drawLine(0, y, bufferImage.getWidth(), y);
        }
        for (int x = 0; x < bufferImage.getWidth(); x += 50) {
            g.drawLine(x, 0, x, bufferImage.getHeight());
        }
    } // paintComponents
    
    
    public static void main(String[] args) throws IOException {
        JFrame jframe=new JFrame("Graphics3D");
        jframe.setContentPane(new MYGraphics2D());
        //jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        //jframe.setResizable(false);
        //jframe.setLocation(150, 100);
        jframe.setVisible(true);        
    } // main
    
    
} // class MYGraphics2D

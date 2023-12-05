/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andro;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author ThinkPad
 */
public class Bruno extends JFrame {
     Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
    private Container konten = getContentPane();
    private Mars datar1 = new Mars();

public Bruno()
{
    super("FLOWER BUCKET");
    setVisible(true);
    setSize(300, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    this.setLocationRelativeTo(null);
    konten.add(datar1);
}

  public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (UnsupportedLookAndFeelException e)
        {
        }
        catch(ClassNotFoundException e)
        {
        }
        catch(InstantiationException e)
        {
        }
        catch(IllegalAccessException e)
        {
        }
        new Bruno();
        }
}
    
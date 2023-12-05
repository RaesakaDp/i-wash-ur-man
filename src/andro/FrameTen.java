/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andro;

import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager.*;

/**
 *
 * @author ThinkPad
 */
public class FrameTen extends JFrame {
 Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();
    private Container konten = getContentPane();
    private Ten datar = new Ten();

public FrameTen()
    {
        super("ANDROID");
        setVisible(true);
//        setSize(320,450);
        setSize(650, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        this.setLocationRelativeTo(null);
        konten.add(datar);
//        konten.add(datar);
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
        new FrameTen();
        }
    }    

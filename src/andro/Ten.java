/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andro;

import java.awt.*;
import javax.swing.*;
import javax.swing.UIManager.*;
import java.awt.Color;
import java.awt.Dimension;
//import java.awt.geom.Ellipse2D;
//import java.awt.geom.GeneralPath;
import java.awt.geom.*;
import javax.swing.JPanel;

/**
 *
 * @author ThinkPad
 */
public class Ten extends Canvas{
     public Ten(){
             setPreferredSize(new Dimension (300, 500));
           setBackground(Color.BLACK);

    }
    public void paint (Graphics g){
            super.paint(g);
            
            Graphics2D gd = (Graphics2D) g.create();
            g.setColor(Color.white);
            g.setFont(new Font("PROXIMANOVA", Font.PLAIN,14));
            g.drawString("Nama : Raesaka Dp \u2502 Tugas 2D", 0, 30);
            g.drawString("No/Kelas : 26 / XII RPL 1", 0, 50);
            
            
            
        //badanbesar BAPAK
        g.setColor(Color.white);
        g.fillRect(130, 150, 100, 100);
        g.fillOval(140, 220, 70, 40);

        // oval badan bawah
        g.setColor(Color.white);
        g.fillOval(130,230,30,30);
        g.fillOval(200,230,30,30);
        
        //kepala
        g.setColor(Color.white);
        g.fillOval(130, 100, 100, 100);
        g.setColor(Color.black);
        g.fillRect(164, 135, 30, 5);
        //kumiskiri
        g.fillOval(161, 135, 5, 5);
        g.fillOval(160, 134, 5, 5);
        g.fillOval(159, 133, 5, 5);
        g.fillOval(158, 132, 5, 5);
        g.fillOval(160, 130, 5, 5);
        g.fillOval(161, 130, 5, 5);
//        g.fillOval(162, 130, 5, 5);
        
        //kumiskanan
        g.fillOval(191, 135, 5, 5);
        g.fillOval(192, 134, 5, 5);
        g.fillOval(193, 133, 5, 5);
        g.fillOval(194, 132, 5, 5);
        g.fillOval(193, 130, 5, 5);
        g.fillOval(192, 130, 5, 5);
//        g.fillOval(191, 129, 5, 5);

        //Mata 
        g.setColor(Color.BLACK);
        g.fillOval(155, 120, 8, 8);
        g.fillOval(195, 120, 8, 8);
        
        //sungut kiri
        g.setColor(Color.WHITE);
        g.fillOval(160, 105, 5, 5);
        g.fillOval(159, 103, 5, 5);
        g.fillOval(158, 102, 5, 5);
        g.fillOval(157, 101, 5, 5);
        g.fillOval(156, 100, 5, 5);
        g.fillOval(155, 99, 5, 5);
        g.fillOval(154, 98, 5, 5);
        g.fillOval(153, 97, 5, 5);
        g.fillOval(152, 96, 5, 5);
        g.fillOval(151, 95, 5, 5);
        g.fillOval(150, 94, 5, 5);
        g.fillOval(149, 93, 5, 5);
        g.fillOval(148, 92, 5, 5);
        g.fillOval(147, 91, 5, 5);
        g.fillOval(146, 90, 5, 5);
        
        //sungut kanan
        g.setColor(Color.white);
        g.fillOval(190,105,5,5);
        g.fillOval(191,103,5,5);
        g.fillOval(192,102,5,5);
        g.fillOval(193,101,5,5);
        g.fillOval(194,100,5,5);
        g.fillOval(195,99,5,5);
        g.fillOval(196,98,5,5);
        g.fillOval(197,97,5,5);
        g.fillOval(198,96,5,5);
        g.fillOval(199,95,5,5);
        g.fillOval(200,94,5,5);
        g.fillOval(201,93,5,5);
        g.fillOval(202,92,5,5);
        g.fillOval(203,91,5,5);
        g.fillOval(204,90,5,5);
        
        //gulu
        g.setColor(Color.black);
        g.fillRect(130, 150, 100, 5);
        
        //tangan BESAR BAPAK KIRI
        g.setColor(Color.white);
        g.fillRect(105, 170, 20, 60);
        g.fillOval(105, 160, 20, 20);
        g.fillOval(105, 218, 20, 20);
        
        g.drawOval(100, 238, 30, 30);
        g.setColor(Color.RED);
        g.fillOval(103, 241, 25, 25);
        
        
        //tangan L
        g.setColor(Color.white);
        g.fillRect(235, 170, 20, 60);
        g.fillOval(235, 160, 20, 20);
        g.fillOval(235, 218, 20, 20);

        
        
        //kaki R
        g.setColor(Color.white);
        g.fillRect(150, 230, 20, 60);
        g.fillRect(190, 230, 20, 60);
        
        //OVAL SIKIL
        g.setColor(Color.white);
        g.fillOval(150, 275, 20, 20);
        g.fillOval(190, 275, 20, 20);
        
        //badankecil 2
        g.setColor(Color.white);
        g.fillRect(300, 170, 80, 80);
        g.fillOval(315, 240, 50, 20);
        g.fillOval(300,230,30,30);
        g.fillOval(350,230,30,30);

        //sungut kiri
        g.setColor(Color.WHITE);
        g.fillOval(297, 125, 5, 5);
        g.fillOval(298, 125, 5, 5);
        g.fillOval(299, 125, 5, 5);
        g.fillOval(300, 125, 5, 5);
        g.fillOval(301, 125, 5, 5);
        g.fillOval(302, 125, 5, 5);
        g.fillOval(303, 125, 5, 5);
        g.fillOval(304, 125, 5, 5);
        g.fillOval(305, 125, 5, 5);
        g.fillOval(306, 125, 5, 5);
        g.fillOval(307, 125, 5, 5);
        g.fillOval(308, 126, 5, 5);
        g.fillOval(309, 127, 5, 5);
        g.fillOval(310, 128, 5, 5);
        g.fillOval(311, 129, 5, 5);
        g.fillOval(312, 130, 5, 5);
        g.fillOval(313, 131, 5, 5);
        g.fillOval(314, 132, 5, 5);
        g.fillOval(315, 133, 5, 5);
        
        //sungut kanan
        g.setColor(Color.WHITE);
        g.fillOval(374, 119, 5, 5);
        g.fillOval(373, 120, 5, 5);
        g.fillOval(372, 121, 5, 5);
        g.fillOval(371, 122, 5, 5);
        g.fillOval(370, 123, 5, 5);
        g.fillOval(369, 124, 5, 5);
        g.fillOval(368, 125, 5, 5);
        g.fillOval(367, 126, 5, 5);
        g.fillOval(366, 127, 5, 5);
        g.fillOval(365, 128, 5, 5);
        g.fillOval(364, 129, 5, 5);
        g.fillOval(363, 130, 5, 5);
        g.fillOval(362, 131, 5, 5);
        g.fillOval(361, 134, 5, 5);
        g.fillOval(360, 133, 5, 5);
        
        //kepala
        g.setColor(Color.white);
        g.fillOval(300, 130, 80, 80);
        
        //gulu
        g.setColor(Color.black);
        g.fillRect(300, 170, 100, 5);
        
        //Mata 
        g.setColor(Color.BLACK);
        g.fillOval(325, 150, 8, 8);
        g.fillOval(350, 150, 8, 8);
        
        //kaki 
        g.setColor(Color.white);
        g.fillRect(315, 230, 20, 60);
        g.fillRect(350, 230, 20, 60);
        
        //OVAL SIKIL
        g.setColor(Color.white);
        g.fillOval(315, 275, 20, 20);
        g.fillOval(350, 275, 20, 20);
        
        //tangan R
        g.setColor(Color.white);
        g.fillRect(385, 180, 20, 50);
        g.fillOval(385, 175, 20, 20);
        g.fillOval(385, 218, 20, 20);
        
        //tangan L
        g.setColor(Color.white);
        g.fillRect(275, 180, 20, 50);
        g.fillOval(275, 175, 20, 20);
        g.fillOval(275, 218, 20, 20);

        

        //badankecillagi 3
        g.setColor(Color.white);
        g.fillRect(434, 185, 65, 65);
        g.fillOval(439, 240, 50, 20);
        g.fillOval(434,240,20,20);
        g.fillOval(479,240,20,20);

        //kepala
        g.setColor(Color.white);
        g.fillOval(434, 150, 65, 65);

        //gulu
        g.setColor(Color.black);
        g.fillRect(434, 180, 100, 5);
        
        //kaki 
        g.setColor(Color.white);
        g.fillRect(439, 230, 20, 60);
        g.fillRect(471, 230, 20, 60);

        //OVAL SIKIL
        g.setColor(Color.white);
        g.fillOval(439, 275, 20, 20);
        g.fillOval(471, 275, 20, 20);
        
        //tangan L
        g.setColor(Color.white);
        g.fillRect(410, 193, 20, 40);
        g.fillOval(410, 184, 20, 20);
        g.fillOval(410, 220, 20, 20);

        //tangan R
        g.setColor(Color.white);
        g.fillRect(504, 193, 20, 40);
        g.fillOval(504, 184, 20, 20);
        g.fillOval(504, 220, 20, 20);
        
        //Mata 
        g.setColor(Color.BLACK);
        g.fillOval(455, 160, 8, 8);
        g.fillOval(470, 160, 8, 8);
        
        //sungut kiri
        g.setColor(Color.WHITE);
        g.fillOval(435, 145, 5, 5);
        g.fillOval(436, 146, 5, 5);
        g.fillOval(437, 147, 5, 5);
        g.fillOval(438, 148, 5, 5);
        g.fillOval(439, 149, 5, 5);
        g.fillOval(440, 150, 5, 5);
        g.fillOval(441, 151, 5, 5);
        g.fillOval(442, 152, 5, 5);
        g.fillOval(443, 153, 5, 5);
        g.fillOval(444, 154, 5, 5);
        g.fillOval(445, 155, 5, 5);
        g.fillOval(446, 156, 5, 5);
        g.fillOval(447, 157, 5, 5);
        g.fillOval(448, 158, 5, 5);
        g.fillOval(449, 159, 5, 5);
        
        //sungut kanan
        g.setColor(Color.WHITE);
        g.fillOval(496, 145, 5, 5);
        g.fillOval(495, 146, 5, 5);
        g.fillOval(494, 147, 5, 5);
        g.fillOval(493, 148, 5, 5);
        g.fillOval(492, 149, 5, 5);
        g.fillOval(491, 150, 5, 5);
        g.fillOval(490, 151, 5, 5);
        g.fillOval(489, 152, 5, 5);
        g.fillOval(488, 153, 5, 5);
        g.fillOval(487, 154, 5, 5);
        g.fillOval(486, 155, 5, 5);
        g.fillOval(485, 156, 5, 5);
        g.fillOval(484, 157, 5, 5);
        g.fillOval(483, 158, 5, 5);
        g.fillOval(482, 159, 5, 5);
        
        //nisan
        g.setColor(Color.white);
        g.fillOval(150, 349, 100, 131);
        g.fillRect(153, 392, 95, 120);
        g.setColor(Color.GRAY);
        g.fillOval(155, 400, 340, 150);
        
        //nisandalam
        g.setColor(Color.DARK_GRAY);
        g.fillOval(154, 360, 93, 131);
        g.fillRect(157, 405, 88, 120);
//        g.setColor(Color.green);
        g.setColor(new Color(102,51,0));
        g.fillRect(0, 450, 900, 150);
        
    }
}

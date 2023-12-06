/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andro;

import java.awt.*;
import java.applet.Applet;
import javax.swing.*;
import javax.swing.UIManager.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.*;
import javax.swing.JPanel;

/**
 *
 * @author ThinkPad
 */
public class Mars extends Canvas{
    public Mars(){
        setPreferredSize(new Dimension (300,500));
        setBackground(Color.WHITE);
    }
    
    public void paint (Graphics g){
        super.paint(g);
        Graphics2D gd = (Graphics2D) g.create();
        
//        Warna Butuh
        Color daunpetang=new Color(0,128,0); 
        Color bungamerah=new Color(220,20,60);
        Color MidFlower=new Color(225,215,0);
        Color Pita=new Color(199,21,133);
        Color bungapink=new Color(255,182,193);
        Color bungapink2=new Color(255,192,203);
        
        
        //linekiribuket
        g.setColor(Color.darkGray);
//        g.fillRect(200, 250, 100, 100);
        g.fillRect(70, 258, 5, 5);
        g.fillRect(71, 260, 5, 5);
        g.fillRect(72, 262, 5, 5);
        g.fillRect(74, 264, 5, 5);
        g.fillRect(75, 266, 5, 5);
        g.fillRect(76, 268, 5, 5);
        g.fillRect(78, 270, 5, 5);
        g.fillRect(79, 272, 5, 5);
        g.fillRect(80, 274, 5, 5);
        g.fillRect(82, 276, 5, 5);
        g.fillRect(83, 278, 5, 5);
        g.fillRect(84, 280, 5, 5);
        g.fillRect(86, 282, 5, 5);
        g.fillRect(87, 284, 5, 5);
        g.fillRect(88, 286, 5, 5);
        g.fillRect(90, 288, 5, 5);
        g.fillRect(91, 290, 5, 5);
        g.fillRect(92, 292, 5, 5);
        g.fillRect(94, 294, 5, 5);
        g.fillRect(95, 296, 5, 5);
        g.fillRect(96, 298, 5, 5);
        g.fillRect(98, 300, 5, 5);
        g.fillRect(100, 302, 5, 5);
        g.fillRect(101, 304, 5, 5);
        g.fillRect(102, 306, 5, 5);
        g.fillRect(104, 308, 5, 5);
        g.fillRect(105, 310, 5, 5);
        g.fillRect(106, 312, 5, 5);
        g.fillRect(108, 314, 5, 5);
        g.fillRect(109, 316, 5, 5);
        g.fillRect(110, 318, 5, 5);
        g.fillRect(112, 320, 5, 5);
        g.fillRect(113, 322, 5, 5);
        g.fillRect(114, 324, 5, 5);
        g.fillRect(116, 326, 5, 5);
        g.fillRect(117, 328, 5, 5);
        g.fillRect(118, 330, 5, 5);
        g.fillRect(120, 332, 5, 5);
        g.fillRect(121, 334, 5, 5);
        g.fillRect(122, 336, 5, 5);
        g.fillRect(124, 338, 5, 5);
        g.fillRect(125, 340, 5, 5);
        g.fillRect(126, 342, 5, 5);
        g.fillRect(128, 342, 5, 5);
        g.fillRect(129, 344, 5, 5);
        g.fillRect(130, 346, 5, 5);
        g.fillRect(132, 348, 5, 5);
        g.fillRect(133, 350, 5, 5);
        g.fillRect(134, 352, 5, 5);
        g.fillRect(136, 354, 5, 5);
        g.fillRect(137, 356, 5, 5);
        g.fillRect(138, 358, 5, 5);
        
        //kotakpita
        g.fillRect(138, 362, 5, 5);
        g.fillRect(138, 364, 5, 5);
        g.fillRect(138, 366, 5, 5);
        g.fillRect(138, 368, 5, 5);
        g.fillRect(138, 370, 5, 5);
        g.fillRect(138, 372, 5, 5);
        g.fillRect(138, 374, 5, 5);
        g.fillRect(138, 376, 5, 5);
        g.fillRect(138, 378, 5, 5);
        g.fillRect(140, 378, 5, 5);
        g.fillRect(142, 378, 5, 5);
        g.fillRect(144, 378, 5, 5);
        g.fillRect(146, 378, 5, 5);
        g.fillRect(148, 378, 5, 5);
        g.fillRect(150, 378, 5, 5);
        g.fillRect(152, 378, 5, 5);
        g.fillRect(154, 378, 5, 5);
        g.fillRect(156, 378, 5, 5);
        g.fillRect(158, 378, 5, 5);
        g.fillRect(158, 376, 5, 5);
        g.fillRect(158, 374, 5, 5);
        g.fillRect(158, 372, 5, 5);
        g.fillRect(158, 370, 5, 5);
        g.fillRect(158, 368, 5, 5);
        g.fillRect(158, 366, 5, 5);
        g.fillRect(158, 364, 5, 5);
        g.fillRect(158, 362, 5, 5);
        

        g.fillRect(156, 362, 5, 5);
        g.fillRect(154, 362, 5, 5);
        g.fillRect(152, 362, 5, 5);
        g.fillRect(150, 362, 5, 5);
        g.fillRect(148, 362, 5, 5);
        g.fillRect(146, 362, 5, 5);
        g.fillRect(144, 362, 5, 5);
        g.fillRect(142, 362, 5, 5);
        g.fillRect(140, 362, 5, 5);
        
        g.fillRect(140, 360, 5, 5);
        g.fillRect(138, 360, 5, 5);
        g.fillRect(136, 360, 5, 5);
        g.fillRect(134, 360, 5, 5);
        g.fillRect(132, 360, 5, 5);
        g.fillRect(130, 360, 5, 5);
        
        g.fillRect(132, 355, 5, 5);
        g.fillRect(130, 355, 5, 5);
        g.fillRect(128, 355, 5, 5);
        g.fillRect(126, 355, 5, 5);
        g.fillRect(124, 355, 5, 5);
        g.fillRect(122, 355, 5, 5);
        g.fillRect(120, 355, 5, 5);
        g.fillRect(118, 355, 5, 5);
        g.fillRect(116, 355, 5, 5);
        g.fillRect(114, 355, 5, 5);
        
        g.fillRect(110, 358, 5, 5);
        g.fillRect(110, 360, 5, 5);
        g.fillRect(110, 362, 5, 5);
        g.fillRect(110, 364, 5, 5);
        g.fillRect(110, 366, 5, 5);
        g.fillRect(110, 368, 5, 5);
        
        g.fillRect(112, 370, 5, 5);
        g.fillRect(114, 370, 5, 5);
       
        g.fillRect(110, 372, 5, 5);
        g.fillRect(110, 374, 5, 5);
        g.fillRect(110, 376, 5, 5);
        g.fillRect(110, 378, 5, 5);
        g.fillRect(110, 380, 5, 5);
        g.fillRect(110, 382, 5, 5);
       
        g.fillRect(132, 385, 5, 5);
        g.fillRect(130, 385, 5, 5);
        g.fillRect(128, 385, 5, 5);
        g.fillRect(126, 385, 5, 5);
        g.fillRect(124, 385, 5, 5);
        g.fillRect(122, 385, 5, 5);
        g.fillRect(120, 385, 5, 5);
        g.fillRect(118, 385, 5, 5);
        g.fillRect(116, 385, 5, 5);
        g.fillRect(114, 385, 5, 5);
        
        g.fillRect(140, 382, 5, 5);
        g.fillRect(138, 382, 5, 5);
        g.fillRect(136, 382, 5, 5);
        g.fillRect(134, 382, 5, 5);
        g.fillRect(132, 382, 5, 5);
        g.fillRect(130, 382, 5, 5);
        
        g.fillRect(138, 370, 5, 5);
        g.fillRect(136, 370, 5, 5);
        g.fillRect(134, 370, 5, 5);
        g.fillRect(132, 370, 5, 5);
        g.fillRect(130, 370, 5, 5);
        g.fillRect(128, 370, 5, 5);
        
        //kananpita
        g.fillRect(158, 382, 5, 5);
        g.fillRect(160, 382, 5, 5);
        g.fillRect(162, 382, 5, 5);
        g.fillRect(164, 382, 5, 5);
        g.fillRect(166, 382, 5, 5);
        g.fillRect(168, 382, 5, 5);
        
        g.fillRect(166, 385, 5, 5);
        g.fillRect(168, 385, 5, 5);
        g.fillRect(170, 385, 5, 5);
        g.fillRect(172, 385, 5, 5);
        g.fillRect(174, 385, 5, 5);
        g.fillRect(176, 385, 5, 5);
        g.fillRect(178, 385, 5, 5);
        g.fillRect(180, 385, 5, 5);
        g.fillRect(182, 385, 5, 5);
        g.fillRect(184, 385, 5, 5);
        
        g.fillRect(188, 382, 5, 5);
        g.fillRect(188, 380, 5, 5);
        g.fillRect(188, 378, 5, 5);
        g.fillRect(188, 376, 5, 5);
        g.fillRect(188, 374, 5, 5);
        g.fillRect(188, 372, 5, 5);
      
        g.fillRect(184, 370, 5, 5);
       
        g.fillRect(188, 370, 5, 5);
        g.fillRect(188, 368, 5, 5);
        g.fillRect(188, 366, 5, 5);
        g.fillRect(188, 364, 5, 5);
        g.fillRect(188, 362, 5, 5);
        g.fillRect(188, 360, 5, 5);
        
        g.fillRect(166, 356, 5, 5);
        g.fillRect(168, 356, 5, 5);
        g.fillRect(170, 356, 5, 5);
        g.fillRect(172, 356, 5, 5);
        g.fillRect(174, 356, 5, 5);
        g.fillRect(176, 356, 5, 5);
        g.fillRect(178, 356, 5, 5);
        g.fillRect(180, 356, 5, 5);
        g.fillRect(182, 356, 5, 5);
        g.fillRect(184, 356, 5, 5);
        
        g.fillRect(158, 360, 5, 5);
        g.fillRect(160, 360, 5, 5);
        g.fillRect(162, 360, 5, 5);
        g.fillRect(164, 360, 5, 5);
        g.fillRect(166, 360, 5, 5);
        g.fillRect(168, 360, 5, 5);
        
        g.fillRect(162, 370, 5, 5);
        g.fillRect(164, 370, 5, 5);
        g.fillRect(166, 370, 5, 5);
        g.fillRect(168, 370, 5, 5);
        
        //buketkanan
//        g.setColor(Color.RED);
        g.fillRect(158, 362, 5, 5);
        g.fillRect(159, 360, 5, 5);
        g.fillRect(160, 358, 5, 5);
        g.fillRect(162, 356, 5, 5);
        g.fillRect(163, 354, 5, 5);
        g.fillRect(164, 352, 5, 5);
        g.fillRect(166, 350, 5, 5);
        g.fillRect(167, 348, 5, 5);
        g.fillRect(168, 346, 5, 5);
        g.fillRect(170, 344, 5, 5);
        g.fillRect(171, 342, 5, 5);
        g.fillRect(172, 340, 5, 5);
        g.fillRect(174, 338, 5, 5);
        g.fillRect(175, 336, 5, 5);
        g.fillRect(176, 334, 5, 5);
        g.fillRect(178, 332, 5, 5);
        g.fillRect(179, 330, 5, 5);
        g.fillRect(180, 328, 5, 5);
        g.fillRect(182, 326, 5, 5);
        g.fillRect(183, 324, 5, 5);
        g.fillRect(184, 322, 5, 5);
        g.fillRect(186, 320, 5, 5);
        g.fillRect(187, 318, 5, 5);
        g.fillRect(188, 316, 5, 5);
        g.fillRect(190, 314, 5, 5);
        g.fillRect(191, 312, 5, 5);
        g.fillRect(192, 310, 5, 5);
        g.fillRect(194, 308, 5, 5);
        g.fillRect(195, 306, 5, 5);
        g.fillRect(196, 304, 5, 5);
        g.fillRect(198, 302, 5, 5);
        g.fillRect(199, 300, 5, 5);
        g.fillRect(200, 298, 5, 5);  
        g.fillRect(202, 296, 5, 5);
        g.fillRect(203, 294, 5, 5);
        g.fillRect(204, 292, 5, 5);
        g.fillRect(206, 290, 5, 5);
        g.fillRect(207, 288, 5, 5);
        g.fillRect(208, 286, 5, 5);
        g.fillRect(210, 284, 5, 5);
        g.fillRect(211, 282, 5, 5);
        g.fillRect(212, 280, 5, 5);
        g.fillRect(214, 278, 5, 5);
        g.fillRect(215, 276, 5, 5);
        g.fillRect(216, 274, 5, 5);
        g.fillRect(218, 272, 5, 5);
        g.fillRect(219, 270, 5, 5);
        g.fillRect(220, 268, 5, 5);
        g.fillRect(222, 266, 5, 5);
        g.fillRect(223, 264, 5, 5);
        g.fillRect(224, 262, 5, 5);
        g.fillRect(226, 260, 5, 5);
        g.fillRect(227, 258, 5, 5);
       
//        bawah
//g.setColor(Color.red);
        g.fillRect(156, 382, 5, 5);
        g.fillRect(156, 384, 5, 5);
        
        g.fillRect(160, 386, 5, 5);
        g.fillRect(160, 388, 5, 5);
        
        g.fillRect(164, 390, 5, 5);
        g.fillRect(164, 392, 5, 5);
        
        g.fillRect(168, 394, 5, 5);
        g.fillRect(168, 396, 5, 5);
        
        g.fillRect(172, 398, 5, 5);
        g.fillRect(172, 400, 5, 5);
        
        g.fillRect(176, 402, 5, 5);
        g.fillRect(176, 404, 5, 5);
        
        g.fillRect(172, 406, 5, 5);
        g.fillRect(172, 408, 5, 5);
        
        g.fillRect(168, 410, 5, 5);
        g.fillRect(168, 412, 5, 5);
        
        g.fillRect(164, 414, 5, 5);
        g.fillRect(164, 416, 5, 5);
        
        g.fillRect(162, 416, 5, 5);
        g.fillRect(160, 416, 5, 5);
        g.fillRect(158, 416, 5, 5);
        g.fillRect(156, 416, 5, 5);
        g.fillRect(154, 416, 5, 5);
        g.fillRect(152, 416, 5, 5);
        g.fillRect(150, 416, 5, 5);
        g.fillRect(148, 416, 5, 5);
        g.fillRect(146, 416, 5, 5);
        g.fillRect(144, 416, 5, 5);
        g.fillRect(142, 416, 5, 5);
        g.fillRect(140, 416, 5, 5);
        g.fillRect(138, 416, 5, 5);
        g.fillRect(136, 416, 5, 5);
        
        g.fillRect(140, 382, 5, 5);
        g.fillRect(140, 384, 5, 5);
        
        g.fillRect(136, 386, 5, 5);
        g.fillRect(136, 388, 5, 5);
        
        g.fillRect(132, 390, 5, 5);
        g.fillRect(132, 392, 5, 5);
        
        g.fillRect(128, 394, 5, 5);
        g.fillRect(128, 396, 5, 5);
        
        g.fillRect(124, 398, 5, 5);
        g.fillRect(124, 400, 5, 5);
        
        g.fillRect(120, 402, 5, 5);
        g.fillRect(120, 404, 5, 5);
        
        g.fillRect(124, 406, 5, 5);
        g.fillRect(124, 408, 5, 5);
        
        g.fillRect(128, 410, 5, 5);
        g.fillRect(128, 412, 5, 5);
        
        g.fillRect(132, 414, 5, 5);
        g.fillRect(132, 416, 5, 5);
        
//linebuket
//        g.fillRect(70, 258, 162, 5);
        //bunga1
        g.fillRect(70,254, 5,5);
        g.fillRect(70,256, 5,5);
        g.fillRect(70,258, 5,5);
        g.fillRect(70,260, 5,5);
        
        g.fillRect(72,250, 5,5);
        g.fillRect(74,248, 5,5);
        g.fillRect(76,246, 5,5);
        g.fillRect(78,244, 5,5);
        
        g.fillRect(80,244, 5,5);
        g.fillRect(82,244, 5,5);
        g.fillRect(84,244, 5,5);
        g.fillRect(86,244, 5,5);
        g.fillRect(88,244, 5,5);
        g.fillRect(90,244, 5,5);
        g.fillRect(92,244, 5,5);
        g.fillRect(94,244, 5,5);
        g.fillRect(96,244, 5,5);
        g.fillRect(98,244, 5,5);
        
        g.fillRect(102,248, 5,5);
        
        g.fillRect(104,252, 5,5);
        g.fillRect(104,254, 5,5);
        g.fillRect(104,256, 5,5);
        g.fillRect(104,258, 5,5);

        g.fillRect(104, 262, 5, 5);
        g.fillRect(102, 264, 5, 5);
        g.fillRect(100, 266, 5, 5);
        
        
        g.fillRect(80,270, 5,5);
        g.fillRect(82,270, 5,5);
        g.fillRect(84,270, 5,5);
        g.fillRect(86,270, 5,5);
        g.fillRect(88,270, 5,5);
        g.fillRect(90,270, 5,5);
        g.fillRect(92,270, 5,5);
        g.fillRect(94,270, 5,5);
        g.fillRect(96,270, 5,5);
        g.fillRect(98,270, 5,5);
  
        g.fillRect(76, 266, 5, 5);
        g.fillRect(72, 262, 5, 5);
        g.fillRect(68, 258, 5, 5);
        
        g.fillRect(104,248,5,5);
        g.fillRect(104,250,5,5);
        g.fillRect(104,252,5,5);
        g.fillRect(104,254,5,5);
        g.fillRect(104,256,5,5);
        g.fillRect(104,258,5,5);
        g.fillRect(104,260,5,5);
        g.fillRect(104,262,5,5);
        g.fillRect(104,264,5,5);

        g.fillRect(106,268, 5, 5);
        g.fillRect(108,270, 5, 5);
        
        g.fillRect(110,270,5,5);
        g.fillRect(112,270,5,5);
        g.fillRect(114,270,5,5);
        g.fillRect(116,270,5,5);
        g.fillRect(118,270,5,5);
        g.fillRect(120,270,5,5);
        g.fillRect(122,270,5,5);
        
        g.fillRect(126,270,5,5);
        g.fillRect(128,266,5,5);
        
        g.fillRect(130,248,5,5);
        g.fillRect(130,250,5,5);
        g.fillRect(130,252,5,5);
        g.fillRect(130,254,5,5);
        g.fillRect(130,256,5,5);
        g.fillRect(130,258,5,5);
        g.fillRect(130,260,5,5);
        g.fillRect(130,262,5,5);
        g.fillRect(130,264,5,5);
        
        g.fillRect(108,244,5,5);
        g.fillRect(110,244,5,5);
        g.fillRect(112,244,5,5);
        g.fillRect(114,244,5,5);
        g.fillRect(116,244,5,5);
        g.fillRect(118,244,5,5);
        g.fillRect(120,244,5,5);
        g.fillRect(122,244,5,5);
        g.fillRect(124,244,5,5);
        g.fillRect(126,244,5,5);
        g.fillRect(127,244,5,5);
        
        g.fillRect(106, 244, 5, 5);
        g.fillRect(104, 246, 5, 5);
        g.fillRect(100, 244, 5, 5);
        g.fillRect(96, 242, 5, 5);
       
        g.fillRect(94, 240, 5, 5);
        g.fillRect(94, 238, 5, 5);
        g.fillRect(94, 236, 5, 5);
        g.fillRect(94, 234, 5, 5);
        g.fillRect(94, 233, 5, 5);
        g.fillRect(94, 230, 5, 5);
        g.fillRect(94, 228, 5, 5);
        g.fillRect(94, 226, 5, 5);
        
        g.fillRect(98, 222,5,5);
        g.fillRect(100, 222,5,5);
        g.fillRect(102, 222,5,5);
        g.fillRect(104, 222,5,5);
        g.fillRect(106,222,5,5);
        g.fillRect(108,222,5,5);
        g.fillRect(110,222,5,5);
        
        g.fillRect(114, 226,5,5);
        g.fillRect(114, 228,5,5);
        g.fillRect(114, 230,5,5);
        g.fillRect(114, 232,5,5);
        g.fillRect(114, 234,5,5);
        g.fillRect(114, 236,5,5);
        g.fillRect(114, 238,5,5);
        g.fillRect(112, 240,5,5);
        g.fillRect(116, 240,5,5);
        
        g.fillRect(116, 230, 5,5);
        g.fillRect(118, 228,5,5);
        g.fillRect(120, 226,5,5);
        
        g.fillRect(122, 226,5,5);
        g.fillRect(124, 226,5,5);
        g.fillRect(126, 226,5,5);
        g.fillRect(128, 226,5,5);
        g.fillRect(130, 226,5,5);
        g.fillRect(132,226,5,5);
        g.fillRect(134,226,5,5);
        
        g.fillRect(138, 230,5,5);
        g.fillRect(138, 232,5,5);
        g.fillRect(138, 234,5,5);
        g.fillRect(138, 236,5,5);
        g.fillRect(138, 238,5,5);
        g.fillRect(138, 240,5,5);
        
        
        g.fillRect(136,244,5,5);
        g.fillRect(134,246,5,5);
        
        g.fillRect(138, 248,5,5);
        g.fillRect(140, 248,5,5);
        g.fillRect(142, 248,5,5);
        g.fillRect(144, 248,5,5);
        g.fillRect(146, 248,5,5);
        g.fillRect(148, 248,5,5);
        g.fillRect(150, 248,5,5);
        
        g.fillRect(152, 250, 5, 5);
        g.fillRect(154, 252, 5, 5);
        
        g.fillRect(158, 256,5,5);
        g.fillRect(158, 258,5,5);
        g.fillRect(158, 260,5,5);
        g.fillRect(158, 262,5,5);
        g.fillRect(158, 264,5,5);
        g.fillRect(158, 266,5,5);
        g.fillRect(158, 268,5,5);
        g.fillRect(158, 270,5,5);
        
        g.fillRect(154, 274,5,5);
        g.fillRect(152, 274,5,5);
        g.fillRect(150, 274,5,5);
        g.fillRect(148, 274,5,5);
        g.fillRect(146, 274,5,5);
        g.fillRect(144, 274,5,5);
        g.fillRect(142, 274,5,5);
        g.fillRect(140, 274,5,5);
        
        g.fillRect(137, 271,5,5);
        g.fillRect(136, 270,5,5);
        g.fillRect(134, 268,5,5);
        g.fillRect(132, 266,5,5);
        
        g.fillRect(137, 274,5,5);
        g.fillRect(137, 276,5,5);
        g.fillRect(137, 278,5,5);
        g.fillRect(137, 280,5,5);
        g.fillRect(137, 282,5,5);
        g.fillRect(137, 284,5,5);
        g.fillRect(137, 286,5,5);
        
        g.fillRect(132, 290,5,5);
        g.fillRect(130, 290,5,5);
        g.fillRect(128, 290,5,5);
        g.fillRect(126, 290,5,5);
        g.fillRect(124, 290,5,5);
        
        g.fillRect(120, 286,5,5);
        g.fillRect(118, 284,5,5);
        g.fillRect(116, 283,5,5);
        g.fillRect(114, 280,5,5);
        g.fillRect(114, 278,5,5);
        g.fillRect(114, 276,5,5);
        g.fillRect(114, 274,5,5);
        g.fillRect(114, 272,5,5);
        
        g.fillRect(92,272,5,5);
        g.fillRect(90,274,5,5);
        g.fillRect(90,276,5,5);
        g.fillRect(90,278,5,5);
        g.fillRect(90,280,5,5);
        g.fillRect(90,282,5,5);
        g.fillRect(90,284,5,5);
        g.fillRect(90,286,5,5);
        
        g.fillRect(92, 290,5,5);
        g.fillRect(94, 292,5,5);
        g.fillRect(96, 294,5,5);
        
        g.fillRect(100, 298,5,5);
        g.fillRect(102, 298,5,5);
        g.fillRect(104, 298,5,5);
        g.fillRect(106, 298,5,5);
        
        g.fillRect(110, 296,5,5 );
        g.fillRect(112, 294,5,5 );
        g.fillRect(114, 292,5,5 );
        g.fillRect(114, 290,5,5 );
        g.fillRect(114, 288,5,5 );
        g.fillRect(114, 286,5,5 );
        g.fillRect(114, 284,5,5 );
        
        
//        g.setColor(Color.red);
        g.fillRect(140, 228, 5, 5);
        g.fillRect(142, 226, 5, 5);
        g.fillRect(144, 224, 5, 5);
        g.fillRect(146, 222, 5, 5);
        g.fillRect(148, 220, 5, 5);
        g.fillRect(150, 218, 5, 5);
        
        g.fillRect(152, 216,5,5);
        g.fillRect(154, 216,5,5);
        g.fillRect(156, 216,5,5);
        
        g.fillRect(158,218,5,5);
        g.fillRect(158,220,5,5);
        g.fillRect(158,222,5,5);
        g.fillRect(158,224,5,5);
        g.fillRect(158,226,5,5);
        
        g.fillRect(154,228,5,5);
        g.fillRect(154,230,5,5);
        g.fillRect(154,232,5,5);
        g.fillRect(154,234,5,5);
        g.fillRect(154,236,5,5);
        g.fillRect(154,238,5,5);
        g.fillRect(154,240,5,5);
        g.fillRect(154,242,5,5);
        g.fillRect(154,244,5,5);
        
        g.fillRect(156,246,5,5);
        g.fillRect(158,246,5,5);
        g.fillRect(160,246,5,5);
        g.fillRect(162,246,5,5);
        g.fillRect(164,246,5,5);
 
//        g.setColor(Color.BLUE);
        g.fillRect(140, 286,5,5);
        g.fillRect(142, 288,5,5);
        g.fillRect(144, 290,5,5);
        g.fillRect(146, 292, 5, 5);
        g.fillRect(146, 294, 5, 5);
        g.fillRect(146, 296, 5, 5);
        
        g.fillRect(150, 300, 5, 5);
        g.fillRect(150, 302, 5, 5);
        g.fillRect(150, 304, 5, 5);
        g.fillRect(150, 306, 5, 5);
        
        g.fillRect(152, 310, 5, 5);
        g.fillRect(152, 312, 5, 5);
        g.fillRect(152, 314, 5, 5);
        g.fillRect(152, 316, 5, 5);
        g.fillRect(154, 312,5,5);
        
        g.fillRect(156, 310, 5, 5);
        g.fillRect(158, 308, 5, 5);
        
        g.fillRect(160, 304, 5, 5);
        g.fillRect(162, 302, 5, 5);
        
        g.fillRect(164, 298, 5, 5);
        g.fillRect(166, 296, 5, 5);
        
        g.fillRect(168, 292, 5, 5);
        g.fillRect(170, 290, 5, 5);
        
        g.fillRect(174, 288, 5, 5);
        g.fillRect(176, 286, 5, 5);
        
        g.fillRect(176,284,5,5);
        g.fillRect(176,282,5,5);
        g.fillRect(176,280,5,5);
        g.fillRect(176,278,5,5);
        g.fillRect(176,276,5,5);
        g.fillRect(176,274,5,5);
        g.fillRect(176,272,5,5);
        g.fillRect(176,270,5,5);
        g.fillRect(174,268,5,5);
        
        g.fillRect(170, 264, 5,5);
        g.fillRect(172, 264, 5,5);
        g.fillRect(174, 264, 5,5);
        g.fillRect(176, 264, 5,5);
        g.fillRect(178, 264, 5,5);
        
        g.fillRect(168, 260,5,5);
        g.fillRect(168, 258,5,5);
        g.fillRect(168, 256,5,5);
        g.fillRect(168, 254,5,5);
        g.fillRect(168, 252,5,5);
        g.fillRect(168, 250,5,5);
        g.fillRect(168, 248,5,5);
        
//        g.setColor(Color.yellow);
        g.fillRect(159, 274,5,5);
        g.fillRect(160, 276,5,5);
        g.fillRect(160, 278,5,5);
        
        g.fillRect(162, 280,5,5);
        g.fillRect(162, 282,5,5);
        g.fillRect(162, 284,5,5);
                
//        g.setColor(Color.red);
        g.fillRect(170, 244, 5,5);
        g.fillRect(172, 242, 5,5);
        g.fillRect(174, 240, 5,5);
        g.fillRect(176, 238, 5,5);
        
        g.fillRect(174, 232,5,5);
        g.fillRect(174, 230,5,5);
        g.fillRect(174, 228,5,5);
        g.fillRect(174, 226,5,5);
        g.fillRect(174, 224,5,5);
        g.fillRect(174, 222,5,5);
        g.fillRect(174, 220,5,5);
        g.fillRect(174, 218,5,5);
        g.fillRect(174, 216,5,5);
        
        g.fillRect(178, 236, 5, 5);
        g.fillRect(180, 236, 5, 5);
        g.fillRect(182, 236, 5, 5);
        g.fillRect(184, 236, 5, 5);
        g.fillRect(186, 236, 5, 5);
        g.fillRect(188, 236, 5, 5);
        
        
        //atas
//        g.setColor(Color.blue);
        g.fillRect(105,220,5,5);
        g.fillRect(105,218,5,5);
        g.fillRect(105,216,5,5);
        
        g.fillRect(102, 212,5,5);
        g.fillRect(102, 210, 5, 5);
        g.fillRect(102, 208, 5, 5);
        
        
        //bawah
        g.fillRect(68,256,5,5);
        g.fillRect(66,256,5,5);
        g.fillRect(64,256,5,5);
        
        g.fillRect(60,260,5,5);
        g.fillRect(58,260,5,5);
        g.fillRect(56,260,5,5);
        
        g.fillRect(52,264,5,5);
        g.fillRect(52,266,5,5);
        g.fillRect(52,268,5,5);
        
        g.fillRect(48,268,5,5);
        g.fillRect(48,270,5,5);
        g.fillRect(48,272,5,5);
        
        g.fillRect(44,274,5,5);
        g.fillRect(44,276,5,5);
        g.fillRect(44,278,5,5);
        
        g.fillRect(43,278,5,5);
        g.fillRect(42,278,5,5);
        
        g.fillRect(40,276,5,5);
        g.fillRect(40,274,5,5);
        g.fillRect(40,272,5,5);
        g.fillRect(40,270,5,5);
        g.fillRect(40,268,5,5);
        g.fillRect(40,266,5,5);
        g.fillRect(40,264,5,5);
        g.fillRect(40,262,5,5);
        g.fillRect(40,260,5,5);
        g.fillRect(40,258,5,5);
        g.fillRect(40,256,5,5);
        
        g.fillRect(44,252,5,5);
        g.fillRect(44,250,5,5);
        g.fillRect(44,248,5,5);
        g.fillRect(44,246,5,5);
        g.fillRect(44,244,5,5);
        
        g.fillRect(46,242,5,5);
        g.fillRect(48,240,5,5);
        g.fillRect(50,238,5,5);
        g.fillRect(52,236,5,5);
        
        g.fillRect(56,234,5,5);
        g.fillRect(58,232,5,5);
        g.fillRect(60,230,5,5);
        
        g.fillRect(62,228,5,5);
        g.fillRect(62,226,5,5);
        g.fillRect(62,224,5,5);
        
        g.fillRect(64,222,5,5);
        g.fillRect(66,220,5,5);
        g.fillRect(68,218,5,5);
        g.fillRect(70,216,5,5);
        
//        g.setColor(Color.red);
        g.fillRect(90,218,5,5);
        g.fillRect(90,216,5,5);
        g.fillRect(90,214,5,5);
        g.fillRect(92,212,5,5);
        g.fillRect(94,212,5,5);
        g.fillRect(96,212,5,5);
        g.fillRect(98,210,5,5);
        g.fillRect(100,208,5,5);
        
        g.fillRect(86,220,5,5);
        g.fillRect(84,222,5,5);
        g.fillRect(82,224,5,5);
        g.fillRect(80,226,5,5);
        g.fillRect(78,228,5,5);
        g.fillRect(76,230,5,5);
        g.fillRect(74,232,5,5);
        g.fillRect(72,234,5,5);
        
        
        
        g.fillRect(74,216,5,5);
        g.fillRect(74,214,5,5);
        g.fillRect(78,212,5,5);
        g.fillRect(80,212,5,5);
        g.fillRect(82,212,5,5);
        g.fillRect(84,212,5,5);
        g.fillRect(86,212,5,5);
        g.fillRect(88,212,5,5);
        
        g.fillRect(90,194,5,20);
        g.setColor(Color.yellow);
        g.fillRect(89,190,7,7);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(70,191,20,5);
        g.fillRect(70,194,5,10);
        g.fillRect(72,204,5,10);
        g.fillRect(74,210,5,5);
        
        g.fillRect(90,180,5,10);
        g.fillRect(88,165,5,15);
        g.fillRect(86,168,5,7);
        g.fillRect(82,172,5,7);
        g.fillRect(78,176,5,7);
        g.fillRect(74,180,5,7);
        g.fillRect(70,184,5,7);
        g.fillRect(92,162,5,7);
        g.fillRect(94,156,5,7);
        g.fillRect(96,162,5,7);
        g.fillRect(100,166,7,5);
        g.fillRect(102,168,7,5);
        
        g.fillRect(108,172,5,20);
        g.fillRect(96,191,5,5);
        g.fillRect(100,194,7,5);
        g.fillRect(104,198,15,5);
        g.fillRect(106, 204,5,5);
        g.fillRect(108, 202,5,5);
        g.fillRect(95,186,7,5);
        g.fillRect(98,182,7,5);
        g.fillRect(102,174,5,12);
        g.fillRect(104,174,5,5);
        g.fillRect(104,172,5,5);
        
        g.fillRect(108, 190,5,5);
        g.fillRect(110, 192,5,5);
        g.fillRect(112, 194,5,5);
        g.fillRect(114, 196,5,5);
        
        g.fillRect(118, 192, 10, 5);
        g.fillRect(126,182,5,15);
        g.fillRect(130,196,15,5);
        g.fillRect(145,182,5,15);
        g.fillRect(130,177,20,5);
        
        g.fillRect(126,172,5,10);
        g.fillRect(112,168,17,5);
        
        g.fillRect(136,155,5,25);
        g.fillRect(122,150,15,5);
        g.fillRect(120,154,5,15);
        g.fillRect(90,154,30,5);
        g.fillRect(86,156,5,5);
        g.fillRect(130,200,5,10);
        g.fillRect(140,200,5,10);
        g.fillRect(126,206,5,20);
        g.fillRect(144,208,5,10);
        g.fillRect(147,212,5,10);
        
       
        g.fillRect(135,146,20,5);
        g.fillRect(126,145,5,5);
        g.fillRect(88,142,40,5);
        g.fillRect(82,146,10,5);
        g.fillRect(76,150,10,5);
        g.fillRect(70,154,10,5);
        g.fillRect(68,158,5,10);
        g.fillRect(64,166,5,10);
        g.fillRect(60,174,5,25);
        g.fillRect(64,190,5,5);
        
//        g.setColor(Color.MAGENTA);
        g.fillRect(146,142,5,5);
        g.fillRect(149,138,10,5);
        g.fillRect(156,134,15,5);
        g.fillRect(168,138,10,5);
        
        g.fillRect(144,172,6,6);
        g.fillRect(148,168,6,6);
        g.fillRect(152,164,6,6);
        g.fillRect(156,159,6,7);
        
        g.fillRect(155,148,5,10);
        g.fillRect(158,155,6,6);
        g.fillRect(162,151,5,6);
        
        
        g.fillRect(166,147,10,5);
        g.fillRect(174,145,5,5);
        g.fillRect(176,152,5,15);
        g.fillRect(172,164,5,8);
        g.fillRect(164,170,10,5);
        g.fillRect(149,179,15,5);
        g.fillRect(159,174,5,5);
        g.fillRect(150,196,25,5);
        
        g.fillRect(160,212,15,5);
        g.fillRect(174,199,5,18);
        
        g.fillRect(180,264,10,5);
        g.fillRect(190,240,5,26);
        g.fillRect(193,236,10,5);
        g.fillRect(203,219,5,20);
        g.fillRect(162,224,15,5);
        g.fillRect(178,216,25,5);
        g.fillRect(191,255,8,5);
        g.fillRect(198,260,18,5);
        g.fillRect(214,244,5,18);
        
        g.fillRect(210,238,5,7);
        g.fillRect(207,232,5,7);
        g.fillRect(214,234,10,5);
        g.fillRect(224,230,5,5);
        g.fillRect(228,220,5,10);
        g.fillRect(208,212,5,10);
        g.fillRect(208,212,10,5);
        g.fillRect(218,210,10,5);
        g.fillRect(226,215,20,5);
        
        g.fillRect(211,265,15,5);
        g.fillRect(222,270,13,5);
        g.fillRect(234,274,5,13);
        g.fillRect(238,285,5,13);
        g.fillRect(242,295,5,13);
        g.fillRect(246,300,5,13);
        g.fillRect(250,281,5,22);
        g.fillRect(254,256,5,28);
        
        g.fillRect(233,229,5,5);
        g.fillRect(237,233,5,7);
        g.fillRect(242,238,5,15);
        g.fillRect(246,252,5,5);
        g.fillRect(251,255,5,5);
        
        g.fillRect(223,238,5,5);
        g.fillRect(227,242,5,5);
        g.fillRect(231,246,5,15);
        
        
        g.fillRect(190,194,5,22);
        g.fillRect(174,196,5,5);
        g.fillRect(178,192,5,5);
        g.fillRect(182,196,6,5);
        g.fillRect(186,200,5,5);
        g.fillRect(194,190,15,5);
        g.fillRect(208,194,5,10);
        g.fillRect(210,203,8,5);
        g.fillRect(216,207,5,5);
        
        
        g.fillRect(246,218,5,5);
        g.fillRect(250,222,5,5);
        g.fillRect(254,214,5,18);
        g.fillRect(250,185,5,30);
        g.fillRect(208,185,5,5);
        g.fillRect(213,181,5,5);
        g.fillRect(217,185,10,5);
        g.fillRect(226,189,10,5);
        g.fillRect(236,193,5,5);
        g.fillRect(246,176,5,10);
        g.fillRect(242,172,5,5);
        g.fillRect(217,168,25,5);
        g.fillRect(213,172,5,5);
        
        g.fillRect(203,176,15,5);
        g.fillRect(198,172,5,5);
        g.fillRect(193,177,5,5);
        g.fillRect(181,166,10,5);
        g.fillRect(189,181,5,10);
        g.fillRect(180,190,10,5);


        g.setColor(daunpetang);
        g.fillRect(190,190,5,5);
        
        g.setColor(Color.RED);
        g.fillRect(176,177,18,5);
        g.fillRect(174,174,5,5);
        g.fillRect(180,161,18,5);
        
        
        
        
    }
}

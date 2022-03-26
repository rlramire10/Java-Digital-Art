//Name: Rudy Ramirez
//Date: 5/26/21

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import javax.swing.JFrame;

public class Nightwing_Batman_Logo extends Canvas
{		
	public void paint(Graphics g)
	{
		//***************************************************
		//Nightwing Logo
		Polygon nightwing = new Polygon();
		
		//Add Points
		nightwing.addPoint(300, 180); //
		nightwing.addPoint(320, 160); //
		nightwing.addPoint(300, 160); //
		nightwing.addPoint(315, 145); //Head
		nightwing.addPoint(340, 145); //
		nightwing.addPoint(360, 180); //
		nightwing.addPoint(430, 80);  //
		
		nightwing.addPoint(600, 100); //Right Tip of Wing
		nightwing.addPoint(450, 110);
		nightwing.addPoint(425, 175);
		nightwing.addPoint(410, 162); //Top Right Spike
		nightwing.addPoint(420, 185);
		nightwing.addPoint(395, 247);
		nightwing.addPoint(375, 230); //Middle Right Spike
		nightwing.addPoint(390, 260);
		nightwing.addPoint(370, 310);
		nightwing.addPoint(360, 290); //Bottom Right Spike
		nightwing.addPoint(360, 330);
		
		nightwing.addPoint(330, 390); //Tip of Tail
		
		nightwing.addPoint(300, 330);
		nightwing.addPoint(300, 290); //Bottom Left Spike
		nightwing.addPoint(290, 310);
		nightwing.addPoint(270, 260);
		nightwing.addPoint(285, 230); //Middle Left Spike
		nightwing.addPoint(265, 247);
		nightwing.addPoint(240, 185);
		nightwing.addPoint(250, 162); //Top Left Spike
		nightwing.addPoint(235, 175);
		nightwing.addPoint(210, 110);
		nightwing.addPoint(60, 100);  //Left Tip of Wing
		nightwing.addPoint(230, 80);
		nightwing.addPoint(300, 180);
		
		//Draw Nightwing Polygon
		g.setColor(Color.blue);
		g.fillPolygon(nightwing);
		
		//***************************************************
		//Batman Logo
		Polygon batman_left_wing  = new Polygon();
		Polygon batman_right_wing = new Polygon();
		
		//Add Points
		//Left Wing
		batman_left_wing.addPoint(60, 100);
		batman_left_wing.addPoint(80, 110);
		batman_left_wing.addPoint(100, 120);
		batman_left_wing.addPoint(120, 140);
		batman_left_wing.addPoint(130, 160);
		batman_left_wing.addPoint(140, 180);
		batman_left_wing.addPoint(150, 200);
		batman_left_wing.addPoint(155, 220);
		batman_left_wing.addPoint(160, 240); //Middle Point
		batman_left_wing.addPoint(180, 250);
		batman_left_wing.addPoint(200, 260);
		batman_left_wing.addPoint(230, 280);
		batman_left_wing.addPoint(260, 300);
		batman_left_wing.addPoint(280, 320);
		batman_left_wing.addPoint(300, 340);
		batman_left_wing.addPoint(310, 350); //Tail Point
		
		batman_left_wing.addPoint(300, 330);
		batman_left_wing.addPoint(300, 290); //Bottom Left Spike
		batman_left_wing.addPoint(290, 310);
		batman_left_wing.addPoint(270, 260);
		batman_left_wing.addPoint(285, 230); //Middle Left Spike
		batman_left_wing.addPoint(265, 247);
		batman_left_wing.addPoint(240, 185);
		batman_left_wing.addPoint(250, 162); //Top Left Spike
		batman_left_wing.addPoint(235, 175);
		batman_left_wing.addPoint(210, 110);
		batman_left_wing.addPoint(60, 100);  //Left Tip of Wing
		
		//Right Wing
		batman_right_wing.addPoint(600, 100);
		batman_right_wing.addPoint(580, 110);
		batman_right_wing.addPoint(560, 120);
		batman_right_wing.addPoint(540, 140);
		batman_right_wing.addPoint(530, 160);
		batman_right_wing.addPoint(520, 180);
		batman_right_wing.addPoint(510, 200);
		batman_right_wing.addPoint(505, 220);
		batman_right_wing.addPoint(500, 240); //Middle Point
		batman_right_wing.addPoint(480, 250);
		batman_right_wing.addPoint(460, 260);
		batman_right_wing.addPoint(430, 280);
		batman_right_wing.addPoint(400, 300);
		batman_right_wing.addPoint(380, 320);
		batman_right_wing.addPoint(360, 340);
		batman_right_wing.addPoint(350, 350); //Tail Point
		
		batman_right_wing.addPoint(360, 330);
		batman_right_wing.addPoint(360, 290); //Bottom Right Spike
		batman_right_wing.addPoint(370, 310);
		batman_right_wing.addPoint(390, 260);
		batman_right_wing.addPoint(375, 230); //Middle Right Spike
		batman_right_wing.addPoint(395, 247);
		batman_right_wing.addPoint(420, 185);
		batman_right_wing.addPoint(410, 162); //Top Right Spike
		batman_right_wing.addPoint(425, 175);
		batman_right_wing.addPoint(450, 110);
		batman_right_wing.addPoint(600, 100);
		
		//Draw Polygons
		g.setColor(Color.black);
		g.fillPolygon(batman_left_wing);
		g.fillPolygon(batman_right_wing);
	}
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Nightwing/Batman Logo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create and Size Canvas
		Nightwing_Batman_Logo canvas = new Nightwing_Batman_Logo();
		canvas.setSize(640, 480);
		
		frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
	}
}
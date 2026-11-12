/**
* Lead Author(s):
* @author jazmi; student ID
* @author Full name; student ID
* <<Add additional lead authors here>>
*
* Other Contributors:
* Full name; student ID or contact information if not in class
* <<Add additional contributors (mentors, tutors, friends) here, with contact information>>
*
* References:
* Morelli, R., & Walde, R. (2016).
* Java, Java, Java: Object-Oriented Problem Solving
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
*
* <<Add more references here>>
*
* Version: 2026-11-11
*/
package src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.*;

import java.util.Random;


/**
 * Purpose: The reponsibility of Viewer is ...
 *
 * Viewer is-a ...
 * Viewer is ...
 */
public class Viewer extends JFrame implements ActionListener
{
	Viewer box;
	Model model;
	Timer timer;
	LinkedList<Particle> list;
	
	public Viewer(Model model) {
		this.box = this;
		this.model = model;
		this.list = model.getList();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("box");
		Dimension minSize = new Dimension(500,300);					
		setMinimumSize(minSize);
		
		box.setContentPane(new Panel(model));
		box.setVisible(true);
		
		timer = new Timer(15, this);
		timer.start();
	}
	
	
	public static void main(String[] args)
	{
		new Viewer(new Model());
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		//For every particle, add to velocity
		for(int i = 0; i < list.size(); i++) {
			Particle target = list.get(i);
			//just for me to know what is happening
			System.out.println(target.getPosition().getx() + " " + target.getPosition().gety() + " " + this.getWidth() + " " + this.getHeight());
			
			if(target.getPosition().getx() > this.getWidth() - 4 * target.getRadius() || target.getPosition().getx() < 0) {
				target.setVelocity(target.getVelocity().getx() * -1, target.getVelocity().gety());
			}
			
			if(target.getPosition().gety() > this.getHeight() - 6 * target.getRadius() || target.getPosition().gety() < 0) {
				target.setVelocity(target.getVelocity().getx(), target.getVelocity().gety() * -1);
			}
			
			target.addToPosition(target.getVelocity());
			target.addToVelocity(target.getAcceleration());
			
			Random seed = new Random();
			double x = seed.nextDouble(1) - 1;
			double y = seed.nextDouble(1) - 1;
			target.setAcceleration(x,y);
		}
		box.repaint(); //repaint each time
	}
}

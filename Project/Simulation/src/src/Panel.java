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
import java.util.LinkedList;

import javax.swing.*;

/**
 * Purpose: The reponsibility of Panel is ...
 *
 * Panel is-a ...
 * Panel is ...
 */
public class Panel extends JPanel //paintComponent was used
{
	Model model;
	LinkedList<Particle> list;
	
	public Panel(Model model) {
		this.model = model;
		this.list = model.getList();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		for(int i = 0; i < list.size(); i++) {
			Particle particle = list.get(i);
			VectorObject position = particle.getPosition();
			g.drawOval((int) position.getx(), (int) position.gety(), 2 * particle.getRadius(), 2 * particle.getRadius());
		}		
	}
}

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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.Timer;

/**
 * Purpose: The reponsibility of Model is ...
 *
 * Model is-a ...
 * Model is ...
 */
public class Model implements ActionListener //TIMER LISTENER
{
	Timer timer;
	ArrayList<Particle> list = new ArrayList<>(); //to number and write to file later
	
	Viewer viewer;
	
	public Model() {
		this.viewer = new Viewer(list);
		viewer.setList(list);
		timer = new Timer(15, this); //i should move this to the model class
		timer.start();
		
		TestScenarios.Random(this, viewer, 2);
		
		//OHHHH MY GOD IT WORKS!!!!!
	}
	
	public void addParticle(Particle particle) {
		list.add(particle);
	}
	
	public ArrayList<Particle> getList() {
		return list;
	}
	

	public void update(ArrayList<Particle> list) {
		for(Particle p1 : list) {
			for(Particle p2 : list) {
				if(p1 != p2) {
					
					VectorObject force = Particle.getForce(p1,p2); //WHY IS THIS A PROBLEM!??!?!?!
					p1.setAcceleration(force);
					
				}
			}
			System.out.println(p1);
		}
		
		for(Particle p : list) {
			p.updateState();
		}
		
		//USE A NESTED ENHANCED FOR LOOP TO CHECK IF THERE IS A COLLISION??????? 
		//theres a ray that hits each circles center with one another and then check the singular point for radius to see if that x position is the same
		//then change position by velocity and all :))
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// For every particle, can collide with edges of box
		update(list);
		
		viewer.repaint(); 
	}
	
}

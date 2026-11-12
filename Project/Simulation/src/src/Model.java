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
import java.util.LinkedList;
import java.util.Random;

/**
 * Purpose: The reponsibility of Model is ...
 *
 * Model is-a ...
 * Model is ...
 */
public class Model
{
	LinkedList<Particle> list = new LinkedList<>(); //to number and write to file later
	
	public Model() {
		Random seed = new Random();
		for(int i = 0; i < 1; i++) {
			Particle test = new Particle();
			double x = seed.nextDouble(10);
			double y = seed.nextDouble(10);
			int r = seed.nextInt(20);
			test.setPosition(x, y);
			test.setVelocity(x, y);
			test.setRadius(r);
			this.addParticle(test);
		}
		Particle test2 = new Particle();
		test2.setVelocity(2, 3);
		
		this.addParticle(test2);
		//OHHHH MY GOD IT WORKS!!!!!
	}
	
	public void addParticle(Particle particle) {
		list.add(particle);
	}
	
	public LinkedList<Particle> getList() {
		return list;
	}
	
}

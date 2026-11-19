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
* Version: 2026-11-16
*/
package src;

import java.util.Random;

/**
 * Purpose: The reponsibility of TestScenarios is ...
 *
 * TestScenarios is-a ...
 * TestScenarios is ...
 */
public class TestScenarios
{
	//with threads
	public static void Line(Model model, Viewer viewer, int n) {
		for(int i = 0; i < n; i++) {
			Particle test = new Particle(viewer);
			test.setPosition(2, 2);
			test.setVelocity(2, 2);
			model.addParticle(test);
			try{
				Thread.sleep(60);
			}
			catch(InterruptedException e) {
				Thread.currentThread().interrupt();
				break;
			}
		}
	}
	
	public static void Random(Model model, Viewer viewer, int n) {
		Random seed = new Random();
		for(int i = 0; i < n; i++) {
			Particle test = new Particle(viewer);
			
			double x = seed.nextDouble(10);
			double y = seed.nextDouble(10);
			test.setVelocity(x, y);
			
			x = seed.nextDouble(50) - 25;
			y = seed.nextDouble(50) - 25;
			
			test.setPosition(viewer.getWidth() / 2 + x, viewer.getHeight() / 2 + y);
			model.addParticle(test);
		}
	}
	
	public static void center(Model model, Viewer viewer) {
		Particle test = new Particle(viewer);
		test.setPosition(viewer.getWidth()/2, viewer.getHeight()/2);
		test.setUpdateable(false);
		model.addParticle(test);
		}
	}

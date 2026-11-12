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
/**
 * Purpose: The reponsibility of Particle is ...
 *
 * Particle is-a ...
 * Particle is ...
 */
public class Particle 
{
	private VectorObject position;
	private VectorObject velocity;
	private VectorObject acceleration;
	private int radius = 10;
	
	public Particle() {
		this.position = new VectorObject();
		this.velocity = new VectorObject();
		this.acceleration = new VectorObject();
	}
	
	//SET METHODS
	public void setPosition(double x, double y) {
		position.setx(x);
		position.sety(y);
	}
	
	public void setVelocity(double x, double y) {
		velocity.setx(x);
		velocity.sety(y);
	}
	
	public void setAcceleration(double x, double y) {
		acceleration.setx(x);
		acceleration.sety(y);
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//GETTER METHODS
	public VectorObject getPosition() {
		return position;
	}
	
	public VectorObject getVelocity() {
		return velocity;
	}
	
	public VectorObject getAcceleration() {
		return acceleration;
	}
	
	public int getRadius() {
		return radius;
	}
	
	//ADD METHODS
	public void addToPosition(VectorObject target) {
		position.add(target);
	}
	
	public void addToVelocity(VectorObject target) {
		velocity.add(target);
	}
	
	public void addToAcceleration(VectorObject target) {
		acceleration.add(target);
	}
	
}

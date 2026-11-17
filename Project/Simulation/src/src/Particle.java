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
	
	private double mass = 10;
	private int radius = 10;
	private Viewer viewer;
	
	public Particle(Viewer viewer) {
		this.viewer = viewer;
		this.position = new VectorObject();
		this.velocity = new VectorObject();
		this.acceleration = new VectorObject();
	}
	
	//SET METHODS
	public void setPosition(double x, double y) {
		position.set(x,y);
	}
	
	public void setVelocity(double x, double y) {
		velocity.set(x,y);
	}
	
	public void setAcceleration(double x, double y) {
		acceleration.set(x,y);
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setMass(double mass) {
		this.mass = mass;
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
	
	public double getMass() {
		return mass;
	}
	
	//UPDATE STATES
	public void updateState() {
		//UPDATE ACCELERATION LATER
		
		//WALL COLLISION UPDATE
		if(this.getPosition().getx() > viewer.getWidth() - 4 * this.getRadius() || this.getPosition().getx() < 0) {
			this.setVelocity(this.getVelocity().getx() * - 1, this.getVelocity().gety());
		}
			
		if(this.getPosition().gety() > viewer.getHeight() - 6 * this.getRadius() || this.getPosition().gety() < 0) {
			this.setVelocity(this.getVelocity().getx(), this.getVelocity().gety() * -1);
		}
		
		velocity = VectorObject.add(velocity, acceleration);
		position = VectorObject.add(position, velocity);
	}
}

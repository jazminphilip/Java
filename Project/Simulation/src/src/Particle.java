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
	private boolean updateable = true;
	
	static final double gravitationalConstant = 1;
	
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
	
	public void setPosition(VectorObject v) {
		position.set(v.getx(),v.gety());
	}
	
	public void setVelocity(double x, double y) {
		velocity.set(x,y);
	}
	
	public void setVelocity(VectorObject v) {
		velocity.set(v.getx(),v.gety());
	}
	
	public void setAcceleration(double x, double y) {
		acceleration.set(x,y);
	}
	
	public void setAcceleration(VectorObject v) {
		acceleration.set(v.getx(),v.gety());
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void setMass(double mass) {
		this.mass = mass;
	}
	
	public void setUpdateable(boolean i) {
		this.updateable = i;
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
	
	public static VectorObject getForce(Particle p1, Particle p2) {
		
		VectorObject direction = new VectorObject(Particle.getDistanceVector(p1, p2));
		
		double r = direction.getMagnitude();
		
		direction = direction.getUnit();
		
		double magnitude = p1.getMass() * p2.getMass() * gravitationalConstant / (r * r);
		
		return direction.getUnit().scale(magnitude);
	}
	
	public static double getForceMagnitude(Particle p1, Particle p2) {
		double output  = p1.getMass() * p2.getMass();
		output *= gravitationalConstant;
		output /= (getDistanceVector(p1,p2).getMagnitude());
		return output;
	}
	
	//
	public static VectorObject getDistanceVector(Particle p1, Particle p2) {
		VectorObject v1 = new VectorObject(p1.getPosition());
		VectorObject v2 = new VectorObject(p2.getPosition()); 
		
		v1.scale(-1);
		
		VectorObject output = VectorObject.add(v1, v2);
		
		return output;
	}
	
	//UPDATE STATES
	public void updateState() {
		//UPDATE ACCELERATION LATER
		//WALL COLLISION UPDATE
		
		//RIGHT SIDE then LEFT SIDE
		//if the particle is moving rightwards, then it goes left when collides (positive x to negative x velocity)
		if(this.getPosition().getx() > viewer.getWidth() - 4 * this.getRadius() && this.getVelocity().getx() > 0 || 
				this.getPosition().getx() < 0 && this.getVelocity().getx() < 0) {
			this.setVelocity(this.getVelocity().getx() * - 1, this.getVelocity().gety());
		}
		
		
			
		//BOTTOM then TOP
		if(this.getPosition().gety() > viewer.getHeight() - 6 * this.getRadius() && this.getVelocity().gety() > 0 || 
				this.getPosition().gety() < 0 && this.getVelocity().gety() < 0) {
			this.setVelocity(this.getVelocity().getx(), this.getVelocity().gety() * -1);
		}
		
		if(this.updateable == true) {
			velocity.add(acceleration);
			position.add(velocity);	
		}
	}
	
	@Override
	public String toString() {
		String output = "Position : " + position.toString();
		   output += "\nVelocity: " + velocity.toString();
		   output += "\nAcceleration: " + acceleration.toString();
		
		return output;
	}
}

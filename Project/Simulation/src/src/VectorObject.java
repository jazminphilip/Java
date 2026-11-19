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
import java.lang.Math;

/**
 * Purpose: The reponsibility of VectorObject is to be able to do engine calculations between object
 *
 * VectorObject is-a ...
 * VectorObject is ...
 */
public class VectorObject
{
	private double x = 0;
	private double y = 0;
	
	public VectorObject(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public VectorObject() {
		
	}
	
	public VectorObject(VectorObject target) {
		this.x = target.x;
		this.y = target.y;
	}
	
	//static methods are so great thank you so much
	public static VectorObject add(VectorObject vector1, VectorObject vector2) {
		VectorObject output = new VectorObject();
		output.setx(vector1.getx() + vector2.getx());
		output.sety(vector1.gety() + vector2.gety());
		return output;
	}
	
	public static VectorObject dot(VectorObject vector1, VectorObject vector2) {
		VectorObject output = new VectorObject();
		output.setx(vector1.getx() * vector2.getx());
		output.sety(vector1.gety() * vector2.gety());
		return output;
	}
	
	//GETTERS
	public double getx() {
		return x;
	}
	
	public double gety() {
		return y;
	}
	
	public double getMagnitude() {
		return Math.sqrt((x * x + y * y));
	}
	
	public VectorObject getUnit() {
		VectorObject output = new VectorObject(this); //make sure its a copy
		double x = output.getx() / output.getMagnitude();
		double y = output.gety() / output.getMagnitude();
		output.set(x,y);
		return output;
	}
	
	//SETTERS
	public void setx(double x) {
		this.x = x;
	}
	
	public void sety(double y) {
		this.y = y;
	}
	
	public void set(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public VectorObject scale(double constant) {
		this.setx(this.getx() * constant);
		this.setx(this.gety() * constant);
		return this;
	}
	
	public void add(VectorObject p) {
		this.x += p.getx();
		this.y += p.gety();
	}
	
	@Override
	public String toString() {
		return "<" + this.x + ", " + this.y + ">";
	}
		
}

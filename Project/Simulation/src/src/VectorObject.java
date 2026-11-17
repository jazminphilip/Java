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
	
	public static VectorObject scale(VectorObject x, double y) {
		x.setx(x.getx() * y);
		x.setx(x.gety() * y);
		return x;
	}
	
	
	//GETTERS
	public double getx() {
		return x;
	}
	
	public double gety() {
		return y;
	}
	
	public double getMagnitde() {
		return Math.sqrt((x * x + y * y));
	}
	
	//SETTERS
	public void setx(double x) {
		this.x = x;
	}
	
	public void sety(double y) {
		this.y = y;
	}
	
}

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
 * Purpose: The reponsibility of VectorObject is to be able to do engine calculations between object
 *
 * VectorObject is-a ...
 * VectorObject is ...
 */
public class VectorObject
{
	private double x = 0;
	private double y = 0;
	
	public VectorObject(double[] vector) {
		x = vector[0];
		y =vector[1];
	}
	
	public VectorObject(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public VectorObject() {
		
	}
	
	public void add(double x, double y) {
		this.x += x;
		this.y += y;
	}
	
	public void multiply(double x, double y) {
		this.x *= x;
		this.y *= y;
	}
	
	public double getx() {
		return x;
	}
	
	public double gety() {
		return y;
	}
	
	public void setx(double x) {
		this.x = x;
	}
	
	public void sety(double y) {
		this.y = y;
	}
	
	public void add(VectorObject vector) {
		this.x = x + vector.getx();
		this.y = y + vector.gety();
	}
}

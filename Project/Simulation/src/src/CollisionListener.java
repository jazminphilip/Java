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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Purpose: The reponsibility of CollisionListener is ...
 *
 * CollisionListener is-a ...
 * CollisionListener is ...
 */
public interface CollisionListener extends ActionListener
{

	//ok think about this
	//you have two circles, they collide where the two circles are facing one another in vectors
	//THAT means you only have to check the pixel that overlaps between the two circles edge
	
	//this assumes that only one collision can happen at a time
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
}

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

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.*;

import java.util.Random;


/**
 * Purpose: The reponsibility of Viewer is ...
 *
 * Viewer is-a ...
 * Viewer is ...
 */
public class Viewer extends JFrame
{
	ArrayList<Particle> list;
	
	public Viewer(ArrayList<Particle> list) {
		this.list = list;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("box");
		Dimension minSize = new Dimension(500,300);					
		setMinimumSize(minSize);
		
		this.setContentPane(new Panel(list));
		this.setVisible(true);

	}
	
	public void setList(ArrayList<Particle> list) {
		this.list = list;
	}
	
	public static void main(String[] args)
	{
		new Model();
	}


}

package day3;

import javax.swing.JOptionPane;

public class Snooper {
	String name = JOptionPane.showInputDialog("What is your name?");
	String age = JOptionPane.showInputDialog("How old are you?");
	String streetname = JOptionPane.showInputDialog("Name a random street");
	
	String Madlibs = name+", you are "+age+". You live on "+streetname+". You should not give out personal information to a computer!";
	
	JOptionPane.showMessageDialog(null, Madlibs);
}

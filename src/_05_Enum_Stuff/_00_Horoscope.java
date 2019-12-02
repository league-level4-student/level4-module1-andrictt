package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void zodEnum(Zodiac current){
		switch(current) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "IDK");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "IDK");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "IDK");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "ho");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "h");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "d");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "s");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "a");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "g");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "h");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "B");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "j");
			break;
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac hey = Zodiac.CANCER;
		zodEnum(hey);
	}	
	
}

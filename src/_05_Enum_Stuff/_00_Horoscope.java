package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public void zodEnum(Zodiac current){
		switch(current) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "IDK");
			break;
		case TAURUS:
			break;
		case GEMINI:
			break;
		case CANCER:
			break;
		case LEO:
			break;
		case VIRGO:
			break;
		case LIBRA:
			break;
		case SCORPIO:
			break;
		case SAGITTARIUS:
			break;
		case CAPRICORN:
			break;
		case AQUARIUS:
			break;
		case PISCES:
			break;
	}
	// 3. Make a main method to test your method
	
}

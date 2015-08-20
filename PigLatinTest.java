import javax.swing.JOptionPane;

public class PigLatinTest
{
 public static void main ( String [] args)
 {
  String sentence;

  do{
	  sentence = JOptionPane.showInputDialog( null, 
		  "Welcome to PigLatin.java \nprogrammed by: Rene Jerez \n\nEnter Sentence");
	  
	  if (!sentence.equalsIgnoreCase( "Quit"))
	  {
		  JOptionPane.showMessageDialog(null, PigLatin.toPigLatin( sentence));
	  }
  	} while (!sentence.equalsIgnoreCase("Quit"));
  }
}

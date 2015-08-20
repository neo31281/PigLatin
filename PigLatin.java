import java.util.StringTokenizer;

public class PigLatin
{
 public static String toPigLatin ( String sentence)
 {
	 String newSentence = "";
	 String array[] = sentence.split(" ");

	 for ( int i = 0; i < array.length; i++)
	 {
		 char first = array[i].charAt(0);

		 if (first == 'a'|| first =='e'||first == 'i'|| first == 'o'|| first == 'u'
		 || first =='A'|| first=='E'||first=='I'||first=='O'||first=='U')
		 {
			 array[i] += "way";
		 }else
			 array[i] = array[i].substring(1) + first + "ay";
	 }
	 
	 for( String word : array )
		 newSentence += word+" ";
	 
	 return newSentence.trim();

  }
}

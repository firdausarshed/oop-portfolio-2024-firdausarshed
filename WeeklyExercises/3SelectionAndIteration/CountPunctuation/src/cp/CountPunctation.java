package cp;

public class CountPunctation {
	public static void main(String[] args)
	   {
	      String s = "Mary had a little lamb, her fleece was as white as snow, and everywhere Mary went the lamb was sure to go. -that was a nice poem- the end.";

	      int fullstopCount = 0;
	      int commaCount = 0;
	      int semicolonCount = 0;
	      int colonCount = 0;
	      int exclamationCount = 0;
	      int questionCount = 0;
	      int hyphenCount = 0;

	      for(int i = 0; i < s.length(); i++)
	      {
	         if(s.charAt(i) == '.')
	         {
	            fullstopCount++;
	         }
	         else if(s.charAt(i) == ',')
	         {
	            commaCount++;
	         }
	         else if(s.charAt(i) == '-')
	         {
	        	 hyphenCount++;
	         }
	         else if(s.charAt(i) == ';')
	         {
	            semicolonCount++;
	         }
	         else if(s.charAt(i) == ':')
	         {
	            colonCount++;
	         }
	         else if(s.charAt(i) == '!')
	         {
	            exclamationCount++;
	         }
	         else if(s.charAt(i) == '?')
	         {
	            questionCount++;
	         }
	      }

	      System.out.println("There are " + fullstopCount + " full stops in this String.");
	      System.out.println("There are " + commaCount + " commas in this String.");
	      System.out.println("There are " + hyphenCount + " hyphens in this String.");
	      System.out.println("There are " + semicolonCount + " semicolons in this String.");
	      System.out.println("There are " + colonCount + " colons in this String.");
	      System.out.println("There are " + exclamationCount + " exclamation marks in this String.");
	      System.out.println("There are " + questionCount + " question marks in this String.");
	   }
	}

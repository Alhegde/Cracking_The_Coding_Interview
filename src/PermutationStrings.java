import javax.swing.plaf.synth.SynthStyle;

public class PermutationStrings {
	
	public String sort(String s)
	{
	   char[] content = s.toCharArray();
	   java.util.Arrays.sort(content);
	   return new String(content);
	   
	}
	public boolean permString(String s, String t)
	{
		if(s.length() != t.length())
			return false;
		return sort(s).equals(sort(t));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PermutationStrings ps = new PermutationStrings();
		boolean result =ps.permString("doi","god" );
		if(result)
		System.out.println("the two strings are permutation of the other");
		else
			System.out.println("the two strings are not permutations of the other");
			
     
	}

}

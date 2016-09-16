
public class ReverseString {
	public String reverse(String str)
	{
	  int p1,p2;
	  char[] chars=str.toCharArray();
	  p1=0;
	  p2=str.length()-1;
	  while(p1<p2)
	  {
		  char temp=chars[p1];
		  chars[p1]=chars[p2];
		  chars[p2]=temp;
		  p1++;
		  p2--;
	  }
	 //System.out.println(chars); //if it needs to be printed within the func
	  return new String(chars);   //converts char array to string(toString didnt work)
	}

	public static void main(String[] args) {
	
     ReverseString rev=new ReverseString();
     String forReverse="alisha";
     
     System.out.println(rev.reverse(forReverse));
     
     
	}

}

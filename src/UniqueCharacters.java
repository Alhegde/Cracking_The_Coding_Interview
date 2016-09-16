
public class UniqueCharacters {
	public void stringUnique(String str)
	{
		boolean[] chr=new boolean[256];
		int x=0;
		for(int i=0;i<str.length();i++)
		{
		  if(!chr[(int)str.toUpperCase().charAt(i)-64])
		  {
			  chr[(int)str.toUpperCase().charAt(i)-64]=true;
		  }
		  else
		  {
			  System.out.println("not unique");
			  x=-1;
			  break;
		  }
		}
		if(x==0)
		{
			System.out.println("the string is unique");
		}
		
	}
	public boolean AsciiUnique(String str)
	{
		boolean[] chrs =new boolean[256];
		for(int i=0;i<str.length();i++)
		{
			int val=str.charAt(i);
			if(chrs[val]) return false;
			chrs[val]=true;
		}
		return true;
	}

	public static void main(String[] args) {
		
		UniqueCharacters uc=new UniqueCharacters();
		
		uc.stringUnique("ddsssf");
		boolean result=uc.AsciiUnique("asf");
		if(result)
		System.out.println("the string is unique");
		else
			System.out.println("the string is not unique");

	}

}

package principle1.test;


public class CountDublicate {
	public static void main(String[] args) {
		String s = "Bangaluru";
		char[] a = new char[26];
		int[] c = new int[26];
		int count = 0;
		char d = 'a';
		for(int l=0; l<26; l++)
		{
			a[l] = d++;
		}
		for(int i=0; i<s.length(); i++){
			count = 1;
			
						
			for(int j=i+1; j<s.length(); j++)
			{
				count++;
				if(s.charAt(i) == s.charAt(j))
				{
					for(int k=0; k<26; k++)
					{
					
						if(s.charAt(i)== a[k])
						{
							c[k] = count;
						}
					}
				}
			}
		}
		
		
		for(int l=0; l<26; l++)
		{
			if(c[l] > 1)
			{
				System.out.println(a[l] + " occours " + c[l] + "times");
			}
		}
	}

}

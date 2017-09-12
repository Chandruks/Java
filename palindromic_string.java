import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
         Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String tmp="";
		if((100>=S.length()) && (1<=S.length()))
		{
			StringBuffer sb = new StringBuffer(S);
			sb = sb.reverse();
			tmp = sb.toString();
			if(S.equals(tmp))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}

    }
}

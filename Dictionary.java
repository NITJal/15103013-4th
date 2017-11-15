
import java.util.*;

public class Dictionary {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String k=obj.nextLine();int l=0;int pr=0;
        ArrayList < String > vec=new ArrayList < String >();
        for(l=0;l<k.length();l++)
        {
        	if(k.charAt(l)==' ')
        	{
        		String i=k.substring(pr, l);
        		pr=l+1;
        		vec.add(i);
        		
        	}
        }
        String i=k.substring(pr, l);
        vec.add(i);

        Scanner oo=new Scanner (System.in);
        while(true){
        	
        	String input=oo.nextLine();pr=0;
       int f=0;
        		for(int h=0;h<vec.size();h++)
                {
                	//System.out.println(vec.get(h)+ " ");
        			String ch=vec.get(h);int ct=0;
        			for(int u=0;u<Math.min((int)ch.length(),(int)input.length());u++)
        			{
        				if(input.charAt(u)==ch.charAt(u))
        				{
        					ct++;
        				}
        			}
        			int ll=ch.length();
        			if(ll==0)
        				ll=1;
        			if(ct>=ll/2)
        			{
        				System.out.print(ch+' ');f=1;
        				break;
        			}
        			
                }
        		if(f==0)
        		{
        			vec.add(input);
        		}
    }
	}
}
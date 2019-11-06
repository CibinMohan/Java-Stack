import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            boolean check = false;
            Deque<Character> stack = new ArrayDeque<Character>();
            //List<String> list = new ArrayList<String>(Arrays.asList(input.split("")));
            if(input.length()%2 != 0)
            {
               System.out.println("false"); 
            }
            else if(input.length() == 0)
            {
               System.out.println("true"); 
            }
           else{
               
               for(int i =0; !check && i< input.length(); i++)
               {
                   
                try{
                	
                   if(input.charAt(i) == ('{') || input.charAt(i) == ('(' )||input.charAt(i) == ('['))
                   {
                       stack.push(input.charAt(i));
                      
                   }
                   else if( input.charAt(i) == ('}')){
                       if (stack.peek()== '{')
                       {
                       stack.pop();
                       }
                       else
                       {
                            check = true;
                          
                       }
                       
                   }
                   else if( input.charAt(i) == (')')){
                       if (stack.peek()== '(')
                       stack.pop();
                       else
                       {
                            check = true;
                           
                       }
                       
                   }
                   else if( input.charAt(i) == (']')){
                       if (stack.peek()== '[')
                       stack.pop();
                       else
                       {
                            check = true;
                         
                       }
                       
                   }}
                   catch (Exception e)
                   {
                	   
                	   check = true;
                   }
               }
               if(stack.isEmpty() && !check )
            	   {
            	   System.out.println("true");
            	   }
               else
               {
            	   System.out.println("false");
            	   
               }
           }
           
           //System.out.println(list);
		}
		
	}
}




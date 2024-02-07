public class FizzBuzz 
{
    public static void main(String[] args) throws Exception 
    {
        int i = 1;
        while (i < 101) 
        {
            if(i % 15 == 0)
            {//f
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0)
            {//T
                System.out.println("Fizz");
            }
            else 
            {
                if(i % 5 == 0) 
                {//F
                    System.out.println("Buzz");
                }
                else
                System.out.println(i);
            }
            i++;//INCREMENTOR NEEDS TO BE INSIDE OF THE WHILE LOOP!!!!!!!!!!!!
        }
        
    }
}
            


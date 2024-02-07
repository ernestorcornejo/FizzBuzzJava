public class FizzBuzz 
{
    public static void main(String[] args) throws Exception 
    {
        int i = 1;
        while (i < 101) 
        {
            if(i % 15 == 0)
            {//f
                System.out.println("FizzBuzz"+ ":  "+ i);
            }
            else if (i % 3 == 0)
            {//T
                System.out.println("Fizz" + ":  "+ i);
            }
            else if (i % 5 == 0) 
            {//F
                System.out.println("Buzz"+ ":  "+ i);
            }
            i++;//INCREMENTOR NEEDS TO BE INSIDE OF THE WHILE LOOP!!!!!!!!!!!!
        }
        
    }
}
            


public class Main
{
    public static void main(String[] args)
    {
        int i = 1;//Since the instructions were from 1 to 100 then we don't need zero
        while (i < 101) //We only need to go up to 100 so 101 is not included
        {
            if(i % 15 == 0)/*We need to have the modulo equal to zero for multiples of 15 and print FizzBuzz, 
            Same with the rest of the other if statements*/
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
                System.out.println(i);//print the numbers from 1-100 but not the words.
            }
            i++;//Increment to reach 100
        }
        
    }
}
            


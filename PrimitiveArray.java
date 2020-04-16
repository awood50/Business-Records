import java.util.*;//for Random class and Scanner class
/**
 * This is an example of the selection sort.
 * The selection sort is not an efficient sort.
 * 
 * @author L. Lehmann
 * @version v1
 */
public class PrimitiveArray
{
   public static void main(String[ ] args)
   {
       int [ ] numbers = new int[10];
       Random rng = new Random( );
       Client tempHolding;
       int minPos;
       Client min;
       int key;
       int start;
       
       for(int k = 0; k < numbers.length; k++)
       {
         numbers[k] = rng.nextInt(21); 
       }
       System.out.println("Here is the array unsorted: ");
       for(int k = 0; k < numbers.length; k++)
       {
         System.out.print(numbers[k] + " ");
       }
       

       for(start = 0; start < numbers.length - 1; start++)
       {
           minPos = start;
           min = new Client();
           
           for(key = start; key < numbers.length; key++)
           {
               if(numbers.compareTo(min) < 0)
               {
                   min = numbers[key];
                   minPos = key;
                }
            }
            
            tempHolding = min;
            numbers[minPos] = numbers[start];
            numbers[start] = min;
        }
        
       System.out.println("\nHere is the array after sorting: ");
       for(int k = 0; k < numbers.length; k++)
       {
         System.out.print(numbers[k] + " ");
       }
    }    
       
}

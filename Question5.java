import java.util.Scanner;
import java.util.*;
import java.util.Collections;
public class Main

{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
    
    
    int number = in.nextInt();
    

    List<Integer> l1 = new ArrayList<Integer>();
    List<Integer> l2 = new ArrayList<Integer>();
    List<Integer> uniquenum = new ArrayList<Integer>();
    for (int i=0; i<number; i++ )
      {
             
    
            int num = in.nextInt();
            
            l1.add(i, num);
            
            
      }
    
    

    int count = 0;
    
    for (int x = 0; x <number; x++){
      count = 0 ;

      
      if (x==0){
        uniquenum.add(l1.get(x)); 
      }
      else {
        if (uniquenum.contains(l1.get(x))){
          continue; 
        }
        else {
          uniquenum.add(l1.get(x));
        }
        
      }
      
      
      for (int y=0;y<number;y++){
        
        if (l1.get(x)== l1.get(y)){
          count++;}    
      }
      l2.add(count);
        
    }

    
    int size = l2.size();
    
    
    Integer max = Collections.max(l2);

     
    
    for (int h=0;h<size; h++){
      if (max == l2.get(h)){
        
        System.out.println(uniquenum.get(h));
        
      }
      
    }
      

    

    
    
    
    
         
    
  }
}

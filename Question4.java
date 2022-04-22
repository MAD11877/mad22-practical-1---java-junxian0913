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
    
    System.out.print("How many numbers?: "); 
    
    int number = in.nextInt();
    

    List<Integer> l1 = new ArrayList<Integer>();
    List<Integer> l2 = new ArrayList<Integer>();
    List<Integer> uniquenum = new ArrayList<Integer>();
    for (int i=0; i<number; i++ )
      {
            System.out.print("what are the numbers?: "); 
    
            int num = in.nextInt();
            
            l1.add(i, num);
            
            
      }
    
    System.out.println(l1);

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

    
    int size = list.l2();
    System.out.println(l2);
    System.out.println(uniquenum);
    
    Integer max = Collections.max(l2);

    System.out.println(max);  

    for (int h=0;h<size; h++){
      if (max == l2[h]){
        int index = l2.indexOf(l2[h])); 
      }
      System.out.print(index); 
    }

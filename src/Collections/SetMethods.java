package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
      
      Set<Integer> set1= new HashSet<>();
      Integer[] a= new Integer[] {1,9,0,7,6,3};
      set1.addAll(Arrays.asList(a));
      System.out.println("Set1: "+set1);
      
      Set<Integer> set2= new HashSet<>();
      Integer[] b= new Integer[] {1,19,10,7,16,3};
      set2.addAll(Arrays.asList(b));
      System.out.println("Set2: "+set2);
      
      Set<Integer> Union= new HashSet<>(set1);
      Union.addAll(set2);
      System.out.println("Union after addAll() : "+Union);
      
      Set<Integer> Intersection= new HashSet<>(set1);
      Intersection.retainAll(set2);
      System.out.println("Intersection after retainAll(): "+Intersection);
      
      Set<Integer> Difference= new HashSet<>(set1);
      Difference.removeAll(set2);
      System.out.println("Difference after removeAll(): "+Difference);
        
   
	}

}


package clay.classthree;
import java.util.*;

public class ClassThree {

    public static void main(String[] args){
        //array 
        int number[]=new int[10];
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;
        // array read
        for(int i=0;i<number.length; i++){
            System.out.println(number[i]);
        }
        
        //array list
        ArrayList<Integer>list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //print
        System.out.println(list);
        //for each
        list.forEach((item)->System.out.println(item));
        //for loop
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
        //for each
        for (Integer data : list) {
            System.out.println(data); 
        }
        
        
    }
}

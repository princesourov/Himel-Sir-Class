
package clay.classtwo;

public class ClassTwo {

    public static void main(String[] args) {
        
        //for Loop
        int sum=0;
        for(int i=1; i<=100; i=i+1){
            sum=sum+i;
            System.out.println(sum);
        }
        
        //while Loop
        int i=1;
        while(i<=100){
            sum=sum+1;
            System.out.println(sum);
            i=i+1;
        }
        
        // Do while Loop
        do{
            sum=sum+1;
            System.out.println(sum);
            i=i+1;
        }while(i<=100);
        
        //args
        int data[]={1,2,3,4,5,6,7,8,9};
        // for loop
        for(int a=0; a<=10; a=a+1){
            int num =data[a];
            System.out.println(num);
    }
        //for each Loop
        for(int b :data){
            System.out.println(b);
        }
    }
}

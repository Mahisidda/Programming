import java.util.*;
import java.io.*;
import java.lang.*;

public class linearsearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int flag=0;
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            if(A[i]==key){
                System.out.println("Bingooo");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Not found");
        }
    }
    
}

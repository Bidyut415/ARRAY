import java.util.*;

public class Move_Zero_End {
  public static void main(String[] args) {
    int[] arr={0,1,0,2,3,0,4};
    int index=0;
    System.out.println("i am working");
    for (int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        arr[index++]=arr[i];
      }
    }
    while (index<arr.length) {
      arr[index++]=0;
    }
    for(int i:arr){
      System.out.print(i+" ");
    }
//System.out.println("hi i am in last");
  }
}

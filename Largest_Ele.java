import java.util.Scanner;

public class Largest_Ele {
  public static void main(String[] args) {
    System.err.println("i am working ");
    int[] arr={10,20,4,45,99};

    int max=arr[0];

    for(int i=1;i<arr.length;i++){
      if(arr[i]>max)
      {
          max=arr[i];
      }
      
    }
    System.out.println("MAXIMUM IS :"+max);
  }
}

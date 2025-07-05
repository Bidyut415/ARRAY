import java.util.*;

public class Reverse_arr {

  public static void main(String[] args) {
    int[] arr ={10,20,30,40,50};
    int left=0,right=arr.length-1;
    while(left<right){
      //swap
      int temp=arr[left];
      arr[left]=arr[right];
      arr[right]=temp;
      left++;
      right--;
    }
    System.out.println("REVERSE ARRAY:");
    for(int i:arr)
    System.out.println(i+" ");
  }
}
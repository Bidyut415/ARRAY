public class SecondLargest {
  public static void main(String[] args) {
    int[] arr={10,20,4,45,99};
    int first= Integer.MIN_VALUE,second=Integer.MAX_VALUE;

    for(int num:arr){
      if(num>first){
        second=first;
        first=num;
      }
      else if(num>second&&num!=first){
        second=num;
      }
    }
    System.out.println("Second Largest: "+second);
  }
}

public class FindMissingNum {
  public static void main(String[] args) {

  int[] arr={1,2,4,5,6};
   int n =arr.length+1;
   int total =n*(n+1)/2;

    int sum=0;
    for(int i:arr){
      sum=sum+i;
    }
  System.out.println("Missing number:"+ (total-sum));
  }
}

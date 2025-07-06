public class Find_Duplicate {
  public static void main(String[] args) {
    int[] arr={1,2,3,2,4,2,3,3,3};
    for(int i=0;i<arr.length;i++){
      int index=Math.abs(arr[i]);
      if(arr[index]<0){
        System.out.println("Duplicate:" + index);
      }
      arr[index]= -arr[index];
    }
  }
}

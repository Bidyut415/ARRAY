public class Find_pair_sum {

  public static void main(String[] args) {
    int[] arr = {2, 4, 3, 5};
int sum = 7;
for(int i = 0; i < arr.length; i++) {
    for(int j = i+1; j < arr.length; j++) {
        if(arr[i] + arr[j] == sum) {
            System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
        }
    }
}

  }
}
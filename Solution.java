import java.util.ArrayList;
import java.util.List;

class Solution {
  
  public static List<Integer> fiveSort(List<Integer> array) {
    int i=0, j=array.size()-1;
    while(j>=0 && array.get(j)==5)
      j--;
    while(i<j){
      if(array.get(i)==5){
        int temp = array.get(j);
        array.set(j, 5);
        array.set(i, temp);
        
        j--;
      }
      i++;
    }
    return array;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    List<Integer> array = new ArrayList<>(List.of(5, 5, 5,5 ,5 ));
    array = fiveSort(array);
    System.out.println(array);
  }

  public static void main(String args[]){
    run();
  }
}
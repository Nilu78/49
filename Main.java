import java.util.*;
  class Main {
public static void main(String[] args) {
    int[] arr1 = {1, 0, 1, 0, 0, 1, 1};
     moveEvensToFront(arr1);
    System.out.println(Arrays.toString(arr1));

    //Test
    int[] arr2 = {3, 3, 2};
     moveEvensToFront(arr2);
  System.out.println(Arrays.toString(arr2));
  
    //Test
     int[] arr3 = {2, 2, 2};
     moveEvensToFront(arr3);
  System.out.println(Arrays.toString(arr3));


    //Test
    int[] arr4={3,6, 2, 2, 2};
  moveEvensToFront(arr4);
  System.out.println(Arrays.toString(arr4));
      
    
  }

  public static void moveEvensToFront(int[] arr){
    for(int i=0; i<arr.length -1; i ++){
      for (int j =i +1; j <arr.length; j++){
        if(arr[j]%2==0){
          int temp =arr[j];
          arr[j]=arr[i];
          arr[i]=temp;
        }
      }
    }
    }
    
   //test
}
  
    
    
    


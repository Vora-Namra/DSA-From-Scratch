

public class Linear_search{
    
    private static int linear(int[] arr, int n,int key) {
        for(int i=0;i<n;i++){
         if(arr[i] == key){
             return i;
         }
         }
         return -1;                                         
        }
     
    public static void main(String[] args) {
        int arr[] = {5,65,87,34,90,12,6,78,44};    
        int key = 78; 
        int n = arr.length;
        
        int index = linear(arr,n,key);
        if(index == -1){
            System.out.println("element not present in array");
        }
        else{
            System.out.println("Element found at index " + index);
        }
    }
//Time Complexity
//worst-case: O(n)
//Best-Case: O(1)
}



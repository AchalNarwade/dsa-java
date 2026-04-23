public class BubbleSort{
    public static void bubblesort(int[] arr){

    int n = arr.length;
    boolean isSwapped;

    for(int i=0;i<n-1;i++){
         isSwapped = false;
         for(int j=0;j<n-1-i;j++){
             if(arr[j]>arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;

                  isSwapped = true;
             }
        }
        if(!isSwapped){
            break;
        }
    }
}

    public static void main(String[] args){

        int[] arr = {2,1,5,4,3};

        bubblesort(arr);
   
        System.out.println("Sorted Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
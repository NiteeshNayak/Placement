class SecondMinimum{

    public static void main(String args[]){
        int[] arr = {3,2,6,9,4,0};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            if(arr[i] < secondSmallest && arr[i] > smallest)
                secondSmallest = arr[i];
        }

        System.out.println("Second Smallest Number is: "+secondSmallest);
    }
}

class NoOfDebits{

    public static void main(String args[]){
        int debitCounts = 0;
        int[] arr = {900,1500,600,1200,400};
        for(int i=1;i<arr.length;i++){
            if(arr[i]< arr[i-1]){
                debitCounts++;
            }
        }
        System.out.println("Number of Debit : "+debitCounts);
    }
}
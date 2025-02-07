//Assignment-1
class Sales{

    public static void main(String args[]){

        int [] salesData = {567,680,356,567,379};   //Example sales data we can read from scanner also

        int day = 1; //Sales day

        int maxSales = salesData[0];

        for (int i = 1; i < salesData.length; i++) {
            if (salesData[i] > maxSales) {
                maxSales = salesData[i];
                day = i + 1;  // i starts with 0 but day starts with 1, to match day with index I am are incrementing
            }
        }

        System.out.println("Day Number with Highest sales: "+day);
    }
}
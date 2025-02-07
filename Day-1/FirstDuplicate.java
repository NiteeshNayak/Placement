import java.util.*;
class FirstDuplicate{

    public static void main(String args[]){
        int[] arr = {12,4,7,4,8,7};

        HashSet<Integer> elements = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(elements.contains(arr[i]))
            {
                System.out.println("Duplicate is: "+arr[i]);
                break;
            }
            elements.add(arr[i]);
        }
    }
}
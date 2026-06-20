package arrays;

public class PeakElement {
    public static int peak(int[] arr){

        if(arr.length==0){
            return -1;
        }

        int maxElement=arr[0];
        int maxIndex=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > maxElement ){
                maxElement=arr[i];
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args){
        int[] arr={10,30,25,40,63,28};

        System.out.println(peak(arr));

    }
}

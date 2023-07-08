package DAY7SORTINGTECHNIQUES;

public class bublesorting {
    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }


    }
    public static void main(String args[]){
        int ele[]={3,6,1,8,4,2};
        for (int i=0;i<ele.length-1;i++){
            for(int j=0;j<ele.length-i-1;j++){
                if(ele[j]>ele[j+1]){
                  int temp = ele[j] ;
                  ele[j]   = ele[j+1];
                  ele[j+1]= temp ;   
                }
            }

        }
        printArray(ele);

    }
    
}

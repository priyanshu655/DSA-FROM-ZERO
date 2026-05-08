//finding the first occurance of number in array and returning that index where it located first 

public class problem7 {
    public static int firstOccurance(int a[],int key,int i){
        if(i==a.length){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return firstOccurance(a, key, i+1);
    }
    public static void main(String[] args) {
        int a[]={1,4,3,6,3,4,6};
        System.out.println(firstOccurance(a, 6, 0));
    }
}

public class problem8{
    public static int lastOccurence(int a[],int key,int i){
        if(i==a.length){
            return -1;
        }
        int isFound=lastOccurence(a, key, i+1);
        if(isFound==-1&&a[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int a[]={1,4,2,6,4,2,3};
        System.out.println(lastOccurence(a, 4, 0));
    }        
}
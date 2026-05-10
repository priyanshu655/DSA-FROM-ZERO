package divideAndConquere;

public class quickSort {
      public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void quickSortAlgo(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotIdx=partition(a,si,ei);
        quickSortAlgo(a,si,pivotIdx-1);
        quickSortAlgo(a, pivotIdx+1, ei);
    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<=ei;j++){
            if(arr[j]<pivot){
                int temp=arr[j];
                i++;
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[ei]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,5,4,1,2,2};
        quickSortAlgo(arr,0,5);
        printArr(arr);
    }
}

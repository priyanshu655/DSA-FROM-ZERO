package divideAndConquere;

public class mergeSort {
    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,ei,mid);
    }

    public static void merge(int a[],int si,int ei,int mid){
        int i=si;
        int j=mid+1;
        int k=0;
        int temp[]=new int[ei-si+1];
        while(i<=mid&&j<=ei){
            if(a[i]<a[j]){
                temp[k]=a[i];
                k++;i++;
            }else{
                temp[k]=a[j];
                k++;j++;
            }
        }

        //if some part of left array left
        while(i<=mid){
            temp[k++]=a[i++];
        }

        while(j<=ei){
            temp[k++]=a[j++];
        }

        for(i=0,k=si;k<temp.length;k++,i++){
            a[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,5,4,1,2,3};
        mergeSort(arr, 0, 5);
        printArr(arr);
    }
}

package divideAndConquere;

public class searchInRotatedArray{
    public static int search(int arr[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }

        //mid
        int mid=si+(ei-si)/2;

        //check if target is on mid
        if(arr[mid]==target){
            return mid;
        }

        //case 1
        if(arr[si]<=arr[mid]){
            //case a
            if(arr[si]<=target&& target<=arr[mid]){
                return search(arr,target,si,mid);
            }else{ //case b
                return search(arr,target,mid+1,ei);
            }
        }else{ //case 2
            if(target>arr[mid]&&target<=arr[mid]){ //case a
               return search(arr,target,mid+1,ei);
            }else{//case b
               return search(arr,target,si,mid);
            }
        }
    }
    public static void main(String[] args) {
        int a[]={4,5,6,7,0,1,2};
        int targetIdx=search(a,0,0,6);
        System.out.println(targetIdx);
    }
}


/*
Write a java program to search an element in a given list of elements using binary search mechanism
*/



public class Ex_2_A {
    public static void binarysearch(int arr[],int first,int last,int key)
    {
        int mid = (first+last)/2;
        if(first<last)
        {
            if(key<arr[mid])
            {
                last = mid-1;
            }
            else if(arr[mid]==key)
            {
                System.out.println("key value found at"+mid);
            }
            else
            {
                first = mid+1;
            }
            mid=(first+last)/2;
        }
        else
        {
            System.out.println("key element not found");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 3;
        int last = arr.length-1;
        binarysearch(arr,0,last,key);
    }
}

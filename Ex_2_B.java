/*
Write a java program to sort for an element in a given list of elemnets using bubble sort
*/

public class Ex_2_B {
    public static  void bubblesort(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,2,6,1,8};
        int n=arr.length;
        bubblesort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}

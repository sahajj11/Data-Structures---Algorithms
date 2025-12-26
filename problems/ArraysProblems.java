package problems;

import java.util.*;

public class ArraysProblems {

// basic beginner friendly problems

    public void reverseArray(int [] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
    }

    public int maxElement(int[] arr){
        int max=arr[0];

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                max=arr[i+1];
            }

        }

        return max;
    }

    public int sumOfElements(int[] arr){
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        return sum;
    }

    public boolean isSorted(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        int[] arr={3,4,5,6,7};
        ArraysProblems obj=new ArraysProblems();

        obj.reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(obj.maxElement(arr));

        System.out.println(obj.sumOfElements(arr));

        System.out.println(obj.isSorted(arr));

        
    }
}

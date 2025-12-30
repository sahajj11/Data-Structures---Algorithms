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


    //FIND THE SECOND LARGEST ELEMENT PROBLEM
    
    //brute force approach for solving secondLargest elemnt problem
    public int secondLargestElement(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);

        int largest=arr[n-1];
        int secondLargest=0;

        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                secondLargest=arr[i];
                
                break;
            } 
        }

        return secondLargest;
    }
    //better aproach 
    public int secondLar(int[] arr){
        int n=arr.length;

        int largest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        
        int secondLargest=0;
        for(int i=0;i<n;i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }

        }

        return secondLargest;
    }

    //optimal approach
    public int secLargest(int[] arr){
        int largest=arr[0];
        int sLargest=-3;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }
            else if(arr[i] < largest && arr[i]>sLargest){
                sLargest=arr[i];
            }
        }

        return sLargest;
    }
    public static void main(String[] args) {

        int[] arr={3,4,6,6,6};
        ArraysProblems obj=new ArraysProblems();

        obj.reverseArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(obj.maxElement(arr));

        System.out.println(obj.sumOfElements(arr));

        System.out.println(obj.isSorted(arr));

        System.out.println(obj.secondLargestElement(arr));

        System.out.println(obj.secondLar(arr));

        System.out.println(obj.secLargest(arr));

        
    }
}

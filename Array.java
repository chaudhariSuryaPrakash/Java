import java.util.*;


class ArrayOperations{

   public int elemSum(int[] arr){
    int sum= 0;
    for(int num :arr){
        sum += num;
    }
    return sum;
   }

   public int findMax(int[] arr){
    int max = arr[0];
    for(int num:arr){
         if(num > max){
            max = num;
        }
    }
    return max;
   }


   public int[] sortArray(int[] arr){
    for(int i = 0; i < arr.length - 1; i++){
        for(int j = i + 1; j < arr.length; j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr;
   }

   public int[] reverseArray(int[] arr){
    int start =0;
    int end = arr.length - 1;
    while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    return arr;
   }

   public int[] mergeArrays(int[] arr, int[] arr2){
    
    int[] mergedArray = new int[arr.length+ arr2.length];
    int index = 0;

    for(int num : arr){
        mergedArray[index++] = num;
    }
    for(int num : arr2){
        mergedArray[index++] = num;
        }

    Arrays.sort(mergedArray);
    return mergedArray;
   }

public int[] rotateArray(int[] arr, int k){
    int n = arr.length;
    k = k % n; // Handle cases where k is greater than n
    int[] rotatedArray = new int[n];
    System.out.println("k: " + k);
    System.out.println("n: " + n);
    System.out.println("Array length: " + arr.length);
    for(int i = 0; i < n; i++){
        rotatedArray[(i + k) % n] = arr[i];
    }
    return rotatedArray;
   }

   public int findSecondLargest(int[] arr){
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    for(int num : arr){
        if(num > first){
            second = first;
            first = num;
        } else if(num > second && num != first){
            second = num;
        }
    }
    return second;
   }
   public int findDuplicates(int[] arr){
    Set<Integer> seen = new HashSet<>();
    Set<Integer> duplicates = new HashSet<>();

    for(int num : arr){
        if(!seen.add(num)){
            duplicates.add(num);
        }
    }
    return duplicates.size();
   }



}


public class Array {
//     Beginner:

// Create an array of 5 integers and print them using a loop.

// Find the sum of all elements in an array.

// Find the maximum number in an array.

// Intermediate:
// 4. Sort an array without using built-in functions.
// 5. Reverse an array in-place.
// 6. Merge two arrays.

// Advanced:
// 7. Rotate an array by k positions.
// 8. Find duplicates in an array.
// 9. Find the second largest number in an array.

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Array Operations");
// Beginner:

    int[] numbers = new int[5];

    for(int i=0; i<numbers.length; i++){
        System.out.print("Enter number " + (i+1) + ": " );
        numbers[i] =  sc.nextInt();
}
 for(int num : numbers){
    System.out.println("Number: " + num);
 }
 ArrayOperations arrayops = new ArrayOperations();
 int sum = arrayops.elemSum(numbers);
 System.out.println("Sum of elements: " + sum);

 int max = arrayops.findMax(numbers);
 System.out.println("Maximum number: " + max);

 int[] sortedArray = arrayops.sortArray(numbers);
 System.out.println("Sorted array: " + Arrays.toString(sortedArray));

 int[] reversedArray = arrayops.reverseArray(numbers);
 System.out.println("Reversed array: " + Arrays.toString(reversedArray));

 int numbers2[] = new int[5];

 for(int i=0; i<numbers2.length; i++){
     System.out.print("Enter number " + (i+1) + ": " );
     numbers2[i] =  sc.nextInt();
 }
System.out.println("numbers: " + Arrays.toString(numbers));

 System.out.println("numbers2: " + Arrays.toString(numbers2));



 int[] mergedArray = arrayops.mergeArrays(numbers, numbers2);
 System.out.println("Merged array: " + Arrays.toString(mergedArray));

 
    System.out.print("Enter number of positions to rotate: ");
    int k = sc.nextInt();
    int[] rotatedArray = arrayops.rotateArray(numbers, k);
    System.out.println("Rotated array: " + Arrays.toString(rotatedArray));
    int secondLargest = arrayops.findSecondLargest(numbers);
    System.out.println("Second largest number: " + secondLargest);

    int duplicatesCount = arrayops.findDuplicates(numbers);
    System.out.println("Number of duplicates: " + duplicatesCount);
    System.out.println("End of Array Operations");
    sc.close();
    }

}



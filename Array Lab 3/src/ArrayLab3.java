/* Kelly Luo APCS2 11/6/16
 * This code includes methods sum, append, remove, sumEven, and rotateRight. 
 * They all manipulate an array of integers depending on the method called. 
 */





import java.util.Arrays;



public class ArrayLab3 

{
	/*

	 * Write a main method that will 

Contain

integer arrays a1, a2, sumArr, appendArr, removeArr

int variables appendNum, removeIdx, sumOfEvens

Carry out the following actions

Declare array a1 containing the values (5, 10, 15, 20, 25, 30, 35, 40) 

and array a2 containing the values (7, 14, 21, 28, 35, 42, 49, 56)

Form sumArr by calling the sum method with a1 and a2 as inputs

Declare int appendNum and set it to 200.

Form appendArr by calling the append method with a1 and appendNum as inputs

Declare int removeIdx and set it to 5.

Form removeArr by calling remove with a2 and removeIdx

Form sumOfEvens by calling sumEven with appendArr as the input

Call rotateRight with a1 as the input

On their own lines print out (use Arrays.toString to transform arrays into a printable strings) :

sumArr

appendArr

removeArr

sumOfEvens (an int you don?t need Arrays.toString)

a1

	 */

	public static void main(String[] args) 

	{

		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};

		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};

		int[] sumArr = sum(a1, a2);

		int appendNum = 200;

		int[] appendArr = append(a1, appendNum);

		int removeIdx = 5;

		int[] removeArr = remove(a2, removeIdx);

		int sumOfEvens = sumEven(appendArr);

		rotateRight(a1);

		System.out.println(Arrays.toString(sumArr));

		System.out.println(Arrays.toString(appendArr));

		System.out.println(Arrays.toString(removeArr));

		System.out.println(sumOfEvens);

		System.out.println(Arrays.toString(a1));

	}


	/*

	 * Write a method named sum that accepts two arrays of integers arr1 and arr2 

	 * and returns an array of integers, 

	 * in which every element is the sum of the elements at that index for the arrays arr1 and arr2. 

	 * You can assume arrays arr1 and arr2 have at least one element each and are the same length.

	 */

	public static int[] sum(int[] arr1, int[] arr2)

	{

		assert (arr1.length > 0);

		assert (arr2.length > 0);

		assert (arr1.length == arr2.length);

		int[] newArr = new int[arr1.length];	// newArr of sum

		for(int i = 0; i < arr1.length; i++){	// for loop through each index of array

			newArr[i] = arr1[i] + arr2[i];	// adds together indexes of arr1 and arr2

		}

		return newArr;

	}


	/*

	 * Write a method named append that accepts an array of integers arr of length n 

	 * and an integer num, and returns an array of integers of length n+1 

	 * that consists of the elements of arr with num appended to the end.  

	 * You can assume array arr has at least one element.

	 */

	public static int[] append(int[] arr, int num)

	{


		assert (arr.length > 0);	 

		int[] newArr = new int[arr.length + 1];	// add one to array length

		for(int i = 0; i < arr.length; i++){	// for loop for each array index

			newArr[i] = arr[i];	// puts the same array in a new one

		}

		newArr[newArr.length - 1] = num; // num added to end of array

		return newArr;

	}


	/*

	 * Write a method named remove that accepts an array of integers arr and an integer idx 

	 * and returns an array of integers consisting of all of the elements of arr 

	 * except for the element at index idx (thus, the returned array has a length of arr.length ? 1).  

	 * You can assume arr has at least two elements.

	 */

	public static int[] remove(int[] arr, int idx)

	{

		int offset = 0;	// declare variable to check for offset

		int[] newArr = new int[arr.length - 1];	// array with one less value
		for(int i = 0; i < newArr.length; i++){	// for loop goes through each value

			if (i != idx){	// tests that index value != to idx

				newArr[i] = arr[i];	// newArr = previous indices if value != idx

			}else{

				newArr[i] = arr[i + 1];	// if i == idx, skip an index

				offset++;	// offset is increased by 1

			}

			if (offset > 0){	// tests for any offset

				newArr[i] = arr[ i + 1];	// i is incremented by 1 since there is offset

			}

		}

		return newArr;

	}


	/*

	 * Write a method sumEven that accepts an array of integers arr 

	 * and returns an integer containing the sum of the elements at the even indices of arr.  

	 * (That means elements at indices 0,2,4,6,8.)  You can assume arr has at least one element.

	 */

	public static int sumEven(int[] arr)

	{

		assert (arr.length > 0);

		int sum = 0;	// declare sum variable

		for (int i = 0; i<= arr.length; i++){	// for loop goes through each index

			if (i % 2 == 0){	// tests index if even

				sum += arr[i];	// add that even value to overall sum

			}

		}

		return sum; 


	}


	/*

	 * Write a method rotateRight that accepts an array of integers arr 

	 * and does not return a value.  

	 * The rotateRight method moves each element of arr one index to the right 

	 * (element 0 goes to element 1, element 1 goes to element 2, ?, element n-1 goes to element 0).  

	 * You can assume arr has at least one element.

	 */

	public static void rotateRight(int[] arr)

	{

		assert (arr.length > 0);

		int lastNum = arr[arr.length - 1];	// declare variable for last value that wouldn't be added

		for (int i = arr.length - 1; i >= 1; i--){	// for loops goes through each index

			arr[i] = arr[i - 1];	// values being replaced to the right

		}

		arr[0] = lastNum;	// last value placed in the front

	}





	
}
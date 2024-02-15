
class Binary_Search {

	int binarySearch(int arr[], int l, int r, int x)
	{
		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (arr[mid] == x)
				return mid;
		
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}


	public static void main(String args[])
	{
		Binary_Search ob = new Binary_Search();
		int arr[] = {12,23,34,45,56,67,78,89,90,92,96,99};
		int n = arr.length;
		int x = 92;

		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element is not present in array");
		else
			System.out.println("Element is present at index " + result);
	}
    //Time-Complexity
    //worst-case: O(log n)
    //best-case: O(1) when mid = x 
}


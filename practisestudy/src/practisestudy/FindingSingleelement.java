package practisestudy;

public class FindingSingleelement {
	static void findingSingleelement(int[] arr)
	{
		int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid % 2 == 1) {
                mid--; // Make sure mid is always at even index
            }

            if (arr[mid] != arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }

        System.out.println("The single element in the array is: " + arr[left]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,4,4,7,7,9};
		findingSingleelement(arr);

	}

}

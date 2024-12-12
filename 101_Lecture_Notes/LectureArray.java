/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int[] arr = {5, 5, 7, 7, 7, 2, 9, 9};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int x = 8;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
                System.out.println("Duplicates at indexes: " + i);
            }
        }
        int count1 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count1++;
                System.out.println("Consecutive numbers at: " + i + " and " + (i + 1));
            }
        }
	}
}
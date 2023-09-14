public class MissingNumber {
public static void main(String[] args) {
    int[] arr = {1, 4, 3, 2, 8, 6, 7};
    int n = arr.length + 1; 
    int expectedSum = (n * (n + 1)) / 2;  
    int actualSum = 0;
    for (int num : arr) {
        actualSum += num;
    }
    int missingElement = expectedSum - actualSum;
    System.out.println("The missing element is: " + missingElement);
}
}
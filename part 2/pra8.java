import java.util.Scanner;

class pra8 {
    public static int arrayCounter9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int result = arrayCounter9(array);
        System.out.println("Number of 9's in the array: " + result);

        sc.close();
    }
}


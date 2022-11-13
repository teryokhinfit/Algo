import java.util.Arrays;

public class FastSort {
    static int [] A = {27, 92, 54, 24, 76, 45, 14, 81, 72, 31, 81, 13, 17, 70, 48, 20, 58, 35, 57, 97};
    static int pi = 8 ;
    static int n = A.length;

    public static void main(String[] args) {
        pivoting(A,pi);
        System.out.println(Arrays.toString(A));
    }

    public static void pivoting (int [] A, int pi) {
        int left = 0;
        int right = n - 1; //


        int pivot = A[pi];
        while (true) {
            while (A[left] <= pivot) {
                left +=1;
            }
            while(A[right] > pivot){
                right -=1;
            }
            if (left >= right) {
                pivot = A[left];


            }else {
                toSwap(left, right);
            }
            if (left != n -1 )
            {
            left += 1;}
            right -= 1;

        }

    }

    private static void toSwap(int first, int second) {
            int MiniM = A[second];
            A[second] = A[first];
            A[first] = MiniM;
        }

}


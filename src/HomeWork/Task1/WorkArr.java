package HomeWork.Task1;

/**
 * Created by User on 14.12.2016.
 */
public class WorkArr {
    private int min(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (res > arr[i]) {
                res = arr[i];
            }
        }
        return res;
    }


    private int max(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (res < arr[i]) {
                res = arr[i];
            }
        }
        return res;
    }

    private int avg(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return (res / arr.length);
    }

    private void revers(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        WorkArr arr = new WorkArr();
        int[] initAr = {2, 56, 78, 98, 23, 8};
        System.out.println("Min: " + arr.min(initAr));
        System.out.println("Max: " + arr.max(initAr));
        System.out.println("Avg: " + arr.avg(initAr));
        System.out.print("Revers: ");
        arr.revers(initAr);
    }
}
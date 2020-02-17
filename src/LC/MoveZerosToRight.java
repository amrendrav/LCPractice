package LC;

public class MoveZerosToRight {
    public void moveZeroes(int[] arr) {
        if (arr == null) {
            return;
        }

        int write_index = 0;
        int read_index = 0;

        while(read_index < (arr.length)) {
            if(arr[read_index] != 0) {
                arr[write_index] = arr[read_index];
                write_index++;
            }

            read_index++;
        }

        while(write_index < (arr.length)) {
            arr[write_index] = 0;
            write_index++;
        }
    }
}

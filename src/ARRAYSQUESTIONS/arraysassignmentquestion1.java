package ARRAYSQUESTIONS;

public class arraysassignmentquestion1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;

                }
            }
        }
            if (flag) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }


        }
    }


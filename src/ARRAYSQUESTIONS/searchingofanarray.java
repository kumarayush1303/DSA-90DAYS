package ARRAYSQUESTIONS;

public class searchingofanarray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        boolean flag = false;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==target){
                System.out.println("index=" +i);
                return;
            }
        }

        System.out.println("target missing");
    }

}

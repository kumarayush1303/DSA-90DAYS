//declaration/defination
public class methods1 {
    static void print2katable(){
        for (int i = 1; i <=10 ; i++) {
        int ans = 2*i;
            System.out.println("->" + ans);
        }
    }
    public static void main(String[] args) {
        System.out.println("hi");
        //call method
        print2katable();
        System.out.println("bye");
    }
}

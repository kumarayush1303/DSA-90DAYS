package RECURSION;

public class freindspairingproblem {
    public static int freindsPairing(int n){
        //base case
        if (n==1 || n==2){
            return n;
        }
        //choice
        //single
        int fnm1 = freindsPairing(n-1);
        //pair
        int fnm2 = freindsPairing(n-2);
        int pairWays = n-1 * fnm2;
        //total ways
        int totWays = fnm1 + pairWays;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(freindsPairing(3));
    }
}

package STRINGS;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch= 'a'; ch<='z'; ch++) {
            sb.append(ch);
            //append ka mtlb ek ke peeche judte chle jaana
        }
        System.out.println(sb);
    }
}

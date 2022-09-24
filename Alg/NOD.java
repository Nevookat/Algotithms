package Alg;

public class NOD {
    public static void main(String[] args) {
        System.out.println(gcd(30,18));
    }
    public static int gcd(int a, int b){
        while(b!=0){
            int temp = a%b; //9%5 = 4
            a = b;
            b = temp;
        }
        return  a;
    }
}

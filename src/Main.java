public class Main {
    public static void main(String[] args) {
        boolean result = false;
        int n = 0;
        while (!result) {
            if ((n*n*n+91) % 47 == 0) {
                result = true;
                System.out.println(n);
            }
            n++;
        }
    }
}
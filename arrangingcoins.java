public class arrangingcoins {
    public static void main(String[] args) {
        int x = 10;
        int count = 1;
        while (x >= count) {
            x = x - count;
            count++;
        }
        System.out.println(count-1);
    }
}

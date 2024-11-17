public class Ascend {
    public static void main(String[] args) {
        int n = Integer.parseInt(args [0]);
        int a = (int) (Math.random() * n);
        int b = (int) (Math.random() * n);
        int c = (int) (Math.random() * n);
        int min1 = (Math.min(a, b));
        int min2 = (Math.min(min1, c));
        int max1 = (Math.max(a, b));
        int max2 = (Math.max(max1, c));
        int middle = a + b + c -min2 - max2;
        
        System.out.println(min2 + " " + middle + " " + max2);

    }

}

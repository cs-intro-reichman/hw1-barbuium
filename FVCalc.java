public class FVcalc {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java FVCalc <currentValue> <interestRate> <years>");
            return;
        }
        int currentValue = Integer.parseInt(args [0]);
        double rate = Double.parseDouble(args [1]);
        int n = Integer.parseInt(args [2]);

        double futureValue = currentValue * Math.pow(1 + rate / 100, n);
        System.out.println("After $d years, a $%d saved at %.1f%% will yield $%d\n", n,currentValue, rate, (int) futureValue);
        

    }

}

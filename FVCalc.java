public class FVcalc {
    public static void main(String[] args) {
       
        int currentValue = Integer.parseInt(args [0]);
        double rate = Double.parseDouble(args [1]);
        int n = Integer.parseInt(args [2]);
        double futureValue = currentValue * Math.pow(1 + rate / 100, n);

        System.out.println("After " + n + " years, a $" + currentValue + 
        " saved at " + String.format("%.1f", rate) + " will yield $" + (int) futureValue);

    }

}

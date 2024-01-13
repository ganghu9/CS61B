public class ArgsSum {
    public static void main(String[] args) {
//        String[] argus = {"1", "2", "3", "4"};
        int length = args.length;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += Integer.parseInt(args[i]);
        }

//        Enhanced for loop
//        for (String arg : args) {
//            sum += Integer.parseInt(arg);
//        }

        System.out.println("The sum of total is: " + sum);
    }
}

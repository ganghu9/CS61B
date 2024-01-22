public class ClassNameHere {
    public static int max(int[] m) {
        int length = m.length;
        int max = 0;
        for (int i = 0; i < length; i++)
        {
            if (m[i] >= max)
            {
                max = m[i];
            }
        }
        System.out.println("Maximum is :" + max);
        return max;
    }

    public static int sum(int[] a) {
//        int i = 0; //initialization
//        int sum = 0;
//        while (i < a.length) { //termination
//            sum = sum + a[i];
//            i = i + 1; //increment
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        max(numbers);
    }
}
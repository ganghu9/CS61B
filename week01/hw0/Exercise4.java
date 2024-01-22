public class Exercise4 {

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        windowPosSum(a, 3);

        int[] b = {1, -1, -1, 10, 5, -1};
        windowPosSum(b, 2);
    }

    public static void windowPosSum(int[] a, int n)
    {
        int length = a.length;
        for (int i = 0; i < length; i++)
        {
            if (a[i] > 0)
            {
                int sum = 0;
                for (int index = i; index <= (i + n) && index < length; index++)
                {
                    sum += a[index];
                }
                a[i] = sum;

            }
        }
        System.out.println(java.util.Arrays.toString(a));
    }
}
public class Triangle1b {
    public static void main(String[] args) {
        DrawTriangle(10);
    }

    public static void DrawTriangle(int N)
    {
        int count = 1;
        String star = "*";
        while (count <= N)
        {
            System.out.println(star);
            star += "*";
            count += 1;
        }
    }
}
public class Triangle1a {
    public static void main(String[] args) {
        int count = 1;
        String star = "*";
        while (count <= 5)
        {
            System.out.println(star);
            star = star + "*";
            count += 1;
        }
    }
}
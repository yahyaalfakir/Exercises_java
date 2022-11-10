public class Lab2Q6 {
    public static void main(String[] args) {
        String s = "Hello";
        String t = "World";
        System.out.println(s);
        System.out.println(t);

        int k = s.length() + t.length();
        System.out.println(k);

        System.out.println(s.substring(1,2));

        System.out.println(s.substring(s.length() / 2, s.length()));

        System.out.println(s + t);

        System.out.println(t + s);


    }
}
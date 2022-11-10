public class Lab1Q4 {
    public static void main(String[] args) {

        int euro = 1000;
        double rate = 0.05;
        double y0, y1, y2, y3;

        y0 = euro;
        y1 = euro * rate + euro;
        y2 = y1 * rate + euro;
        y3 = y2 * rate + euro;

        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);


    }
}
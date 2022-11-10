import java.util.Scanner ;
public class Lab3Q1 {
    public static void main(String[] args) {
        int n = 1;
        int m = -1;
        if (n < -m) {
            System.out.print(n);
        } else { System.out.print(m);
            //---------- Print = -1


        }
        //----------
        int n = 1;
        int m = -1;
        if (-n >= m)
        { System.out.print(n); }
        else { System.out.print(m);
            //---------- Print = 1
        }


        //----------
        double x = 0;
        double y = 1;
        if (Math.abs(x - y) < 1)
        { System.out.print(x); }
        else { System.out.print(y);
            //---------- Print = 1.0
        }

        //----------
        double x = Math.sqrt(2);
        double y = 2;
        if (x * x == y)
        { System.out.print(x); }
        else { System.out.print(y);
            //---------- Print = 2.0
        }

    }
}
//Home work question 1
public class PerimeterTester {
    private int height ;
    private int width ;

    public PerimeterTester (int height , int width){
        this.height = height ;
        this.width = width ;
    }
    public PerimeterTester (){
        this.height = 0 ;
        this.width = 0 ;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width){
        this.width = width ;
    }

    public int getWidth() {
        return width;
    }

    public void displayresult (){
        System.out.println(2*(width + height));
    }
}

public class lab
{
    public static void main(String[] args) {
        PerimeterTester x = new PerimeterTester() ;
        x.setHeight(50);
        // return 50
        x.getHeight() ;
        x.setWidth(50);
        // return 50
        x.getWidth() ;
        // return 2*(50+50) = 200 ;
        x.displayresult();
    }
}

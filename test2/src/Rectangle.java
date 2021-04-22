public class Rectangle {
    private double width;
    private double height;
    private String color;

    //构造函数
    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    //get  set方法
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //getArea getLength方法
    public double getArea(){
        return width*height;
    }

    public  double getLength(){
        return 2*(width+height);
    }

    public static void main(String[] args) {
        //初始赋值
        Rectangle rectangle=new Rectangle(2.5,3.6,"red");
        //修改前访问
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getColor());
        //修改
        rectangle.setHeight(4.5);
        rectangle.setColor("green");
        rectangle.setWidth(7.2);
        //修改后访问
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getColor());
        //计算周长面积
        System.out.println("长方形面积是"+rectangle.getArea());
        System.out.println("长方形周长是"+rectangle.getLength());
    }
}


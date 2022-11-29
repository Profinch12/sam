public class box {
    public double width;
    public double height;
    public double depth;

    public box(double width, double height, double depth) {
        System.out.println("parameterized constructor");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public box(double width, double height) {
        System.out.println("parameterized constructor with overloading");
        this.width = width;
        this.height = height;
        depth=2;
    }
    box(box s)
    {
        System.out.println("copy constructor");
        width=s.width;
        height=s.height;
        depth=s.depth;
    }
    box()
    {
        System.out.println("default constructor");
        width=10;
        height=10;
        depth=10;
    }
    public double volume()
    {
        return (width*height*depth);
    }
    public static void main(String[] args) {
        box mybox1=new box();
        box mybox2=new box(2,5,6);
        box mybox3=new box(4,7,5);
        box mybox4=new box(mybox2);
        System.out.println(mybox1.volume());
        System.out.println(mybox2.volume());
        System.out.println(mybox3.volume());
        System.out.println(mybox4.volume());

    }
}

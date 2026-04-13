import java.util.Objects;

public class Rectangle extends Shape implements Colorable , Comparable<Rectangle> {
    protected double width;
    protected double length;
    protected String color;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public Rectangle(){
        this.width = 7;
        this.length  = 5;
    }

    public Rectangle(double size){
        this.length = size;
        this.width = size;
    }



    public double getWidth() {
        return width;
    }

    public void setWidth(double width) throws IllegalParameter {
        if(width<=0 || width> 1000 ){
            String msg = width + " illegal width, valid width (0,1000]";
            throw new IllegalParameter(msg);
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) throws IllegalParameter {
        if(length<=0 || length>1000){
            String msg = length + " is illegal Length, valid length (0, 1000] ";
            throw new IllegalParameter(msg);
        }
        else
            this.length = length;
    }
    public void setColor(String color) {this.color = color;}
    public String getColor(){ return this.color;}
    public double computeArea(){ return this.width*this.length;}
    public double computeScope(){ return 2*(this.width+this.length);}
    public void display(){
        System.out.print("[length = " + this.length+", width = " + this.width+
                ", area = "+ this.computeArea()+", scope = " +this.computeScope()+", color = "+this.color+"]");
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0 && Double.compare(length, rectangle.length) == 0&&
                this.color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        int h = 0;
        h = 31*h + Double.hashCode(width);
        h = 31*h + Double.hashCode(length);
        h = 31*h + color.hashCode();
        return h;
    }
    public int compareTo(Rectangle obj){
        return Double.compare(this.computeArea(),obj.computeArea());

    }
}

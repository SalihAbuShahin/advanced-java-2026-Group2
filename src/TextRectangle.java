import java.util.Objects;

public class TextRectangle extends Rectangle {
    private String text;

    public TextRectangle(double width, double length, String text) {
        super(width, length,"red");
        this.text = text;
    }
    public TextRectangle(double size, String text) {
        super(size);
        this.text = text;
    }

    public TextRectangle(String text) {
        super();
        this.text = text;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void display(){
        super.display();
        System.out.println(":"+this.text);
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TextRectangle)) return false;
        if (!super.equals(o)) return false;
        TextRectangle that = (TextRectangle) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text);
    }
}

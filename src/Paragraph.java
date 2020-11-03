public class Paragraph implements Element {
    public String name;
    AlignStrategy textAlignment;

    Paragraph(String n)
    {
        name=n;
    }
    public void print()
    {
        System.out.println("Paragraph: "+name);
    }

    public void setAlignStrategy(AlignStrategy s){
        ;
    }
}

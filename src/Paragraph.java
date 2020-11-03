public class Paragraph implements Element {
    public String name;
    private AlignStrategy alignStrategy;

    Paragraph(String n)
    {
        name=n;
    }
   /* public void print()
    {
        System.out.println("Paragraph: "+name);
    }*/

    public void print(){

        if(alignStrategy==null) {
            System.out.println(this.name);
        }else{
            alignStrategy.render(new Paragraph(this.name));
        }
    }
    public String getPar(){
        return name;
    }

    public void setAlignStrategy(AlignStrategy s){

        this.alignStrategy=s;
    }
}

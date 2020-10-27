import java.awt.*;

public class ImageProxy implements Element{

    String url;
    Image realImage=null;

    public ImageProxy(String s){
        url=s;
    }

    Image loadImage(){

        if(realImage==null){
            realImage=new Image(url);
        }
        return realImage;
    }

    public void print() {
        System.out.println("Image with name: "+url);
    }
}

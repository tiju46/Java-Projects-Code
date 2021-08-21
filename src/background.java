import javafx.scene.layout.Background;

public class background {

    Color color;
    public background(Color color){
        this.color=color;
    }

    public void foreground(){
        System.out.println("Color Pgm");
        switch (color){
            case Red:
                System.out.println("Red Color");
                break;
            case White:
                System.out.println("White Color");
                break;
            case Yellow:
                System.out.println("Yellow Color");
                break;
                default:
                    System.out.println("No Color Selected");
        }
    }

    public static void main(String[] args) {
        String colorselect="Red";
        background bg = new background(Color.valueOf(colorselect));
        bg.foreground();
    }
}

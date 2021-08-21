public class constructoreg {
    public static void main(String[] args) {
        democonstructor dem =new democonstructor(5,10);
        dem.display();
    }
}


class democonstructor{

    private int item;
    private int rate;

    public democonstructor(int item,int rate){
        this.item = item;
        this.rate = rate;

    }

    void display(){
        System.out.println("Value = " + item*rate);
    }
}
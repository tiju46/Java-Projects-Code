import sun.awt.geom.AreaOp;

class demo {

    String name = "tiju";

public demo(){
    System.out.println("Super Class Constructor");
}

public void superclassmethod(){
    System.out.println("Super Class Method");
}

}


public class sample extends demo{
    public sample(){
        super();
    }
    String name = "Tom";

    public void thisissample(){
        System.out.println(super.name);
        super.superclassmethod();

    }

    public static void main(String[] args) {

        sample sam = new sample();
        sam.thisissample();

    }
}
package test;
import src.*;


public class driver{

    public static ProductFactory create(String type){
        ProductFactory factory;

        switch (type){
            case "MINI":
                 factory= new MiniFactory();
                 return factory;
            case "STANDARD":
                factory= new FullSizeFactory();
                return factory;
        }

        return null;

    }

    public static void main(String[] aargs) {

        ProductFactory mini = null;
        ProductFactory standard = null;


        mini = create("MINI");
        standard = create("STANDARD");

        mini.createKeyboard();
        mini.createMouse();
        mini.setPrices();
        mini.getPrices();

        standard.createMouse();
        standard.createKeyboard();
        standard.setPrices();
        standard.getPrices();


        // if (input == "mini"){
        //     product = new MiniFactory();
        //     product.createKeyboard();

        // } else {
        //     product = new FullSizeFactory();
        //     product.createKeyboard();

        // }


    }

}



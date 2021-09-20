package src;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MiniFactory implements ProductFactory {

    private double keyboardPrice;
    private double mousePrice;

    @Override
    public void createKeyboard() {
        System.out.println("Created Mini Keyboard");  
        
    }
    
    @Override
    public void createMouse() {
        System.out.println("Created Mini Mouse");          
    }

    @Override
    public void getPrices() {

        System.out.println("\nMini");
        System.out.println("Mouse: " + mousePrice + ", Keyboard: " + keyboardPrice);
        
    }

    @Override
    public void setPrices() {
   

        String path = System.getProperty("user.dir") + "/src/database.csv";

        String delimiter = ",";
        String line = "";
        String[] tempArr;

        File file = new File(path);
        FileReader fr;

            try {
                fr = new FileReader(file);

                BufferedReader br = new BufferedReader(fr);
                int i=0;
    
                try {
                    while((line=br.readLine()) != null){
                        tempArr= line.split(delimiter);
    
                        if (tempArr[0].equals("mini")){
                            if (tempArr[1].equals("keyboard"))
                                keyboardPrice = Double.parseDouble(tempArr[2]);
                            else
                                mousePrice = Double.parseDouble(tempArr[2]);
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } 
  

            catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }

    }
    
}

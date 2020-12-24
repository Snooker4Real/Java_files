import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        try{
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \nViolets are blue \nBooty booty booty booty \nRockin' everywhere");
            writer.append("\n(A poem by Jonathan)");
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

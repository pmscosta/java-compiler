import jjt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class jmm {
    public static void main(String args[]) throws ParseException {
        // criação do objecto utilizando o constructor com argumento para

        int size = args.length;
        String fileName = args[size - 1];
        FileInputStream file;

        try {
            file = new FileInputStream(fileName);
            jmm_parser parser = new jmm_parser(file);
            SimpleNode root = parser.ClassDeclaration();
            root.dump("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
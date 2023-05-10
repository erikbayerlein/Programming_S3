import cpf_service.FileService;
import java.io.IOException;

public class Main {
    public static void main (String[] args) {

        final String pathPrefix = "/Users/erikbayerlein/Documents/GitHub/Programming_S3/TP01/cpf_service"; // path to access the input and output files in my computer

        FileService service = new FileService(pathPrefix + "/Input_names.txt", pathPrefix + "/Input_cpf.txt", pathPrefix + "/Output.txt"); // creates a FileService object with the input and output paths

        try{
            service.buildRelationship(); // call the buildRelationship method of the service object
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
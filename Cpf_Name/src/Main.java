import service.Merge;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        String absolutePath = new String("/Users/erikbayerlein/Documents/GitHub/Programming_S3/Cpf_Name/src/service");
        String inCpfPath = new String("/Input_cpf.txt");
        String inNamePath = new String("/Input_name.txt");
        String out = new String("/Output.txt");

        Merge result = new Merge(absolutePath + inCpfPath, absolutePath + inNamePath, absolutePath + out);

        try{
            result.buildRelationship();
        } catch (IOException e) {
            System.out.println(e.fillInStackTrace());
        }

    }
}
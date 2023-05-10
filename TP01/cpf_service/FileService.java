package cpf_service;

import java.io.*;
import java.util.HashMap;
import java.util.Set;
import java.util.List;

public class FileService {

    private HashMap<String, String> relationships = new HashMap<>(); // where the cpf's and the names will be saved
    private String pathInNames; // input path
    private String pathInCpf; // input path
    private String pathOut; // output path

    public FileService(String pathInNames, String pathInCpf, String pathOut) { // constructor method
        this.pathInNames = pathInNames;
        this.pathInCpf = pathInCpf;
        this.pathOut = pathOut;
    }

    public void buildRelationship() throws IOException {
        readFile();
        writeFile();
    }

    private void readFile() throws IOException {

        BufferedReader readerNames = new BufferedReader(new FileReader(pathInNames)); // creates a BufferedReader object that is capable of reading the input_name.txt file line by line
        BufferedReader readerCpf = new BufferedReader(new FileReader(pathInCpf)); // creates a BufferedReader object that is capable of reading the input_cpf.txt file line by line

        String linhaNames = readerNames.readLine(); // returns a line of the input_name.txt file
        String linhaCpf = readerCpf.readLine(); // returns a line of the input_cpf.txt file

        while (linhaNames != null || linhaCpf != null) { // stops when the line doen't have any information (null)
            if(isNumeric(linhaCpf)) {
                if (!relationships.containsKey(linhaCpf)) { // doesnt add if already exists a certain cpf in the hash map
                    relationships.put(linhaCpf, linhaNames); // adds the key linhaCpf and the value linhaNames to the hash map
                }
            }
            else { // in case that the information is inverted
                if (!relationships.containsKey(linhaNames)) {
                    relationships.put(linhaNames, linhaCpf);
                }
            }

            linhaNames = readerNames.readLine(); // once the start information is in the hash map, we call the readLine method to read the next line of the input
            linhaCpf = readerCpf.readLine();
        }

        readerNames.close(); // closes the buffered reader
        readerCpf.close();
    }

    private boolean isNumeric(String info) {
        return info.matches("\\d+"); // to check if the string is numeric or not
    }

    private void writeFile() throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(pathOut)); // creates a BufferedReader object that is capable of writing line by line

        Set<String> CPFs = relationships.keySet(); // the set of strings will contain all the cpfs
        for (String CPF : CPFs) { // for each cpf in cpfs
            try {
                writer.write(CPF + ";" + relationships.get(CPF) + "\n"); // writes in the output file
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        writer.close();
    }

}
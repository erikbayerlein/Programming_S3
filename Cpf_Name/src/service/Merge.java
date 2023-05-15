package service;
import java.io.*;
import java.util.*;

public class Merge {

    private Map<String, String> relation = new HashMap<>();
    private String inCpf, inName, out;

    public Merge(String inCpf, String inName, String out) {
        this.inCpf = inCpf;
        this.inName = inName;
        this.out = out;
    }

    public void buildRelationship() throws IOException {
        readFile();
        writeFile();
    }

    private void readFile() throws IOException {

        BufferedReader readerNames = new BufferedReader(new FileReader(inName));
        BufferedReader readerCpf = new BufferedReader(new FileReader(inCpf));

        String namesLine = readerNames.readLine();
        String cpfLine = readerCpf.readLine();

        while(namesLine != null || cpfLine != null) {
            if(!relation.containsKey(cpfLine)) {
                relation.put(cpfLine, namesLine);
            }

            namesLine = readerNames.readLine();
            cpfLine = readerCpf.readLine();
        }

        readerNames.close();
        readerCpf.close();
    }

    private void writeFile() throws IOException {

        BufferedWriter outWriter = new BufferedWriter(new FileWriter(out));

        Set<String> cpfKeys = relation.keySet();

        for(String cpf : cpfKeys) {
            try{
                outWriter.write(cpf + ";" + relation.get(cpf) + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        outWriter.close();
    }

}

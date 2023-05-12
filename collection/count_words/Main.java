import service_count.FileCount;
import service_frequency.FileWordFrequency;

public class Main {
    public static void main(String[] args) {

        String str = "I love love Java";

        FileCount countW = new FileCount();
        FileWordFrequency wordF = new FileWordFrequency();

        System.out.println(countW.Total(str));
        System.out.println(countW.Dif(str));

        wordF.Freq(str);

    }
}
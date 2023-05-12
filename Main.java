public class Main {
    public static void main (String[] args) {

        Derivada baseDerivada = new Base(); // erro (o filho não pode criar pai)
        int z = baseDerivada.i;
        String zstr = baseDerivada.teste();
        //System.out.println(z);
    }
}

class Base {
    int i = 1;

    String teste() {
        return "Base";
    }
}

class Derivada extends Base{
    int i = 2;

    String teste() {
        return "Derivada";
    }
}
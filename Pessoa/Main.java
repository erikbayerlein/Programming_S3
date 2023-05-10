class Main { // javac *.java compila todos os arquivos .java
    public static void main (String args[]) {

        Pessoa p1, p2;
        //p = new Pessoa("oi", 20, "M"); (por causa do abstract)

        p1 = new Feminino("Ana", 21);
        p2 = new Masculino("Tiago", 20);

        Casamento c = new Casamento (p1, p2);


        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p1.getSexo());
        System.out.println(c);

        System.out.println(p2.getNome());
        System.out.println(p2.getIdade());
        System.out.println(p2.getSexo());
        System.out.println(p2.getCasamento());

    }
}
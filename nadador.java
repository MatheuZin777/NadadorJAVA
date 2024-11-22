public class nadador {
    String nome;
    String idade;

    void borb() {
        System.out.println("O nadador esta fazendo o nado borboleta.");
    }

    void boiar() {
        System.out.println("O nadador esta boiando.");
    }

    void mergulhar(String mergulho) {
        System.out.println("O nadador mergulhou e" + mergulho + ".");
    }

    public static void main(String[] args) throws Exception {
        nadador Nadar = new nadador();
        Nadar.nome = "MAT";
        Nadar.idade = "18";

        // EXIBIR INFORMACOES SOBRE O CARRO
        System.out.println("O nome do nadador e " + Nadar.nome + " e a idade e " + Nadar.idade + ". ");
        Nadar.borb();
        Nadar.boiar();
        Nadar.mergulhar(" encostou no fundo da piscina");
    }
}

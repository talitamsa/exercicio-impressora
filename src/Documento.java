public class Documento implements Imprimivel {
    private String nome;
    private String tipoDeArquivo;

    public Documento(String nome, String tipoDeArquivo){
        this.nome = nome;
        this.tipoDeArquivo = tipoDeArquivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDeArquivo() {
        return tipoDeArquivo;
    }

    public void setTipoDeArquivo(String tipoDeArquivo) {
        this.tipoDeArquivo = tipoDeArquivo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um documento do Word. " + nome + "." + tipoDeArquivo + ".");
    }
}

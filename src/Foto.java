public class Foto implements Imprimivel {
    private String nome;
    private String tipoArquivo;

    public Foto(String nome, String tipoArquivo){
        this.nome = nome;
        this.tipoArquivo = tipoArquivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(String tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie. " + nome + "." + tipoArquivo + ".");
    }
}

public class Main {

    public static void main (String [] args){

        Contrato contrato = new Contrato("Talita", "PDF");
        Foto fotinha = new Foto("Talita", "JPEG");
        Documento documento = new Documento("Talita", "Word");
        Impressora impressora = new Impressora();
        impressora.adicionarImprimivel(contrato);
        impressora.adicionarImprimivel(fotinha);
        impressora.adicionarImprimivel(documento);

        impressora.imprimirTudo();

    }
}

import java.util.ArrayList;
import java.util.List;

public class Impressora {


    private List<Imprimivel> lista = new ArrayList<>();




    public void adicionarImprimivel(Imprimivel umImprimivel){
        lista.add(umImprimivel);
    }

    public void imprimirTudo(){
        for (int i=0;i < lista.size();i++){
            lista.get(i).imprimir();
        }
    }
}

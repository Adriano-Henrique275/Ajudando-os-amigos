import java.util.ArrayList;
import java.util.List;

public class ControlePadaria {
    
    public ControlePadaria() {

        List<String> listaDasPadarias = new ArrayList<>();

        listaDasPadarias.add("Padaria Copacabana");
        listaDasPadarias.add("Padaria Dois Irmãos");
        listaDasPadarias.add("Padaria Cas De Nois");
        listaDasPadarias.add("Padaria Doce Momento");
        listaDasPadarias.add("Padaria Do Careca");
        listaDasPadarias.add("Padaria Um Sonho de Pão");
        listaDasPadarias.add("Padaria Do seu Manoel");

        for (String strLista : listaDasPadarias) {
            System.out.println(strLista);
        }
    }

    public void listarTodosCrientes(){

        ClienteCadastrado clientes = new ClienteCadastrado();

        clientes.ListarClientes();
        
    }

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteCadastrado extends Pessoa {
    
    private int idCliente;

    public int getIdCliente(){
        return this.idCliente;
    }

    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }

    
    public void ListarClientes(){

        ClienteCadastrado();
    }
    
    private void ClienteCadastrado() {

        Scanner deletarCliente = new Scanner(System.in);

    
        ArrayList<String> ListaDosClientes = new ArrayList();
 
        ListaDosClientes.add("João; 40 anos; f: 3234-2523");
        ListaDosClientes.add("Marcos; 63 anos; f: 9979998");
        ListaDosClientes.add("Maria Antonieta; 45 anos; f: 3232-3434");
        ListaDosClientes.add("Cubas; 30 anos; f: 3232-1123");

        int i;
    
        System.out.printf("Todos os clientes: \n");

        int quantidadeClientes = ListaDosClientes.size();

        for (i=0; i<quantidadeClientes; i++) {

            System.out.printf("Listando os Clientes %d- %s\n", i, ListaDosClientes.get(i));

        }

        System.out.println("Todos os Clientes: " + ListaDosClientes.size());

        System.out.printf("\nDigite o ID para excluir um cliente: \n");

        i = deletarCliente.nextInt();

        try {
        
            ListaDosClientes.remove(i);

        } catch (IndexOutOfBoundsException e) {
            
            System.out.printf("\nErro: posição é inválida (%s).", e.getMessage());
        }
      
        System.out.printf("\nNova Listagem apos excluir um cliente: \n");     
       
    }  
    
}

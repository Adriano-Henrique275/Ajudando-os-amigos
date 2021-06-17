public class Main {
    public static void main(String[] args) {

        ControlePadaria controle = new ControlePadaria();
        ClienteCadastrado cli = new ClienteCadastrado();

        controle.listarTodosCrientes();
        
        System.out.println("------------------");

        cli.ListarClientes();
        
    }
}

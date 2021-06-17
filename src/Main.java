public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        ControlePadaria controle = new ControlePadaria();
        ClienteCadastrado cli = new ClienteCadastrado();

        controle.listarTodosCrientes();

        cli.ListarClientes();

        System.out.println("Texto para teste");
        
    }
}

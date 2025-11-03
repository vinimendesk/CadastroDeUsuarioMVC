package view;

import controller.Controller;
import model.User;

import java.util.List;

public class Register {

    public static void main(String[] args) {

        Controller controller = new Controller();

        while (true) {


            System.out.println("SISTEMA CADASTRADOR DE USUÁRIOS");
            System.out.println("-----------------------------------------");

            System.out.println("O que deseja?");
            System.out.println("[ 1 ] Cadastrar usuário");
            System.out.println("[ 2 ] Visualizar usuários cadastrados");
            System.out.println("[ 3 ] Sair");
            System.out.print("Sua opção: ");
            int opcao = Integer.parseInt(System.console().readLine());

            if (opcao == 1) {
                System.out.println(" ");
                System.out.println("CADASTRAR USUÁRIO");
                System.out.println("-----------------------------------------");
                System.out.println("Nome: ");
                String nome = System.console().readLine();
                System.out.println("E-mail: ");
                String email = System.console().readLine();
                System.out.println("Senha: ");
                String senha = System.console().readLine();
                System.out.println("Idade: ");
                int idade = Integer.parseInt(System.console().readLine());

                User user = new User(nome, email, senha, idade);
                controller.addUser(user);

                System.out.println("-----------------------------------------");
                System.out.println(" ");

            } else if (opcao == 2) {

                List<User> usersList = controller.viewUsers();

                System.out.println(" ");
                System.out.println("EXIBIÇÃO DOS USUÁRIOS");
                System.out.println("-----------------------------------------");

                for (User user: usersList) {
                    System.out.println("- nome: " + user.getName() + ", email: " + user.getEmail() + ", idade: " + user.getAge());
                }

                System.out.println("-----------------------------------------");
                System.out.println(" ");

            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção não reconhecida.");
            }
        }

    }

}

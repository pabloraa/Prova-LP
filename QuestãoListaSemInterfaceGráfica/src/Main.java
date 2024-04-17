import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSResourceResolver;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        new InterfaceGrafica();

//        Scanner ler = new Scanner(System.in);
//
//        ArrayList<Pessoa> agendaPessoas = new ArrayList<Pessoa>();
//
//        //ArrayList<String> listaEmails = new ArrayList<String>();
//
//        int opcao = -1;
//
//        do{
//
//            System.out.println("1 - CADASTRAR NOVO CONTATO");
//
//            System.out.println("2 - LISTAR AS PESSOAS CADASTRADAS");
//
//            System.out.println("3 - QUANTIDADE DE CONTATOS");
//
//            System.out.println("4 - EXCLUIR CONTATO");
//
//            System.out.println("0 - SAIR DA AGENDA DE CONTATOS");
//
//            System.out.print("DIGITE A OPÇÃO DESEJADA");
//
//            opcao = ler.nextInt();
//
//            if(opcao == 1){
//
//                System.out.println("VOCÊ ESCOLHEU A OPÇÃO ADICIONAR CONTATOS");
//
//                System.out.println("DIGITE O NOME: ");
//
//                ler.nextLine();
//
//                String nome = ler.nextLine();
//
//                System.out.println("DIGITE O TELEFONE: ");
//
//                String telefone = ler.nextLine();
//
//                System.out.println("DIGITE O ENDEREÇO");
//
//                String endereco = ler.nextLine();
//
//                System.out.println("ADICIONAR EMAILS A SUA LISTA?");
//
//                //String resposta = ler.nextLine();
//
//                //if(resposta == "sim" || resposta == "SIM" || resposta == "Sim") {
//
//                    //int quantidade = 0;
//
//                    //quantidade = ler.nextInt();
//
//                    //for (int i = 0; i <= quantidade; i++) {
//
//                        //String email;
//
//                        //email = ler.nextLine();
//
//                        //listaEmails.add(email);
//
//                    //}
//                //}
//
//                Pessoa objPessoa = new Pessoa(nome,telefone,endereco);
//
//                agendaPessoas.add(objPessoa);
//
//            } else if (opcao == 2) {
//
//                System.out.println("VOCÊ ESCOLHEU A OPÇÃO MOSTRAR CONTATOS");
//
//                if(!agendaPessoas.isEmpty()) {
//
//                    for (Pessoa obj : agendaPessoas) {
//
//                        System.out.println(obj.toString());
//                    }
//                }
//                else{
//
//                    System.out.println("AGENDA VAZIA!");
//                }
//
//            } else if(opcao == 0){
//
//                System.out.println("VOCÊ ESCOLHEU SAIR DO PROGRAMA");
//
//                System.exit(0);
//
//            } else if(opcao == 3){
//
//                int quantidade = 0;
//
//                quantidade = agendaPessoas.size();
//
//                System.out.println("SUA AGENDA TEM: " + quantidade + " CONTATOS");
//
//            } else if(opcao == 4){
//
//                System.out.println("VOCÊ ESCOLHEU A OPÇÃO EXCLUIR CONTATO DA AGENDA, DIGITE A POSIÇÃO QUE DESEJA EXCLUIR");
//
//                int posicao = 0;
//
//                posicao = ler.nextInt();
//
//                if(!agendaPessoas.isEmpty()){
//
//                    agendaPessoas.remove(posicao);
//
//                }
//                else{
//
//                    System.out.println("AGENDA VAZIA, ADICIONE ALGUM CONTATO PARA EXCLUIR");
//
//                }
//
//                System.out.println();
//            }
//        }while(opcao!=0);
    }
}

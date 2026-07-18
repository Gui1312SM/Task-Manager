
package app;

import controller.TaskManager;
import model.Tarefa;
import java.util.Scanner;



public class main {
   public static void main(String[]args){
       
       TaskManager manager = new TaskManager(); 
       
       Scanner scanner = new Scanner(System.in);
       
       
       int opcao;
       
       while(true){
           System.out.println(" Gerenciador de tarefas ");
           System.out.println("1. Criar uma tarefa. ");
           System.out.println("2. Listar tarefas. ");
           System.out.println("3. Concluir tarefa. ");
           System.out.println("4. Remover tarefa.");
           System.out.println("5. Sair. ");
           System.out.print("Escolhe uma opcao: ");
           
           opcao = scanner.nextInt();
           
           switch(opcao){
               case 1:
                   
                    System.out.println("Digite o numero da tarefa de 0 em diante: ");
                    int id = scanner.nextInt();
                    
                    scanner.nextLine();
                    
                    System.out.println("Digite o titulo da tarefa: ");
                    String titulo = scanner.nextLine();
                    
                    System.out.println("Digite a descricao da tarefa: ");
                    String descricao = scanner.nextLine();
                    
                    Tarefa tarefa = new Tarefa(id, titulo, descricao);
                    
                    manager.adicionarTarefa(tarefa);
                    
               break;
               
               case 2:
                   
                   manager.listarTarefas();
                   
                    System.out.println("Listando tarefa... ");
               break;
               
               case 3:
                    System.out.println("Digite o numero da tarefa que deseja concluir:  ");
                    int idConclusao = scanner.nextInt();
                    
                    manager.concluirTarefa(idConclusao);
               
               break;
               
               case 4:
                   
                    System.out.println("Digite o numero da tarefa que deseja remover:  ");
                    int idRemover = scanner.nextInt();
                    
                    manager.removerTarefa(idRemover);
                    
               break;
               
               case 5:
                    System.out.println("Saindo do sistema de tarefas... ");
                 
                    scanner.close();
                
                    System.exit(0);
                 
               break;
               
               default:
                   
                   System.out.println("OPCAO INVALIDA! ");
                   
               break;      

               
           }
       }
   } 
}
 
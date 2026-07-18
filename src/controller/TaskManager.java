
package controller;

import java.util.ArrayList;
import model.Tarefa;

public class TaskManager {
    private ArrayList<Tarefa> tarefas;
    
    public TaskManager(){
        tarefas = new ArrayList<>();
    }
  
  public void adicionarTarefa(Tarefa tarefa){
      
      tarefas.add(tarefa);
      
      System.out.println("Tarefa adicionada com sucesso!."); 
  }
    
  
  public void listarTarefas(){
      if (tarefas.isEmpty()){
          System.out.println("Nenhuma tarefa foi cadastrada");
      } else{
          for(Tarefa tarefa : tarefas){
          System.out.println(tarefa); 
          }
      }
    }
  public void concluirTarefa(int id){
      boolean encontrada = false;
      
      for(Tarefa tarefa : tarefas){
          
          if(tarefa.getId() == id){
          
              tarefa.setConcluida(true);
              
              encontrada = true;
              
              System.out.println("Tarefa concluida. ");
          }
      }
  
      if(encontrada == false){
          System.out.println("Tarefa nao encontrada. ");
      }
  }
 
  public void removerTarefa(int id){
      
      Tarefa tarefaRemover = null;
      
      for (Tarefa tarefa : tarefas){
      
           if(tarefa.getId() == id){
               
               tarefaRemover = tarefa;
               
              
           }
      }
      
      if(tarefaRemover != null){
          tarefas.remove(tarefaRemover);
          System.out.println("Tarefa removida");
      } else {
          System.out.println("Tarefa nao encontrada");
      }    
          
      }
  }
  

  
  
  


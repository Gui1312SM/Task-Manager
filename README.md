# TaskManager

Sistema simples de gerenciamento de tarefas via linha de comando (CLI), desenvolvido em **Java** com **Apache Ant** (projeto NetBeans).

## 📋 Descrição

O TaskManager é uma aplicação de console que permite cadastrar, listar, concluir e remover tarefas. Cada tarefa possui um ID, título, descrição e status (pendente/concluída).

## ⚙️ Funcionalidades

O menu principal oferece as seguintes opções:

1. **Criar uma tarefa** — cadastra uma nova tarefa informando ID, título e descrição.
2. **Listar tarefas** — exibe todas as tarefas cadastradas com seu status atual.
3. **Concluir tarefa** — marca uma tarefa como concluída a partir do ID informado.
4. **Remover tarefa** — remove uma tarefa a partir do ID informado.
5. **Sair** — encerra a aplicação.

## 🗂️ Estrutura do projeto

```
TaskManager.1/
├── src/
│   ├── app/
│   │   └── main.java                # Ponto de entrada da aplicação (menu interativo)
│   ├── controller/
│   │   └── TaskManager.java         # Lógica de negócio: adicionar, listar, concluir e remover tarefas
│   ├── model/
│   │   ├── Tarefa.java              # Classe que representa uma tarefa
│   │   └── TarefaPrioritaria.java   # Especialização de Tarefa com atributo de prioridade
│   └── exceptions/
│       └── TarefaException.java     # Exceção customizada para o domínio de tarefas
├── test/                            # Diretório reservado para testes (JUnit)
├── build.xml                        # Script de build Ant
├── manifest.mf                      # Manifesto do JAR
└── nbproject/                       # Configurações do projeto NetBeans
```

## 🧩 Modelo de dados

- **Tarefa**: `id`, `titulo`, `descricao`, `concluida` (boolean).
- **TarefaPrioritaria**: estende `Tarefa` e adiciona o atributo `prioridade`.
- **TarefaException**: exceção customizada disponível para tratamento de erros relacionados a tarefas.

## 🚀 Como executar

### Pela NetBeans IDE
1. Abra o projeto (`File > Open Project`) apontando para a pasta `TaskManager.1`.
2. Clique em **Run Project** (F6).

### Via linha de comando com Ant
```bash
ant clean
ant jar
java -jar dist/TaskManager.1.jar
```

### Compilando manualmente com javac
```bash
javac -d build/classes src/model/*.java src/exceptions/*.java src/controller/*.java src/app/*.java
java -cp build/classes app.main
```

## 🔧 Requisitos

- Java JDK (compatível com a versão configurada no NetBeans)
- Apache Ant (incluído/gerenciado pela NetBeans IDE)

## ⚠️ Observações

- ✅ **Corrigido**: a opção **3 (Concluir tarefa)** do menu agora chama `manager.concluirTarefa(idConclusao)` corretamente — antes o método não era acionado e a tarefa nunca era marcada como concluída.
- A classe `TarefaPrioritaria` está implementada, mas ainda não é utilizada no fluxo principal (`main.java`) — pode ser integrada futuramente (ex.: nova opção de menu para criar tarefas com prioridade).
- O diretório `test/` está presente na estrutura do projeto, mas ainda não contém testes implementados.

## 📌 Status

Projeto em desenvolvimento / fins de estudo (estrutura de POO em Java: herança, encapsulamento e exceções customizadas).

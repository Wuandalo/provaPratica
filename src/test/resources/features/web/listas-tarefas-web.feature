#language: pt
#enconding: UTF-8
#Author: Gustavo Henrique

Funcionalidade: Criação de listas e tarefas

    Contexto: Logando no site
      Dado que o usuario acessa o site "https://todo.microsoft.com"
      E efetua login com email "teste@teste.com.br" e senha "123"

    @web @criacaoListas
    Cenário: Criação de listas
      E limpar listas criadas anteriormente
      Então o usuário cria as listas
        | listas      |
        | Livros      |
        | Meus Livros |

    @web @criacaoTarefas
    Cenário: Criação de tarefas
      Quando acessar lista "Livros"
      Então o usuário cria as tarefas
      | tarefas          |
      | A Arte da Guerra |
      | A Cauda Longa    |
      | A Torre Negra    |



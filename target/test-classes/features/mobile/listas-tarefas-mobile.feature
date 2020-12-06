#language: pt
#enconding: UTF-8
#Author: Gustavo Henrique

Funcionalidade: Criação de listas e tarefas

  Contexto: Logando no site
    Dado que o usuário efetua login no aplicativo com o email "teste@teste.com" e senha "123"

  @mobile @criacaoListas
  Cenário: Criação de listas
    E excluir listas criadas anteriormente
    Então o usuário cria as seguintes listas
      | listas         |
      | Musicas        |
      | Minhas Musicas |

  @mobile @criacaoTarefas
  Cenário: Criação de tarefas
    Quando acessar a lista "Livros"
    Então o usuário cria as seguintes tarefas
      | tarefas    |
      | Terra      |
      | O Quereres |
      | Odara      |
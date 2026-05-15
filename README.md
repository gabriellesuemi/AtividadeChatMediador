# Chat com Padrão Mediator

Projeto desenvolvido para a disciplina de Projeto Orientado a Objetos.

**Aluna:**  
Gabrielle Suemi Iquejiri Alencar 
RA: 176325 

## Descrição
Este projeto implementa um sistema simples de chat em Java utilizando exclusivamente o padrão de projeto Mediator.

O objetivo é demonstrar como o padrão Mediator reduz o acoplamento entre objetos ao centralizar a comunicação em um único componente responsável pelo gerenciamento das interações.

No sistema desenvolvido, os usuários não se comunicam diretamente entre si. Todas as mensagens são enviadas ao mediador, que recebe e distribui as mensagens aos demais participantes do chat.

---

## Padrão Utilizado

### Mediator

O padrão Mediator define um objeto responsável por encapsular a comunicação entre vários objetos.

Neste projeto:

- `MediadorChat` representa a interface do mediador.
- `MediadorChatConcreto` centraliza o envio das mensagens.
- `Usuario` representa os participantes do sistema.
- `UsuarioChat` implementa os usuários concretos do chat.
- `Main` executa a aplicação.

Dessa forma, os usuários conhecem apenas o mediador e não precisam manter referências diretas entre si.

---

## Estrutura do Projeto

```text
Main.java
MediadorChat.java
MediadorChatConcreto.java
Usuario.java
UsuarioChat.java
# 📱 Sistema de Agenda em Java (POO & Collections)

Projeto desenvolvido em Java Core com foco em Programação Orientada a Objetos (POO), coleções dinâmicas e tratamento de exceções personalizadas. Desenvolvido para fins de estudo e consolidação de lógica de programação.

> 💡 **Nota de Evolução:**
> - Refatoração de Arrays estáticos para a API de `Collections` do Java, utilizando a flexibilidade do `ArrayList` para manipulação dinâmica de dados.
> - Implementação do método *deletarContato();*.
> - Implementação de boas práticas com a palavra-chave *final* para garantir a imutabilidade e segurança de referências.

## 🚀 Funcionalidades

- **Adicionar Contato:** Permite cadastrar nome, telefone e e-mail (com validação preventiva de limite máximo da agenda).
- **Listar Contatos:** Exibe todos os contatos salvos de forma limpa (com tratamento para lista vazia).
- **Consultar por Nome:** Busca flexível e inteligente utilizando trechos do nome e ignorando letras maiúsculas ou minúsculas.
- **Excluir Contato:** Permite remover um contato existente da lista através do nome, reorganizando a memória automaticamente.
- **Tratamento de Erros Customizados:** Exceções específicas para regras de negócio da aplicação que barram o fluxo antes de digitações desnecessárias.

## 🛠 Tecnologias e Conceitos Utilizados

- Java (Versão 17+)
- Orientação a Objetos (Encapsulamento, Programação voltada a Interfaces, Separação de Responsabilidades)
- Java Collections API (`List` e `ArrayList`)
- Tratamento de Exceções (`try-catch`, *Custom Exceptions* com construtores inteligentes)
- Imutabilidade e Segurança de Referências (Uso de modificadores `final`)

## 📂 Arquitetura do Projeto

O projeto adota uma estrutura clara de pacotes separada por responsabilidades:

```text
src/
└── com/
    ├── exception/
    │   ├── AgendaCheiaException.java      # Trata limite de armazenamento
    │   ├── ContatoNaoExisteException.java  # Trata buscas e exclusões inválidas
    │   └── ListaVaziaException.java       # Trata consultas sem dados
    ├── model/
    │   └── Contato.java                   # Entidade com os dados do contato
    ├── service/
    │   └── Agenda.java                    # Regras de negócio e uso do ArrayList
    └── Main.java                          # Menu interativo e fluxo do console
```

## ⚙ Como Executar o Projeto

1. Certifique-se de ter o **JDK (Java Development Kit)** instalado na sua máquina (versão 17 ou superior recomendada).
2. Clone este repositório ou faça o download dos arquivos:
   ```bash
   git clone https://github.com/henriquedeoliveira-dev/sistema-agenda-poo.git
   ```
3. Abra o projeto na sua IDE favorita (IntelliJ IDEA, Eclipse ou VS Code) e execute a classe `Main`.

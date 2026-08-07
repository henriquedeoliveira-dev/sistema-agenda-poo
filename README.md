# 📱 Sistema de Agenda em Java (POO)

Projeto desenvolvido em Java Core com foco em Programação Orientada a Objetos (POO), manipulação de arrays e tratamento de exceções personalizadas. Desenvolvido para fins de estudo e consolidação de lógica de programação.

## 🚀 Funcionalidades
- **Adicionar Contato:** Permite cadastrar nome, telefone e e-mail (com validação de agenda cheia).
- **Listar Contatos:** Exibe todos os contatos salvos (com tratamento para lista vazia).
- **Consultar por Nome:** Busca flexível de contatos na agenda.
- **Tratamento de Erros Customizados:** Exceções específicas para regras de negócio da aplicação.

## 🛠️ Tecnologias e Conceitos Utilizados
- Java
- Orientação a Objetos (Encapsulamento, Separação de Responsabilidades)
- Tratamento de Exceções (`try-catch`, *Custom Exceptions*)
- Estrutura de dados básica (`Arrays`)

## 📂 Arquitetura do Projeto
O projeto está organizado em pacotes por responsabilidade:
- `com.model`: Entidades e classes de dados (`Contato`).
- `com.service`: Regras de negócio da aplicação (`Agenda`).
- `com.exception`: Exceções personalizadas.
- `com`: Classe principal de execução (`Main`).

## ⚙️ Como Executar o Projeto

1. Certifique-se de ter o **JDK (Java Development Kit)** instalado na sua máquina (versão 17 ou superior recomendada).
2. Clone este repositório ou faça o download dos arquivos:
   ```bash
   git clone https://github.com/henriquedeoliveira-dev/sistema-agenda-poo.git
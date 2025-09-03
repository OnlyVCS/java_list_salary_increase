# 📚 Projeto de Aprendizado: Sistema Básico de Gestão de Funcionários

Este é um programa simples em **Java** criado com o objetivo de praticar conceitos fundamentais da linguagem e da Programação Orientada a Objetos (POO). Não é um sistema para ser usado em produção, mas sim um laboratório para aplicar conhecimentos.

---

O programa funciona como um sistema de gerenciamento de funcionários que permite registrar novos colaboradores e manipular seus dados. 
Ele pergunta a quantidade de funcionários a serem registrados, solicitando que o usuário insira o ID, nome e salário de cada um. 
Para evitar duplicata de identificadores, o programa verifica se o ID inserido já existe. Caso encontre, ele pede que o usuário tente novamente inserindo um novo valor. 
Após o registro, é possível buscar um funcionário por seu ID para aplicar um aumento salarial com base em uma porcentagem. 
Caso o ID não seja encontrado, uma mensagem de "Employee not found" é exibida , mas se for, o salário é atualizado. 
Por fim, o programa lista todos os funcionários com seus dados atualizados.

---

### O que foi praticado neste código:

* **Estruturas de Dados:** Uso da interface `List` e da classe `ArrayList` para armazenar uma coleção de objetos `Employee`.
* **Entrada e Saída de Dados:** Interação com o usuário através do console, utilizando a classe `Scanner` para ler entradas.
* **Programação Orientada a Objetos (POO):** Definição da classe `Employee` para modelar um funcionário, encapsulando seus atributos (ID, nome, salário) e comportamentos.
* **Laços de Repetição:** Utilização de `for` para registrar múltiplos funcionários e `while` para validar a singularidade do ID.
* **API de Streams do Java:** Aplicação de streams para realizar operações de busca e filtragem eficientes na lista de funcionários, como a validação de IDs e a localização de um funcionário específico para aumento salarial.
* **Tratamento de Condições:** Verificação com `if-else` para garantir que o aumento salarial seja aplicado apenas se o ID do funcionário for encontrado na lista.

---

### 💻 Como Executar

Para rodar este programa e entender sua estrutura, você precisará do **JDK** (Java Development Kit) instalado.

1.  Compile as classes `Main.java` e `Employee.java`.
2.  Execute a classe `Main` a partir do terminal.
3.  Siga as instruções para registrar os funcionários e interagir com as funcionalidades do sistema.

# Bank Login System

## Descrição

Sistema de simulação bancária em **Java** que permite verificar contas existentes ou cadastrar novos usuários. O projeto foca em **lógica de listas dinâmicas** e **fluxo de controle**.

## ****EM DESENVOLVIMENTO****
* **util.Verifiers**: classe responsável pelas verificações

## Funcionalidades Principais

### Login de Usuário

* Verifica se o **número da conta** existe na base de dados.

### Cadastro Automático

* Gera um **número único** para novos usuários.

### Simulação de Delay

* Uso de `Thread.sleep` para simular o carregamento do sistema.

## Regras de Negócio e Dados

### Gerenciamento de Contas

* **listNamesAccounts**: armazena os nomes vinculados às contas.
* **listNumbersAccounts**: armazena os IDs numéricos das contas.
* **Busca por índice**: o sistema localiza o índice do número da conta e utiliza a mesma posição para encontrar o nome do titular.

### Validação de Entrada

* Uso de `do-while` para garantir que o usuário digite apenas **Y** ou **N**.
* O método `toUpperCase()` trata entradas em letras minúsculas.

## Estrutura do Código

* **application.Main**: classe principal com o loop de execução.
* **entities.AccountBank**: classe responsável pelo gerenciamento das listas de dados.
* **entities.GenerateNumberAccount**: classe responsável pela geração dos IDs das contas.


## Tratamento de Exceções

* Uso de **try-catch** para evitar que o programa trave em caso de erro na geração da conta ou interrupção do sistema.

## Como Rodar o Projeto

### Windows

* Abra a pasta **BankLogin** e rode:

```bash
cd src/application
```

* Depois execute:

```bash
java application.Main
```

### Linux

* Abra o terminal na pasta **BankLogin** e rode:

```bash
cd src/application
```

* Compile os arquivos:

```bash
javac application/Main.java entities/*.java
```

* Execute o programa:

```bash
java application.Main
```

### OBS

* Garanta que você tenha a **JDK instalada** na sua máquina.

### Compilação

```bash
javac application/Main.java entities/*.java
```

### Execução

```bash
java Main.java
```


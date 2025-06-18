# Petshop Malucão

## 🚀 Descritivo Básico
Uma API RESTful desenvolvida com Spring Boot para gerenciar clientes e produtos de uma petshop. Este projeto visa 
oferecer uma solução robusta e escalável para operações CRUD (Create, Read, Update, Delete) em um ambiente de petshop.


## 🌟 Visão Geral
A Petshop Malucão API foi criada para simplificar a gestão de informações de clientes e o catálogo de produtos de uma 
petshop. Ela oferece endpoints bem definidos para interagir com o banco de dados MySQL, garantindo a integridade e a 
persistência dos dados.


## ✨ Tecnologias Utilizadas
* Java 17: A linguagem de programação principal
* Spring Boot 3.5.0: Framework para desenvolvimento rápido de APIs.
* Gradle: Ferramenta de automação de build (embarcado no Springboot).
* Spring Data JPA: Para persistência de dados e interação com o banco.
* Lombok: Reduz o boilerplate code (getters, setters, construtores).
* Spring Boot Validation: Para validação de dados de entrada nos endpoints.
* Spring Boot DevTools: Ferramentas para agilizar o desenvolvimento.
* MySQL Connector/J: Driver para conexão com o banco de dados MySQL.

### 🛠️ Pré-requisitos
Para rodar este projeto localmente, você precisará ter instalado:

* **Java Development Kit versão 17 (recomendada) ou superior**
  * faça o download do JDK em https://jdk.java.net/17.
* Gradle (opcional, já incluído no wrapper do projeto):
  * pode-se trabalhar com o Maven, entretanto outras configurações serão necessárias.
* MySQL Server: [https://dev.mysql.com/downloads/file/?id=541637]
  * Use um gerenciador de Banco de Dados na sua máquina local para administrar as informações geradas pela API.
* Uma IDE de sua preferência 
  * IntelliJ IDEA, da empresa Jetbrains https://www.jetbrains.com/ 
  * Visual Studio Code (VSCode), da empresa Microsoft https://code.visualstudio.com/
  * Eclipse, uma organização sem fins lucrativos https://eclipseide.org/


### 🪄 Baixando o projeto para o seu PC
Estamos levando em consideração que você já tenha o GIT instalado no seu computador e que esteja devidamente configurado.
 Agora, siga os passos abaixo para poder executar o projeto no seu PC.
1. Abra o seu terminal e digite o seguinte comando:

```
git clone https://github.com/fabioklopes/petshopmalucao.git
``` 

2. Ainda no terminal, após terminar o processo do Git Clone, faça este comando:

```
./gradlew clean build
```

3. Agora você precisa atualizar as dependências do projeto:

```
./gradlew build --refresh-dependencies
```

4. Por fim, execute o projeto:

```
./gradlew bootrun
```

Se tudo ocorreu perfeitamente bem, no final das instruções um Status % aparecerá no seu terminal com a seguinte frase: 
```
TomcatWebServer : Tomcat started on port 8080 (http) with context path '/'

PetshopMalucaoApplication : Started PetshopmalucaoApplication
<==========---> 80% EXECUTING
> :bootrun
▮
```
Isso significa que o seu projeto está funcionando e para poder fazer os testes, utilize um gerenciador de protocolos HTTP (Postman, por exemplo).

### 🗝️ Informações Extras
Você pode querer saber mais sobre as tecnologias utilizadas aqui neste projeto. Logo abaixo estão algumas explicações 
que podem te ajudar a crescer no mundo Springboot e APIs RESTful.

API significa Interface de Programação de Aplicações (do inglês, _Application Programming Interface_). É um conjunto de 
regras e padrões que permite que diferentes softwares se comuniquem e interajam entre si. Desta forma, eles podem trocar 
dados e funcionalidades sem esbarrar em tipos ou até mesmo nas diferenças das linguagens de programação. Em resumo, uma 
API atua como um "intermédio" permitindo que uma aplicação utilize serviços ou dados de outras aplicações sem que o 
desenvolvedor se preocupe em entender todos os detalhes das demais aplicações.

Uma API RESTFul significa um serviço que segue os princípios da arquitetura REST (Representational State Transfer), ou 
seja, é um termo usado para indicar que uma API realmente implementa REST, enquanto "REST" se refere à arquitetura em 
si, um conjunto de restrições e princípios.


### ✉️ Contatos
Para mais informações, sugestões, críticas ou elogios, entre em contato comigo:
[fabioklopes@outlook.com.br](fabioklopes@outlook.com.br).
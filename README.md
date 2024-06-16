# CryptoVisor

O CryptoVisor é uma aplicação web desenvolvida com o objetivo de fornecer insights em tempo real e históricos precisos sobre criptoativos, utilizando dados de APIs externas.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para desenvolvimento de aplicações em Java.
- **Java**: Linguagem de programação principal para o backend da aplicação.
- **Thymeleaf**: Framework de templates para a renderização de páginas HTML no servidor.
- **HTML/CSS**: Linguagens utilizadas para estruturar e estilizar a interface do usuário.
- **Bootstrap**: Framework CSS para facilitar o design responsivo.
- **JavaScript**: Utilizado para interações dinâmicas no frontend, incluindo a atualização de gráficos.
- **Chart.js**: Biblioteca JavaScript para criar gráficos interativos.
- **Moment.js e Chart.js Adapter Moment**: Utilizados para manipulação de datas nos gráficos.

## API

- **API**: CoinGecko API foi utilizada.
- **Observação**: Pelo fato de estarmos utilizando a versão gratuita da API, os requests devem ser feitos poucas vezes, senão ocorre um erro de Limite Excedido. 

## Executando o Projeto no VS Code

Para executar o projeto no VS Code, siga os passos abaixo:

### Pré-requisitos

- Java Development Kit (JDK) instalado e configurado.
- Maven instalado.
- VS Code instalado.

### Passos

1. **Clone o repositório:**

Abra o terminal do VS Code e clone o repositório do projeto:

git clone https://github.com/seu-usuario/seu-repositorio.git](https://github.com/FernandoZgodaNeto/monitoramento-criptomoeda.git

2. **Abra o projeto no VS Code:**

Navegue até a pasta do projeto clonado e abra-o no VS Code.

3. **Execute o projeto Spring Boot:**

Na pasta raiz do projeto execute o comando: ./mvnw spring-boot:run

4. **Exibição:**
Após a aplicação iniciar corretamente, abra um navegador e acesse: http://localhost:8080
5. **Execução:**
Na nossa tela principal, escolha a criptomoeda desejada e aperte o botão ao lado para converter o valor atual para R$ e gerar o gráfico de seu histórico.

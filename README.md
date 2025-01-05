# Automation Practice Automação

## Índice
- [Propósito](#propósito)
- [Bibliotecas Utilizadas](#bibliotecas-utilizadas)
- [IDE](#ide)
- [Execução](#execução)
- [Dica](#dica)
- [Preview de Resultados](#preview-de-resultados)
- [Pipeline](#pipeline)

## Propósito
Este projeto de automação visa a realização de testes automatizados das funcionalidades de login e criação de conta, garantindo a eficiência e a precisão dos processos.


## Bibliotecas Utilizadas
- **Selenium WebDriver:** Automação de navegação web.
- **JUnit:** Framework para testes.
- **WebDriverWait:** Gerenciamento de tempo de espera.
- **ChromeDriver:** Driver para execução no navegador Google Chrome.
- **Linguagem:** Java 11.

## IDE
- **IntelliJ:** Ambiente de desenvolvimento integrado utilizado para a construção e execução do projeto, necessario plugin "Gherkin" e "Cucumber for Java".

## Dica

- Para executar os testes sem instalar o maven basta acessar o arquivo "RunCumber" e clicar na seta RUN


## Execução
Para executar o projeto, siga os passos abaixo:
1.  Executar com interface grafica`mvn test -Dtest=RunCucumber -Dbrowser=chrome`.
2. Executar em modo headless`mvn test -Dtest=RunCucumber -Dbrowser=chrome-ci`.
3. Executar criação de reporte de teste `mvn test cluecumber-report:reporting`(Para consultar o reporte:target/formatted-report/index.html) .


## Preview de Resultados

![](https://github.com/MarianeSerpa/Mantis-Selenium-Java/blob/main/sucesso.gif)

## Pipeline
<https://github.com/MarianeSerpa/Selenium-Java/actions> 







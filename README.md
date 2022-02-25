# Projeto-API-RestAssured

Como Executar o Projeto 

Aba o terminal e navegue até a raiz do projeto e insira o comando:
 
Comando para executar todos os testes criados
comando : mvn test 

Comando para executar os testes por TAGS

comando : mvn test -Dcucumber.filter.tags="@smokeTest"  

Onde, o smokeTest é a tag que usamos para determinar os cenários críticos do projeto e da feature.
porém podemos usar outras tags isso vai depender da sua estratégia de teste.

Para executar mais de uma tags no mesmo comando use :
mvn test -Dcucumber.options="--tags '@debug1 or @debug2'"
OBS.: Só funciona para versão cucumber > 5.x 

# Relatório 
Depois de executar os testes desejados podemos abrir o relatório para 
consultar como mais detalhes. 

Como abrir o relatório da execução que foi feita: 

comando : allure serve



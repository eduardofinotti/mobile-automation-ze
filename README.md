# Zé Delivery App Tests

Projeto para automação de testes mobile Android e iOS, no aplicativo Zé Delivery.

## Installation

Para instalar as dependências, basta executar o arquivo [install_dependencies.sh](config/install_dependencies.sh).

```sh
bash install_dependencies.sh 
```

## Executar um teste

### Via sh (terminal):

Antes de executar deve-se criar as suites de teste.

É possível criar suites de testes, organizando pelo nome da suite e os arquivos de testes dentro,
seguindo modelo do arquivo XML [ios-testng.xml](df-ios-testng.xml). 

*Obs: Deve ser inserido o caminho desse arquivo criando dentro do [testng.xml](testng.xml).*


| Parametro | Valores              | Porquê?                                        |
|  ------   | ------               |     ------                                     |
|device     | nome do device       | define qual o device que o teste será executado|
|version    | versao do SO         | define qual a versao do SO do device           |
|local      | local ou df          | define se será executado localmente ou no Device Farm |
|platform   | android ou ios       | define se será executado no Android ou iOS |


##### Executando uma suite:

Deve-se passar por parametro os dados da execução, como Device, Versão do OS, Plataforma e Local.
 
```sh
 mvn clean test -DsuiteXmlFile=local-ios-testng.xml -Dlocal=local -Ddevice="iPhone 11 Pro Max" -Dversion=13.5 -Dplatform=ios
```

Obs: pode-se criar diferentes suites no arquivo xml.

Obs2: Para local, pode ser `local` que será executado localmnte, ou `df` que será executado no Device Farm, de acordo com as configs em CapabilitiesFactory.java

Obs3: PARA EXECUTAR UM TESTE, O SERVIDOR DO APPIUM DEVE ESTAR RODANDO, E O EMULADOR PASSADO POR PARAMETRO, ABERTO. 

Caso nao tenha o appium: ``npm i appium`` e ``appium``

Obs4: É gerado um `relatório` de execução no final, localizado em ``target/surefire-reports/emailable-report.html``

## Autor
[Eduardo Finotti](https://www.linkedin.com/in/eduardo-finotti/)
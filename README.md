# Lojong App Tests

Projeto para automação de testes mobile, Android e iOS, no aplicativo Lojong.

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


Nesse arquivo criado deve ser passado os parametros: 

````html
    <parameter name = "device" value="pixel2"/>
    <parameter name = "osVersion" value="11.0"/>
    <parameter name = "local" value="local"/>
    <parameter name = "platform" value="android"/>
````

| Parametro | Valores              | Porquê?                                        |
|  ------   | ------               |     ------                                     |
|device     | nome do device       | define qual o device que o teste será executado|
|osVersion  | versao do SO         | define qual a versao do SO do device           |
|local      | local ou df          | define se será executado localmente ou no Device Farm |
|platform   | android ou ios       | define se será executado no Android ou iOS |

*Exemplo completo:*

```xml
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite Android">
    <test name="pixel">
        <parameter name = "device" value="pixel2"/>
        <parameter name = "osVersion" value="11.0"/>
        <parameter name = "local" value="local"/>
        <parameter name = "platform" value="android"/>
        <classes>
            <class name="tests.TestDiarioGratidao"/>
        </classes>
    </test>
</suite>
```

*OBS: para executar varios testes em sequencia e em devices diferetes, basta duplicar a `tag` no `xml`*

##### Execurtando uma suite:
 
```sh
mvn test -DskitTests=false -Dsurefire.suiteXmlFiles=local-ios-testng.xml
```

## Contributing
Pull requests são bem-vindos.

Abra seu PR, e vamos analisar suas alterações!

## Autor
[Eduardo Finotti](https://www.linkedin.com/in/eduardo-finotti/)
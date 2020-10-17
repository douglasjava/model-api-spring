# NAME PROJECT

[CopyrightLicense]:./license.md

![montreal-logo](/uploads/64ff3abd50502cb05b9a0945a32f8aeb/montreal-logo.jpg)


<p align="center">
    Projeto Envio SMS
</p>
<p align="center">
	<img src="https://img.shields.io/badge/Language-Java">
	<img src="https://img.shields.io/badge/Latest%20Update-15/10/2020-brightgreen.svg">
</p>

## Swagger
http://localhost:8080/swagger-ui.html#/

### Build and run
- mvn clean
- mvn package -Pdev | -Ptest | -Pprd

#### Configurations

Open file `application.properties` file contains informations for conections.

#### Requirements

- [Java 11]
- [Maven > 3.0]
- [2.3.4.RELEASE `pom.xml`]
- [SWAGGER]


#### From Eclipse (Spring Tool Suite)

Import as *Existing Maven Project* and run it as *Spring Boot App*.


#### Documentation API


### Struture
#### api - classes relacionadas a API
    ##### assembler - Conversores de classes DTO para Objet  
    ##### controller - Controler de acesso a API - Atentar para criar um padrão de interface para nela ser colocada as anotações do swagger.
    ##### exceptionhandler - Controller de retorno de exception
    ##### model - classe utilizadas como input e response 
#### core - classe de configurações
    ##### modalmapper - Configuração para Mapear Objeto para Objeto
    ##### openapi - Configuração do swagger
    ##### properties - Configuração de objetos mapeados no arquivo de propriedades [application.properties]
    ##### validation - Validações  
#### domain - Regras de negocio, acesso ao banco e utilitarios
    ##### exception - Exceptions cutomizadas, a cada nova criada a mesma deve se inserida no exceptionhandler para centralizar o tratamento de retorno para o client
    ##### helper - utilitários
    ##### model - Entity ou model utilizado para enviar requisição para outro web service
    ##### Service - Regras de negocio.  


### Versão Java 11 ###
Fazendo download do OpenJDK
Para desenvolver aplicações servidoras com Java, precisamos do kit de desenvolvimento Java instalado (JDK).

Eu recomendo que você instale o OpenJDK, que é uma implementação da plataforma Java open source e gratuita, pronta para ser usada em produção.

Vamos usar o OpenJDK da AdoptOpenJDK, que fornece uma implementação do OpenJDK totalmente de graça e com suporte de longo prazo garantido.

Para começar, faça download do arquivo de instalação. Escolha a versão adequada para seu sistema operacional e deixe marcadas as opções OpenJDK 11 (LTS) e HotSpot.

link: https://adoptopenjdk.net/?variant=openjdk11&jvmVariant=hotspot 

## License ##

[Montreal](LICENSE)

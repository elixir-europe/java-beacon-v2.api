These are Java Beans classes for the Beacon API v2.0.0 specification JSON schema.

Compiling:
```shell
>git https://github.com/elixir-europe/java-beacon-v2.api.git
>cd java-beacon-v2-api
>mvn install
```
Maven will build three libraries:
1. beacon-framework/target/beacon-framework-2.x.x.jar
these are java model classes for Beacon v2 framwork
2. beacon-data-model/target/beacon-data-model-2.x.x.jar
these are the java interfaces for Beacon v2 models
3. beacon-model/target/beacon-model-2.x.x.jar
these are the java interfaces for Beacon v2 endpoints

Most probably, you wont be needed to manually compile this project, but rather include the libararies in your own project  

To include Beacon beans in a maven project (pom.xml):

```xml
<dependencies>
    <dependency>
        <groupId>es.bsc.inb.ga4gh</groupId>
        <artifactId>beacon-model</artifactId>
        <version>2.x.x</version>
    </dependency>
</dependencies>
     
<repositories>
    <repository>
        <id>gitlab-bsc-maven</id>
        <url>https://inb.bsc.es/maven</url>
    </repository>
</repositories>
```

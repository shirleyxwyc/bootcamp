# bootcamp - 
## adding lombok -
1) shift ctrl P -> create Java projectMaven
2) Maven -> latest version->version JDK8
3) New Maven Project: input group id : com.bootcamp.demo
4) input artifactId : demo-lombok
5) press Enter
6) package will be default set to "com.bootcamp.demp"->BUILD SUCCESS

<dependancies>
<dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <version>1.18.38</version>
      <scope>provided</scope>
    </dependency>

## in pom.xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.bootcamp.demo</groupId>
  <artifactId>demo-lombok</artifactId>
  <version>1.0-SNAPSHOT</version>
  <properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <junit.version>5.6.0</junit.version>
  </properties>
  <dependencies>
    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <version>1.18.38</version>
      <scope>provided</scope>
    </dependency>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-api</artifactId>
      <version>${junit.version}</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>${junit.version}</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
</project>

##　去自己個倉
C:\Users\Shirley Xu\.m2\repository\com\bootcamp\demo\demo-lombok
\2.0-SNAPSHOT

##　去pom.xml 改ｖｅｒｓｉｏｎ
<version>2.0-SNAPSHOT</version>

## gibhub: cd \c/Software/github/bootcamp/demo-lombok/
## mvn clean install
## mvn clean compile


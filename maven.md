check pom.xml

### A. Install 
- https://www.baeldung.com/install-maven-on-windows-linux-mac
- set env var : M2_HOME and MAVEN_HOME

#### B. Defination
- standardization java Project
- Dependency management tool
- Build automation tool

### C. Build Lifecycle:
series of phases/stages 
-  clean
-  validate
-  compile
-  test
-  package
-  install
-  deploy

### D. maven Cli Commands
#### Basic Commands
**can use IDE maven plugin as well.

```mvn clean```
 : Cleans the project by deleting the target directory where the built artifacts are stored.

```mvn compile```
: Compiles the source code of the project.

```mvn test```
: Runs the tests using a testing framework like JUnit.

```mvn package```
Description: Packages the compiled code into a distributable format like a JAR or WAR file.

```mvn install```
: Installs the package into the local repository, making it available for use as a dependency in other projects.

```mvn deploy```
: Deploys the built package to a remote repository, making it available for other developers.

```mvn site```
Generates a site or documentation for the project.

### E. Maven plugins


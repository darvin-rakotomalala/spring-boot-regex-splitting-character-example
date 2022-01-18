## Spring Boot - Regex: fractionnement par caractère
---
Dans ce projet, nous allons voir une exemple de Regex: fractionnement par caractère, sauf entre guillemets.

### Prérequis
---
Pour travailler dans un projet Spring Boot, vous auriez besoin des spécifications suivantes:<br/>
- Spring Boot v2.0+<br/>
- JDK v1.8+<br/>
- Maven 3+ ou Gradle 4+ - outil de construction<br/>
- Tout IDE prenant en charge Java et Spring Boot (Spring Tool Suite (STS), IntelliJ, VSCode, NetBeans, etc.)<br/>

### Contexte
---
Souvent, lorsque nous analysons du texte, nous devons diviser des chaînes sur un caractère virgule 
(ou de nouvelles lignes, tabulations, etc.), mais que se passe-t-il si nous devons utiliser une virgule 
dans notre chaîne et ne pas la diviser ? Un exemple de ceci pourrait être un grand nombre. Alors peut-être 
que nous aurions une chaîne comme celle-ci :
```
age: 28, favorite number: 26, salary: $1,234,108
```

Fractionner par des virgules en utilisant Java et Regex : `String[] strArray = text.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");`<br/>
Cela devrait fonctionner :
```
age: 28
favorite number: 26
salary: $1,234,108
```
# issue13486

https://github.com/grails/grails-core/issues/13486

```
 % ./gradlew assemble

> Task :compileGroovy FAILED
WARNING: The [show] action accepts a parameter of type [issue13486.ModelResolver] which does not implement grails.validation.Validateable.  Data binding will still be applied to this command object but the instance will not be validateable.

       def show(ModelResolver modelResolver) {}
       ^
startup failed:
/Users/sheiberg/Documents/workspace/issue13486/src/main/groovy/issue13486/GenericController.groovy: -1: The current scope already contains a variable of the name modelResolver
 @ line -1, column -1.
1 error
```

How to replicate:
```
git clone https://github.com/grails/grails-core.git
cd grails-core
git checkout 9135770f4e9d75a7973142d174520a56a93d59c0
./gradlew clean publishToMavenLocal 
```
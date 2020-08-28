## When to use design patterns and situations

### Creational design pattern
 - Builder pattern 
    - A calls contains number of constructors with different parameters to instantiate. Such situation builder pattern is use  ful. Builder pattern will build object part by part
    
 - Simple Factory pattern 
    - All sub classes are known in advance, also need to create at runtime by passing parameters, this pattern is useful
 - Factory pattern 
    - Classes to be instantiated not known in advance, instatiation happening at runtime this pattern is useful. Unlike 
     Simple Factory pattern, adding new sub class will be dynamic in this design pattern 

 - Abstract Factory pattern 
    - Abstract factory patten first load a factory then instantiate concrete class. So Abstract factory pattern contains a collection of factories

 - Singleton pattern 
    - This pattern ensures only one instance available at JVM. There two ways we can instantiate class 
        - Lazy (Instantiated only if needed)
        - Eager (class load anytime class instantiated)
    - Incase of Lazy loading, inner class approch useful to restrict multiple instance in different JVMs

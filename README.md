# Payment Kotlin Hexagonal
Payment service with kotlin and maven based on hexagonal pattern

## Configuring maven-compiler plugin 
There is a problem, that in default configuration, Java Compiler is invoked first, and the Kotlin compiler is invoked, but here 
we need to invoke the Kotlin(kotlin-maven-plugin) compiler first (to generate the concrete implementation) then the Java(maven-compiler-plugin) compiler 
to let it know that everything you want is present there already dude :). To do this add the following plugin to build configuration.

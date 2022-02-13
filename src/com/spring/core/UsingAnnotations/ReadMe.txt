If we have more than one class implementation for an interface , we have to add @Component on each of the implementation classes,
Having @Component on the college class , will allow spring to create an object for the college class alone , not for its dependencies.
@Component is used to create an object , it doesn't inject any value to the object . In-order to inject value to the object we have @Autowired
annotation. 

When we use @Autowired annotation there is no need to use setter methods.

Now say we have two implementation classes and want only one the class's object to be used by default , then we can use @Primary annotation

say for you have so may implemented classes , and now u want to chose one , then u can use @Qualifier annotation.

Having said that , now say we are having some literal values in the class and we want to inject the values into it , we can use @Value 
annotation.
@Value("College Name") 

This is one way of directly injecting the value or a static way of injecting the literal values . We can use Properties file to inject 
the values. Since we are not using any configuration file , we need to specify the properties file in the config class. 

We have an annotation called Property-Source to define the location of the properties file.





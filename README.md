# Creational Design Patterns:

These design patterns deal with making objects related to the different set of situations. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by somehow controlling this object creation.

The code above is self explanatory for different design patterns where different class names pertain to their specified set of functionalities.

Different creational patterns covered here:

- Strategy Design Pattern: When we have a long list of conditionals and we want to dynamically refer to those conditions then we can use this pattern. It allows to specify a set of algorithms where they are made interchangable and also they can modify their implementation without affecting the clients that use it. The abstraction is defined in the interface and the implementation details are buried in the classes that use it.

- Obsever Design Pattern: This is used when a Subject (Publisher) changes its state then all its Observers (Subscribers) are also updated with this state change and they can modify themselves based upon this state change. In a MVC pattern Subject can be thought of as the model or the guy that holds the data/business logic. And the views can be thought of as Observers such that when data changes then views also update themselves. Good thing is it allows "Loose Coupling" as Subject do not need to know anything about the Observers.

- Factory Design Pattern: Define an interface for creating an object but let subclasses decide which class to instantiate. It defers the instantiation to subclasses. Basically can be thought of as a factory which can give us the type of object we want. The client is just aware that there is a "factory" that manufactures and builds some stuff. It does not need to know how it does it.

- Abstract Factory Design Pattern: It differs from the factory pattern as it allows a family of various classes to be instantiated. We can think of it as a colleciton of factories with an extra layer or a "Salesperson" added in between the client and the final product where the job of salesperson is to define an ordering of the ordered "products". So here we are "abstracting" out the details for all the "family of products" that can be created via "various different factories".

- Singleton Pattern: When we want to restrict the instantiation to only one object of a class. It can be useful in situations where we do not want to create multiple objects of the same class. 

- Builder Pattern: It allows to "build" the object where the "builder" knows the "specific details" of how to make it. Client is made independent of this process. It separates the construction process of an object from its representation, so that the same construction can be used to make different representations.

- Prototype Pattern: Created new objects from the cloned instances of other objects. Useful when we want to create the subclasses for a super class at runtime. Reduces the number of subclass instances created.

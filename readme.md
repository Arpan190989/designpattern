#Steps to install on your system
git clone https://github.com/Arpan190989/designpattern.git

1.Go to your IDE.
2.Import existing project.
3.Select the project that is cloned.


#Main Class 
Main.java
This class have a switch case where existing pattern can be checked by updating the value of String pattern.


#Singleton - 
Creational design pattern singleton is being used in the project.
The main class Main.java will call MainTranscation.java , which is a singleton class. 
Since the class MainTransaction.java is singleton, only once instance of this class will be used on calling this class multiple times.
Steps to check
1. Go to Main.java
2. Change String pattern = "singleton"
3. In Main.java multiple instances are being called in the for loop, since the class is singleton , single hashcode is printed for all.

 
#Adapter
Adapter design pattern is being used in from Structural design pattern.
There is a manual geared car known as CruiseMManual and there is a automated car BMWR8Automatic.
In order to convert a geared car to automatic car a ManualtoAutomaticAdapter is created.
This takes geared car as a parameter and converts it to automatic car.
Classes Used
BMWR8Automatic.java
CruiseMManual.java
ManualtoAutomaticAdapter.java

Steps to check
1. Go to Main.java
2. Change String pattern = "adapter"
3.Run as java application


#Proxy
Proxy design pattern is being used in from Structural design pattern.
In this pattern a employee behaves as a proxy of other employee who have permission to do car manufacturing.

CarMechanic class is the class which have permission to start the manufacturing.
ProxyCarMechanic class is the class which can manufacture car in the absence of CarMechanic but should have to go through certain access check before the employee is authorized.

Interface used
CarManufacture.java

Classes Used
CarMechanic.java
ProxyCarMechanic.java

Steps to check
1. Go to Main.java
2. Change String pattern = "proxy"
3. Go to ProxyCarMechanic.java and change return type of isAuthorized() method to true to allow him the permission to manufacture class.
4.Run as java application


#Decorator design pattern
Decorator design pattern is being used in from Structural design pattern.
This design pattern is used to add additional functionality to the class.
In the attached code, there is a class SUV400 which have some functionality.
A decorator class CustomClassR8 is created to add additional functionality to the class.

Interface used
CarManufacture.java

Classes Used
SUV400.java
CustomClassR8.java
CarCustomizer.java

Steps to check
1. Go to Main.java
2. Change String pattern = "decorator"
3.Run as java application


#Iterator design pattern
Iterator design pattern is being used in from Behavioral design pattern
This design pattern is used to craete a new hidden implementation for iterating the collection

Classes
CarModels.java
CarModelsIterator.java
CarModelsList.java

Interface
CarIterator.java
CarList.java

Steps to check
1. Go to Main.java
2. Change String pattern = "iterator"	
3.Run as java application
# Java - learning programs

## Fundamental
1. DataType/s :
  - `primitive` Type
    - number: byte,short,int **,Long | float, double **
    - char | boolean
  - `Reference/Class` Type
    - Animal, Car, String, etc
    - wrapper class : int-->Integer
  - `Convert one Datatype to another`
    - Automatic : int i = s,
    - explicit : short s = `(cast)` i
    - " "+type = String

2. Control statements :
  - `if else` : if, if-else, if-elseif-elseif-else, if-elseif-elseif
  - `Switch-block `and `Switch-expression` (java 14)
  - operator and `operator-precedence` -->
    - !, && , ||, ternary-`?:`,
    - () + ? - * %
    - `bit/byte` :  >> , <<
      - rarely used.
      - int i=8 (binary-100), left-shift: 100(12) | `i = i << 1`
    - good practice : `wrap with ()`

3. Loop statements:
   - while :   `while(until condition=true) { ... }`
   - do-while : `do{ ... } while(until condition=true)`, body will run at least once.
   - `for` , `enhanced-for-loop`:used in collection

4. Exception handling:
   - prevent java program from crashing.
   - if error/exception comes, just handle it and proceed with rest of the execution.
   - syntax ::
     - `try { DBconn...body...} catch (Exception e){...} finally{ eg:DBconn close}` //j7
     - `try (DBconn) { ...body...} catch (Exception1 | exception2 e){...}` // J9
   - type :
     - checked (compile-time) : `Exception`, and its childException
     - unchecked (Runtime) :    `RuntimeException` and its child

5. Input-Output :: java.util.io.* / `java.util.nio.*`
   - `output` : console, file, etc
   - `input` : keyboard-`Scanner`, file, etc
   - File
     - READ :  `File`.lines(`Path`.of("file-location"))
     - WRITE : `FileWriter`.write(Path.of(file-location), list<String> )
   - `Serialization`
     - serial : old-byte[],char[] | `new:JSON` - Library : Jackson
       - Object1 ---> 01010101,0101111,00001000, ::  `byte[]`// data --> internet
       - Object1 ---> m,a,n,i,s,h,a,1,2,* :: `char[]` // data --> internet
       - Object1 ---> `JSON` // data ---> internet
     - De-serial / opposite:
       - internet -->  `byte[]` // data---> object1
       - internet -->  `char[]` // data---> object1
       - internet -->  `json`// data--> object1

---
## OOPS
`1. Class and objects`
  - Template/blueprint for creating object
  - `Object` is an `instance` of a `class`, has a `methods and properties`.
  - `Objects/Instance` created from `classes`, using the `new` keyword.
  - object create - using `new constructor(...)`
  - `this`,`super` : current object.
  - more:
    - `Enum`, `record`,
    - Generic-class <T>, eg : List<T>  - NO code
    - inner class - NO  code
    - Immutable classes. eg : String - NO code

- class members: [ Apply `Access specifier` : private, protected, default and public , to set access boundaries ]
  - a. `Methods`:
    - local variable (var declared inside method), setter, getter, toString, etc
    - `Instance method`
      - first create instance.object. let's say obj1
      - `obj1`.m(){...access any...}

    - `Static method`
      - Class level method
      - `className`.m() {...access static member...}

  - b. `Property`:
    - `Static Property`
      - class-level property
      - `ClassName`.<static-property>

    - `Instance property`
      - first create instance.object. let's say obj1
      - `obj1`.p1 , p2, etc

  - c. `Constructor` :
    - default/no-agr ,
    - All-Arg constructor,
    - chaining - `this()`, `super()`

- Fact:
  - `POJO` term - plain old java object / class with (setter,getter, constructor,toString)
  - java 16 - record (removes boilerplate code) - no setter, allArgCont, getter with no prefix, final props.
  - Introduction to Annotation, eg : @override. markers/metaData to compiler.
  - `Object` is parent of ALL classes.

2.`Encapsulation:`
- wrapping or bundling of data into a single unit (in {} bracket) .
- not exposing directly, write/hide details {}


3.`Inheritance:`
- Subclass(child) inherits attributes and behaviours(properties,methods) of superClass(parent).
- subclass 'extends' superClass
- hierarchical relationship between classes.

4.` Polymorphism:`
- Many Forms/changing according to situation.
- method `Over-ride` -> signature same. Overriding parent's method-body {} by child-class.
- method `Over-load` -> same name but different signature (number, type, count.,order of args).Return-type does not matter.

5. `Abstraction:`
- hiding implementation details,
- Hide complex details/ showing only what is needed.
  - `Interface:`
    - Abstract methods(no-body)
    - other class implements/ writes body.
    - subclass can implement many interfaces at one time.

  - `Abstract class:`
     - `Abstract` methods(no-body- implements by child class),
     - `Concrete` Methods(has-body)

6. `Association` (dependency, relationship):
```
 eg: Student has Address
   - Class `Address`
   - class `Student` {
      String name;
      int roll;
      Adderss address;       //has Address /has relation
     }
```
---
### Keywords:

- `Access Modifiers:`
Accessibility of classes, methods, and properties:

  - `public`: Accessible from anywhere, any package.
  - `protected`: within the same package and subclasses.
  - `default` :  same package only.
  - `private`:  within the same class only.

- `void` :
    - The return type of the method.
    - void indicates that the method does not return any value.

- `main` :
    - The name of the method. main method is the entry point of any Java program.
    - serves as the starting point for the execution of the program.

- `Final`:
  - Can be used with variables, methods, and classes.
  - `final variables`, they become constants.
  - `final methods`, they cannot be overridden.
  - `final classes`, they cannot be subclassed.
  
- `Static`:
  - related/connected with class, 
  - `Static variables` and `methods` belong to the class itself , rather than instances (objects) of class.
  
- `this:`
  - Refers to the current object instance within a class.
  -  used to differentiate between `class- properties` and `method- parameters` with the same name.

- `super:`
  - Refers to the superclass of the current object.
  - Used to access superclass methods and constructors.

- `Constructors`:
    - this(args): - Used to call another constructor within the same class.
    - super(args): - Used to call a constructor from the superclass.

- `Reference` :  
  - a variable, holds the memory address (reference) of an object.


- `Passing Parameters`:
  - `Pass By Value`
    - For primitive types, the actual value is passed, 
    - changes to parameter do not affect the original variable.
  - `Pass By Reference`:
    - For reference types (objects), a copy of the reference is passed. 
    - Changes to the object inside the method will affect the original object.

- `Functional interface` :
  - `Single Abstract Method`: contains only one abstract method.
  - `Default & Static Methods`: any number of default, static methods.
  - `@FunctionalInterface` : not mandatory, avoids accidentally adding more abstract methods.

-` Source code`: 
   - refers to human-readable code, written by developers
   - in a high-level programming-language(Java).
- `Bytecode` :
  - Java `Source code` --> `Byte code` (generated by- Java compiler(javac) --> `Machine code`)
  - executed by(JVM).

- `JDK (Java Development Kit)`:
  - includes JRE and JVM.
  - JRE- provides libraries, JVM 
  - JVM- Compiler (javac) - Java compiler
  - software development kit containing - tools, libraries for developing Java applications, 
  
- `JRE (Java Runtime Environment)`:
  - package of software, provides libraries, Java Virtual Machine (JVM), 
  - to run applications written in Java.

- `JVM (Java Virtual Machine)`:
  - JVM helps in - translating `Java bytecode` into `machine code`, 
  - which can run different platforms and environments.
  - providing platform independence.


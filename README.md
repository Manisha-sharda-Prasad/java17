# Java - learning programs

## Fundamental
1. DataType/s
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

2. Control statements:
  - `if else` : if, if-else, if-elseif-elseif-else, if-elseif-elseif
  - `Switch-block `and `Switch-expression` (java 14)
  - operator and `operator-precedence` --> 
    - !, && , ||, ternary-`?:`, 
    - + - ? * `%`
    - `bit/byte` :  >> , <<
      - rarely used.
      - int i=8 (binary-100), left-shift: 100(12) | `i = i << 1`
    - good practice : `wrap with ()`

3. loop statements:
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

5. input-output :: java.util.io.* / `java.util.nio.*`
   - `output` : console, file, etc
   - `input` : keyboard-`Scanner`, file, etc
   - File
     - READ :  `File`.lines(`Path`.of("filelocation"))
     - WRITE : `FileWriter`.write(Path.of(filelocation), list<String> )
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
1. Class and objects  / Encapsulation
  - Template for creating object
  - object create - using `new constructor(...)`
  - `this`,`super` : current object.
  - more: 
    - `Enum`, `record`, 
    - Generic-class <T>, eg : List<T>  - NO code 
    - inner class - NO  code
    - Immutable classes. eg : String - NO code

- class members: [ Apply `Access specifier` : private, protected, default and public , to set access boundaries ]
  - a. `methods`:
    - local variable (var declared inside method), setter, getter, toString, etc
    - `Instance method`
      - first create instance.object. let's say obj1
      - `obj1`.m(){...access any...}
      
    - `Static method`
      - Class level method
      - `className`.m() {...access static member...}
      
  - b. `property`:
    - `Static Property`
      - class-level property
      - `ClassName`.<static-property>
      
    - `instance property`
      - first create instance.object. let's say obj1
      - `obj1`.p1 , p2, etc

  - c. `constructor` : 
    - default/no-agr , 
    - All-Arg constructor, 
    - chaining - `this()`, `super()`

- Fact:
  - `POJO` term - plain old java object / class with (setter,getter, constructor,toString)
  - java 16 - record (removes boilerplate code) - no setter, allArgCont, getter with no prefix, final props.
  - Introduction to Annotation, eg : @override. markers/metaData to compiler.
  - `Object` is parent of ALL classes.


2. Inheritance
- Subclass(child) inherits attributes and behaviours(properties,methods) of superClass(parent).
- subclass 'extends' superClass 

3. Polymorphism
- method over-ride -> signature same. Overriding parent's method-body {} by child-class.
- method over-load -> same name but different signature (number, type, count.,order of args).Return-type does not matter.

4. Abstraction

5. Association (dependency, relationship)
```
 eg: Student has Address
   - Class `Address`
   - class `Student` {
      String name;
      int roll;
      Adderss address;  //here
     }
```
6. keyword
- `final`
- `static`




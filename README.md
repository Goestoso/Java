# Structure

<div style="display: flex; justify-content: center; gap: 40px;">
<figure style="margin-right: 20px;">
  <img align="center" alt="Goes-Java" height="100" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" >
   <figcaption><b> Studies about classes (mainly the String), methods (static and not static), builders, objects and recursion...</b></figcaption>
</figure>
</div>

<h2>String: </h2>

→ String is a class from `java.lang` (package that is automatically imported into all Java programs);

→ It provides methods for creating, manipulating, and working with strings (`array of characters`);

→ It is constant (`immutable`);

→ To assign String to variables we can use `builders`.

→ It can be concatenated by `+` or by <strong>methods</strong> (`concat()` and `format()`);

<h3>Methods</h3>

>Functionalities used at a given moment in the program.

* `.concat()` and `.format()` to concatenate

```
String name = "Name";
String surname = "surname";
System.out.println("Full name: ".concat(name).concat(" ").concat(surname));
System.out.println(String.format("%s %s %s", "Full name: ", name, surname));
```
  
* `.toUpperCase()` and `.toLowerCase()` to change the capitalization of the letters

```
String name = "Name";
name.toUpperCase();
System.out.println(name);
name.toLowerCase;
System.out.println(name);
```

* `.length()` returns the number of characters in a string

```
String name = "Name";
System.out.printf("%s", name);
System.out.println("Length: " + name.length());
```

* `.equals()` = returns true or false; `.eqeualsIgnoreCase()` returns true or false but ignore the capitalization of the letters; `.compareTo()` = returns a number based on Ascii table; `.compareToIgnoreCase()` = returns a number based on Ascii table but ignore the capitalization of the letters

```
String name1 = new String("Name"), name2 = "Name", name3 = "name";
System.out.println("name1.equals(name2): " + name1.equals(name2));
System.out.println("name1.equals(name3): " + name1.equals(name3));
System.out.println("name1.equalsIgnoreCase(name3): " + name1.equalsIgnoreCase(name3));
System.out.println("name1.compareTo(name2): " + name1.compareTo(name2));
System.out.println("name1.compareTo(name3): " + name1.compareTo(name3));
System.out.println("name1.compareToIgnoreCase(name3): " + name1.compareToIgnoreCase(name3));
```
<details>

<summary>new</summary>

>The keyword `new` is used to create a new instance of a class, that is, to create an object from a class.

>When using `new`, you are allocating memory for the object and initializing it through the class constructor.

```
Class object = new Class(parameters);
```

</details>


* `.charAt()` returns the character in a definite position

```
String name = "Name";
System.out.printf("%s", name);
System.out.println("First letter: " name.charAt(0));
```

* `.substring()` returns a part of a string

```
String name = "Name Surname";
int startIndex = 1, endIndex = 4;
System.out.println(name.substring(startIndex));
System.out.println(name.substring(startIndex, endIndex));
```

* `.replace()` replaces all declared occurrences, `.replaceAll()` works with strings and allows the use of regular expressions to find and replace more flexible and complex text patterns.

```
String text = "Hello, world!";
String replaceString = text.replace("world", "friend"); // Returns "Hello, world!"
String text = "banana123";
String replaceString = text.replaceAll("\\d", "X"); // Returns "bananaXXX"
```

<details>

<summary>More about String methods</summary>

* `.indexOf()` returns the position of the 1st occurrence of a string or character.

```
String name = "Name Surname";
System.out.println(name.indexOf("me"));
```

* `.lastIndexOf()` returns the position of the last occurrence of a string or character.

```
String name = "Name Surname";
System.out.println(name.lastIndexOf("me"));
```

* `.startsWith()` checks if a string starts withother (returns true or false).

```
String name = "Name Surname";
System.out.println(name.startsWith("me"));
```

* `.endsWith()` checks if a string ends withother (returns true or false).

```
String name = "Name Surname";
System.out.println(name.endsWith("me"));
```

* `.toCharArray()` returns a new character array that contains all the characters in the string in the same order they appear in the original string.

```
String name = "Name Surname";
char[] array = name.toCharArray();
```

* `.split()` separates a string into multiple substrings based on a specified delimiter.

```
String[] word = phrase.split(String regex);
```

* `.valueOf()` returns a string representation of a given value, whether that value is a number, an object, or any other type that can be converted to a string.

```
int number = 42;
String numberAsString = String.valueOf(number); // Converte o número 42 em uma string "42"
```

</details>

<h2>StringBuffer</h2>

It is a mutable object, that is, itsvalue can be changed, it means the valuestored in your instance can be changed.

> To create an instance of StringBuffer it is necessaryuse your builder:

```
StringBuffer str = new StringBuffer();
```

<h3>.append()</h3>

When we need to add more content to the end ofan object of this class.

```
StringBuffer str = new StringBuffer("Name ");
str.append("Surname ");
str.append(10);
char array[] = "With builder ".toCharArray();
str.append(array, 4, 11);
System.out.println(str);
```

<h3>.insert()</h3>

Allows you to enter values ​​into any position of a StringBuffer

```
StringBuffer strBuffer = new StringBuffer("Name ");
int offSet = 0;
String value = "Surname ";
strBuffer.insert(offSet, value);
System.out.println(strBuffer);
```

<h3>.replace() and .setCharAt()</h3>

To replace one character with another or one sequence of characters by another in aStringBuffer

```
StringBuffer strBuffer = new StringBuffer("name Buffer ");
int start = 4, end = 10, offSet = 0;
String value = "Surname ";
strBuffer.replace(start, end, value);
strBuffer.setCharAt(offSet, 'N');
System.out.println(strBuffer);
```

<h3>.delete() and .deleteCharAt()</h3>

To delete a character or string of characters from a StringBuffer

```
StringBuffer strBuffer = new StringBuffer("Name Buffer ");
int start = 4, end = 10, offSet = 0;
strBuffer.delete(start, end);
strBuffer.deleteCharAt(offSet);
System.out.println(strBuffer);
```

<h3>.reverse()</h3>

To reverse the character sequence of a StringBuffer

```
StringBuffer str = new StringBuffer("Name");
str.reverse();
System.out.print(str);
```

<h2>Subprograms</h2>

In Java, subprograms are called `methods`.

>They are blocks of instructions that perform specifics tasks and they avoid repeating a set of instructions which occurs several times in the program.

<h3>General form</h3>

>[access] [static] type name-of-method([array-of-arguments]) {
>
>body of method
>
>}

* access: `public`, provate or protected;
* static: means that you can access it using the class name instead of creating an instance of the class;
* type:  returns value type (`void` for those methods that do not return a result);
* array-of-arguments: local variables that receive the values ​​passed to the method (separated by commas ',');

<h3>Method without return of value</h3>

```
import java.util.Scanner;
public class Example {
  public static void main (String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a value: ");
    int value = input.nextInt();
    verifyValue(value);
    input.close();
  }

  public static void verifyValue(int number) {
    if (number>10)
      System.out.println("Value is bigger than 10");
    else
       System.out.println("Value is smaller than 10");
    return; //doesn't return a value
  }
}
```

<h3>Method with return of value</h3>

```
import java.util.Scanner;

public class VowelsInString {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0, index = 0;
		
		System.out.print("Hello! Type your first name: ");
		String name = sc.next();
		name.toLowerCase(); 
		
		while (i < name.length()) { 
            
			if(isVowel(name.charAt(i))) 
				++index; 
			
			++i;
		}
		
		System.out.println("Quantidade de vogais : " + index);
		
		
		sc.close();
		
	}
		
	private static boolean isVowel (char c) {
			
			//checks if the character is a vowel
			return c == 'a' 
			|| c == 'e'
			|| c == 'i'
			|| c == 'o'
			|| c =='u';
		
	}
}
```

<h3>Parameter passing</h3>

* By value: a copy of the variable's value is transmitted to the subprogram/method
* By reference: a reference (you canconsider memory addressing) is passed to the subprogram
    
   ➢ `Passing parameters by reference allows changing the content of the variable that was passed as parameter`
  
   ➢ In java, `primitive types` (int, long, float, double, char, etc.) are `passed by value`
  
   ➢ Referential types (`objects` such as StringBuffer, vectors and matrices) are `passed by reference`


<h3>By value</h3>

```
public int changeValue(int value) {
    value = 42; // This affect the original value outside the method.
    return value;
}

public static void main(String[] args) {
    int number = 10;
    changeValue(number);
    System.out.println(number); // Output: 42
}

```

<h3>By reference</h3>

```
public class Example {

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4};
        changeVector(vector);
        
        for (int value : vector) {
            System.out.print(value + " "); // Output: "10 20 30 40 "
        }
    }

    public static void changeVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] *= 10; // Multiply each element by 10
        }
    }
}

```

<details>

<summary>More about passing parameters</summary>

* The `object reference`, as object, will always point to the same object throughout that object's lifecycle.
* You can `modify the state of this object`, that is, its fields and properties, using this reference, but `you cannot make the object reference point to a completely different object`.
 
</details>

<h2>Exceptions</h2>

An exception in java is an object that describes an exceptional condition (`error`).

> It is managed by five keywords: `try`, `catch`, `throws`, `throw` and `finnally`.

* `try` → instructions that will be monitored must be inside a `try{}` block
* `catch` → if an exception occurs inside the `try{}` block, it can be handled by the `catch(Exception e) {}` clause
* `throws` → any exception that is passed on by a method must make this explicit by `throws Exception` in the method signature (after psvm(String args))
* `throw` → to generate an exception manually, use `throw Exception()` (if it is a new exception, use `new throw Exception()`)
* `finally` → instruction `finally{}` that must be executed after the `try {}`, it is necessarily executed at the end of exception handling, regardless of whether there is a return

> Model: 

```
try {

   //code monitoring

} catch (ExceptionType1 exOb1) {

  //exception handling

} catch (ExceptionType2 exOb2) {

  //exception handling

} finally {

  //executed at the end of the try

}

```

<details>

<summary>More about try-catch</summary>

* With `multi-catch`, it is possible to handle more than one exception in a single catch:

> } catch (Exception1 | Exception2 e) {}
  
</details>


<h3>Exception types: </h3>

→ All exceptions are derived from the `Throwable` class

> Throwable is divided into two subclasses: `Exception` and `Error`

* `Exception`: for exceptional conditions that the program can address.
* `Error`: errors that occur in the execution environment, for example, stack overflow.

<br>

<h4>Hierarchy of Exceptions:</h4>

![Java-Exceptions](https://github.com/Goestoso/Java/assets/132786474/4e97fe53-050f-41bf-9b40-b1ccc8861fa1)

<h3>Description of an exception</h3>

`Throwable` overrides the `toString()` method by returning a string with the exception description.

🪧 `.getMessage()`: returns a description of the exception as a string. It is typically used to obtain detailed information about the reason for the exception.

📃 `.printStackTrace()`:  returns the entire exception stack.

🔡 `.toString()`: returns a string representation of the exception, often composed of the exception's class name and its message.

🔎 `.getCause()`: returns the cause of the exception, which is another exception that caused the current exception. This is useful in nested exceptions.

<details>

<summary>Uses of exceptions</summary>

- It is possible to raise an exception explicitly using `throw`;

- If a method is capable of throwing an exception and does not handle it, it must make this behavior explicit so that callers can prevent it by using `throws`;

- The `finally` block will be executed regardless of whether an exception was thrown;

- Whenever a method is about to return to the `try-catch` caller, either by an exception or a return, the `finally` clause is executed;

</details>

<h3>Creating your own exceptions</h3>

You will need to define a subclass of `Exception`.

<h4>First step:</h4>

> You need to create a class for your custom exception. This class must `extend` an existing exception class, such as Exception or RuntimeException, depending on the type of exception you want to create.

```
public class MyException extends Exception {
    // Implementing your custom exception
}

```

* `extends`: it is used for a class to inherit characteristics from a superclass.

<h4>Second step:</h4>

> Create a `constructor` for your custom exception class. Typically, you must provide an error message that describes the exception. You can call the constructor of the parent class (superclass) and pass the error message to it.

```
public MinhaExcecao(String mensagem) {
    super(mensagem);
}
```

* `super`: it accesses constructors, methods and attributes of the superclass when they have the same name in the subclass.

<h4>Third step:</h4>

> Now you can use your custom exception in your code. Use the throw keyword to throw the exception where necessary.

```
public void someMethod() throws MyException {
    // Some logic in your method

    if (someCondition) {
        throw new MyException("Something happened!");
    }

    // Other logic
}

```

<h4>Fourth step:</h4>

> To catch and handle your custom exception, you need to use a `try-catch` block when calling the method that can throw the exception.

```
try {
    someMethod();
} catch (MyException e) {
    System.err.println("Exception caught: " + e.getMessage());
    // Exception handling logic
}
```

<h2>Classes</h2>

A `class` is a model or a plan for creating objects. 

* To declare a `class` with its attributes and methods:

> access-qualifier class Name { <br>
> / * ... list of attributes if necessary */ <br>
> access-qualifier attribute-data-type attributeName;

> access-qualifier return-type MethodName(parameters) { <br>
> / * method body * / <br>
> } <br>
> / * ... put as many methods as necessary. <br>
}

* Example: a class that contains three attributes corresponding to important data and a method for printing them.

<h4>attributes</h4>

```
/NameProudct.java file/

public class ProductName {
  public int codProd;
  public String descriptionProd;
  public double priceProd;
```

###

<h4>method</h4>

```
public void printProduct() {
  System.out.println("Code " + this.codProd);
  System.out.println("Description " + this.descriptionProd);
  System.out.println("Price " + this.priceProd);
 }
}
```

* `this`: refers to the current instance of the object. It can be used to access instance variables, instance methods, and constructors of the class itself.

<h3>Objects</h3>

<h4>🛠️ Creating an object: </h4> 

→ A `variable` in Java is used to store the object.


→ To access an attribute or method, `notations such as registration` are used.

→ It is necessary to create an object to be able to `access its attributes`.

* `new`: used to create a new instance of an object.
> ClassName object = new NameClass();

* `(.)`: dot in java is used to access members of an object.
> object.methodClass();

<h4>public classes ❌ public static classes</h4>

* `public class`:
  
→ A class declared as `public` is accessible from any class in any package.

→ Typically, you declare `non-static main classes (that is, classes that are not internal)` with public so that they can be used by other classes in different packages.

```
public class MyClass {
    // Contents
}

```

* `public static class`:

→ A class declared as public static is `a static inner class` that can be accessed directly by the name of the outer class, without the need to create an instance of the outer class.

→ This class is useful when you want to group inner classes with a scope limited to the outer class while maintaining the ability to `easily access them from other parts of the code`.

```
public class MyExternalClass {
    public static class MyInnerClass {
        // Inner class content
    }
}

```

> Generally, you use `static inner classes` when you want to `group classes that are related to the outer class`, or when the static inner class `can be used by other parts of the code` but does not need an instance of the outer class to be accessed.

<h3>Constructor</h3>

It is used to create an instance of a class (an object). We can define our own constructors and make class attributes with `private`.

* `private`: used to declare that an object can only be accessed within the class itself.

> A constructor has no return type, has the same name as the class and can have parameters.

```
public Person (String nm, String id) {
  name = nm;
  identifier = id;
}
```

<h4>🛠️ Types of Constructors: </h4>

→ `Parameterless constructor`: creates an object with values ​​specified in the constructor body, not allowing the user to pass parameters to the constructor.

→ `Constructor with parameter`: creates an object with specified values ​​by passing parameters.

→ `Copy constructor`: generates a copy of another object.

<h4>📃Rules: </h4>

- a constructor never returns anything, it has `no return type`;

- always has the `same class name` (mandatory);

- must always be public;

- is called to instantiate an object;

- is NEVER of the `abstract` type.

<details>

<summary>abstract</summary>

- `abstratct`: declares a class or method as abstract, which means `it cannot be instantiated (in the case of classes)` or cannot be implemented in the current class, `leaving implementation to subclasses (in the case of methods)`.
- `@Override`: annotation that makes method substitution explicit, when one class extends another (such as abstract ones).
 
</details>

<h2>👑 Heritage, 🔀 Polymorphism and 🔓 Encapsulation</h2>

- The ability to create a new class (subclass) based on an existing class (superclass) is called `inheritance`.

```
class Animal {
    String name;

    void sound() {
        System.out.println("Some animals make noises.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println(name + " makes the sound: Woo wow!");
    }
}

class Cat extends Animal {
    Gato(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println(name + " makes the sound: Meow!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex");
        Cat whiskers = new Cat("Whiskers");

        rex.sound();       // Outputs: Rex makes the sound: Woo wow!
        whiskers.sound();  // Outputs: Whiskers makes the sound: Meow!
    }
}

```

> The `subclass` inherits the attributes and methods of the `superclass` and the condition that objects from different classes respond to the same method differently is `polymorphism`.

- The concept of hiding internal details of a class is` encapsulation`.

> Accessor Method: reads the value of an attribute (Started by `get`);

> Mutator (or Modifier) ​​Method: modifies the value of a attribute (Started by `set`);

> Worker Method: are linked to more “robust” methods who generally perform more specific tasks. Tip: `use infinitive` (can be of void or primitive type, such as boolean). Ex: print, change;

```
class Person {
    private String name; //attributes
    private int age;

    public Person(String name, int age) { //builder
        this.name = name;
        this.age = age;
    }

    public String getName() { //getter
        return name;
    }

    public int getAge() { //getter
        return age;
    }

     public void setName(String n) { //setter

  	 name = n;
     }

      public void setAge (int a) {  //setter

          age = a;
      }

       public boolean verifyAge () { //worker

           boolean valid;

           if (age < 21)

              valid = false;

           else

               valid = true;

           return valid; 
       }
	
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println(person.verifyAge == true ? "This person can drink alcohol" : "This person can't drink alcohol");
        String newPerson = "Gabriel";
        person.setName(newPerson);
        int newAge = 19;
        person.setAge(newAge);
        System.out.println("New name: " + person.getName());
        System.out.println("New age: " + person.getAge());
        System.out.println(person.verifyAge == true ? "This person can drink alcohol" : "This person can't drink alcohol");
        
    }
}

```

> `Access methods (Getters, Setters and Workers)`: to allow controlled access to attributes, it is ideal to create `"get" (access)`, `"set" (change)` and `"infinitive" (print, verify...)` for these attributes.

<details>

<summary>import and package</summary>

- `import`: imports classes from other packages.

```
import with.example.otherpackage.OtherClass;
```

- `package`: organizes classes into packages.

```
package with.example.mypackage;

```
 
</details>

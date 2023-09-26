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

* `.length()` returns the number of characters in a string

```
String name = "Name";
System.out.printf("%s", name);
System.out.println("Length: " + name.length());
```

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

  

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

  

# Data Structure

<div style="display: flex; justify-content: center; gap: 40px;">
<figure style="margin-right: 20px;">
  <img align="center" alt="Goes-Java" height="100" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" >
   <figcaption><b> Studies about data structure with Java.</b></figcaption>
</figure>
</div>

→ _Efficiency_:
* `Memory Occupancy;`
* `Processing time;`

<h2>Vector</h2>

A vector is a data structure that stores a collection of elements of the same type contiguously in memory. Each element is accessed through an index, which represents its position within the vector.

<h3>Class</h3>

| Class    |
|----------|
|- attributes|
| + methods  |

- `main():`  the executable entry point for a class (_Application_).

> _name-type_ ___modifiers___ `(parameters)` {} → method signature.

> _public_ ___MainClass___ `(parameters)` {} → builder

```
  STACK (STATIC) -> Primitives and Reference
┌───────┐
│ n[10] │    
│ v →   │    v.method()
└───────┘
   ↘                HEAP (DINAMIC)
  - - - - - - - - - - - - - - - - - - - - - - - - -
 /                                                 \
|       ( [-1]↑ ) object                            |
|             ↪[][][][]                             |
|      methods                                      |
 \                                                 /
  - - - - - - - - - - - - - - - - - - - - - - - - -

```

`Stack:` is an area of memory used to store temporary data created during the execution of a program.

- This includes method local variables, return addresses, and other data related to function execution.
- The stack is a _Last-In, First-Out_ (___LIFO___) data structure, which means that the last item added to the stack is the first to be removed.

`Heap:` is an area of memory used to store dynamically allocated objects during the execution of a program. 

- Unlike the stack, the heap is a _First-In, First-Out_ (___FIFO___) data structure, where the first item added to the heap is the first to be removed.

> 💾 Therefore, during the execution of a program, the primitive variables and object references are usually allocated to the ___stack___, while the objects themselves are allocated to the ___heap___.

<h3>Object</h3>

It is a fundamental class that serves as the root of the entire class hierarchy (default builder).

The _Object class_ defines several important ___methods___ that are available to all classes in Java, including:

- `toString():` returns a string representation of the object (by default, this method returns the class name followed by "@" and the object's hexadecimal hashcode).
- `equals(Object o):` Compares whether the current object is the same as the object provided as an argument (by default, this method checks to see if the two objects refer to the same memory location, unless overridden in a specific class to provide custom equality logic).
- `hashCode():` Returns a hash code of the object, which is an integer used to uniquely identify the object during search operations and in data structures such as HashMaps.
- `getClass():` Returns the object's class as an object of the Class class.
- `clone():` Creates and returns a shallow copy of the object.
- `finalize():` Called by the garbage collector when the object is about to be collected.

```
                  +--------------+
                  |   Animal     |
                  +--------------+
                  | - name       |
                  +--------------+
                  | + makeNoise()|
                  +--------------+
                         |
                         |
                +----------------+
                |    Mammal      |
                +----------------+
                | - lactation    |
                +----------------+
                   /          \
                  /            \
                 /              \
        +----------------+   +----------------+
        |    Dog         |   |    Cat         |
        +----------------+   +----------------+
        | - @bark()      |   | - @meow()      |
        +----------------+   +----------------+


```

<h3>Polymorphism</h3>

Refers to the ability of objects of a class to be treated as objects of their base class, allowing methods of different objects to be called with the same name, but with different behaviors depending on the specific type of object.

- `Overriding:` the annotation  ___@Override___ is a good practice in Java to explicitly indicate that one is overwriting (changing the behavior, without modifying the signature) a method of the parent class.

```
public class Animal {
    public void noise() {
        System.out.println("Make noise");
    }
}

```

```
public class Dog extends Animal { //extends to declare that the class is inheriting from another
    @Override
    public void noise() {
        System.out.println("Ow ow");
    }
}   
```

- `Overloading:` methods of the same name, but with a different signature. That way the compiler is able to determine which method to use.

```
void method (int a, int b){}
void method (int a, int b, String c){}
```


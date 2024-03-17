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
- `generics:` it's a concept in programming that allows us to write code that can operate with different types of data, in a generic way. 

```
public class Box<G> {
    private G content;

    // Builder
    public Box(G content) {
        this.content = content;
    }

    // Method to get the contents of the box
    public G getContent() {
        return content;
    }

    // Method for Printing the Contents of the Box
    public void printContent() {
        System.out.println("Contents of the Box: " + content);
    }

```

<details>

<summary>(<>)</summary>

- `<>` -> also known as "diamond operator" in Java, are used to indicate the use of ___generics___. They are used in declarations of classes, interfaces, methods, and constructors to specify a _generic type_.
  
- When you create a generic class instance, you can specify the type of data you want to use within the class using `<>`, such as this example:

```
Box<Integer> integerBox = new Box<>();

```
  
</details>

<h2>Elementary Sorting Methods</h2>

→ They are simple and straightforward algorithms designed to order collections of elements, such as arrays, lists, or sequences.

```
+----------+      +-------------+      +-------------+
|BubbleSort| ---- |InsertionSort| ---- |SelectionSort| =====> by comparison!
+----------+      +-------------+      +-------------+

```

> Overall performance of the algorithms is quadratic time: ___(n² - n) / 2___

<h3>Bubble Sort </h3>

→ This method compares adjacent pairs of elements and swaps them if they are in the wrong order, repeating this process until the list is sorted. 

```
public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // change the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

```

<h3>Insertion Sort</h3>

→ In this method, the elements are traversed one by one and inserted into the correct position in the already ordered part of the array. 

- It's efficient for small lists or when the list is almost ordered.

```
public class InsertionSort {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            //Moves the array elements[0..i-1], which are larger than key,
            //to a position ahead of your current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
```

<h3>Selection Sort</h3>

→ This method finds the smallest element in the list and places it in the first position, then finds the second smallest element and places it in the second position, and so on, until the list is sorted. 

```
public class SelectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swaps the minimum element found with the first unordered element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
```

<h2>Linked lists</h2>

→ Structures that correspond to a sequence of inputs or `nodes`.

> 🔗 Linked lists provide a flexible and efficient way to ___organize___ and ___navigate___ through sequences of elements.

<h3>Nodes</h3>

```
 ↪ +--------+     +--------+     +--------+     +--------+
    | Node  |      | Node  |      | Node  |      | Node  |
    +-------+      +-------+      +-------+      +-------+
    |  Data |      |  Data |      |  Data |      |  Data |
    +-------+      +-------+      +-------+      +-------+
    |  Next |----->|  Next |----->|  Next |----->|  Next |-----> null
    +-------+      +-------+      +-------+      +-------+
```
- Each box represents a _node_ in the linked list.
- Each node has a ___data field___ (_Data_) to store information and a ___pointer___ (_Next_) that points to the next node in the list.
- Typically, in a linked list _there are one or two known access points_: the ___first___ and the ___last___.
- The _last node_ in the list has its _Next_ pointer pointing to ___null___, indicating the _end_ of the list.

```
public class Node<N> {
    private N data;
    private Node<N> next;

    // Construtor
    public Node(N data) {
        this.data = data;
        this.next = null;
    }

    // getters to 'data'
    public N getData() {
        return data;
    }

    public void setData(N data) {
        this.data = data;
    }

    //getter to 'next'
    public Node<N> getNext() {
        return next;
    }

    public void setNext(Node<N> next) {
        this.next = next;
    }
}

```

<h3>Inserting Elements</h3>

- Insertion at the _Beginning_:

```
public class LinkedList<L> {
    private Node<L> head;

    public void insertAtBeginning(T data) {
        Node<L> newNode = new Node<>(data); // Creates a new node with the specified value
        
        // If the list is empty, the new node becomes the head of the list
        if (head == null) {
            head = newNode;
        } else {
            newNode.setNext(head); // Sets the next node as the current heady
            head = newNode; // Updates the head for the new node
        }
    }
}

```

- Insertion at the _Ending_ without attribute ___tale___:


```
public class LinkedList<T> {
    private Node<T> head;

    // Método para inserir um elemento no final da lista
    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data); // Creates a new node with the specified value

        if (head == null) { //  If the list was empty
            head = newNode; //The new node becomes the head
        } else {
            Node<T> current = head;
            // Scroll through the list until you find the last node
            while (current.getNext() != null) {
                current = current.getNext();
            }
            // Sets the next node of the last node as the new node
            current.setNext(newNode);
        }
    }
}

```

- Insertion at the _Ending_ with attribute ___tale___:

```
public class LinkedList<L> {
    private Node<T> tail; //To store a reference to the last node in the list

    public void insertAtEnd(T data) {
        Node<L> newNode = new Node<>(data); // Creates a new node with the specified value
           if (tail == null) { // If the list was empty
               head = newNode; // The new node becomes the head
               tail = newNode; // The new node also becomes the tail
           } else {
               tail.setNext(newNode); // Sets the next node of the current tail as the new node
               tail = newNode; // Updates the tail to the new node
           }
       }
}
```

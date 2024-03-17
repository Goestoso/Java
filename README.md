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
|       ( [-1]↑ )object                             |
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


# Algorithms and Logic

<div style="display: flex; justify-content: center; gap: 40px;">
<figure style="margin-right: 20px;">
  <img align="center" alt="Goes-Java" height="100" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" >
   <figcaption><b> Studies about algorithms and programming logic.</b></figcaption>
</figure>
</div>

```
import java.util.Scanner;
import java.util.JOptionPane;

public class Test {
  public static void main (String[] args) throws InterruptedException {

      Scanner scanner = new Scanner(System.in);
      
      int index = 0, quantity = 12;
      double price = 3.50;
      boolean isGift = true;
      char option  = 'x';
      String smth = " ";

      System.out.println("Hello, world! Say something...");
      smth = scanner.next();
      System.out.println("I will show to you the variablesin my code: \nint quantity = " + quantity + "\ndoule price = " + price + "\nboolean isGift = " + isGift);
      System.out.println("What do you prefer? An option with 'x' or with other value?");
      option = scanner.next()charAt(0);
      System.out.println("Your new option is " + option);
      while (index <= 0 || index > 10) {
        System.out.print("Choose a number between 1 and 10.");
        index = scanner.nexInt();
        if (index <= 0 || index > 10)
            System.out.println("A number between 1 and 10!");
        else
             System.out.println("Good number!");
      }
      for (int i = 0; i <= index; ++i) {
        System.out.println(i);
        Thread.sleep(1000);
      }
      JOptionPane.showMessageDialog (null, "BOOOOOOOM! 💣", "EXPLOSÃO: ", JOptionPane.WARNING_MESSAGE);
      scanner.close();
   }
}

 ```

<h2>Introduction: </h2>
<p>The base form of Java logic is simple, we must respect the case styles: `snake_case(folder)`, `kebab-case(web)`, `PascalCase(Class)` and `camelCase(variable)`.</p>
<p><b>→ Inputs:</b> we have the input (for now: keyboard);</p>
<p><b>→ Process:</b> we have the processing (content);</p>
<p><b>→ Outputs:</b> we have the output (console);</p>

<h2>Simple type variables: </h2>
<p><b>⅒ Numerical:</b> (int, double);</p>
<p><b>ª Characters:</b> (char, String);</p>
<p><b>✓ Logical:</b> (boolean);</p>

<h3>Math operations</h3>

`+ - * / %` for simple operations;<br>
`Math.sqrt()` for square root (y = Math.sqrt(x));<br>
`Math.pow()` for powers (y = Math.pow(base, exponent));

<h2>Compilation: </h2>

>`javac` to compile the file and debug the class; <br>

>`java` to execute the program; 

<h2>Classes: </h2>
<h3>Scanner</h3>
<p>It is a read class, for storing system input values ​​in variables that are stored in memory.</p>

<h4>Casting:</h4> 

- int → `.nextInt();` 
- double → `.nextDouble();`
- boolean → `.nextBoolean();`  
- String (word) → `.next();`
- String (phrase) → `.nextLine();`
- char → `.next().charAt(positionOfChar);` 

<details>
  <summary>Import, instantiate and close</summary>

- To import:

```
java.util.Scanner;
```

- To instantiate:

```
Scanner scanner = new Scanner (System.in);
```

- to close

```
scanner.close();
```

</details>

<h3>JOptionPane</h3>
<p>It can show messages, collect entries, and display confirmation dialogs (the output is always a String).</p>

<h4>Casting:</h4> 

- int → `Integer.parseInt();` 
- double → `Double.parseDouble();`
- boolean → `Boolean.parseBoolean();` 

<details>
  <summary>Import and show messages</summary>

- To import:

```
javax.swing.JOptionPane;
```

- To show an input message:

```
JOptionPane.showInputDialog("msg");
```

- To show an output message:

```
JOptionPane.showMessageDialog(null, "msg");
```

</details>

<h2>Conditional: </h2>

Here we can use Boolean logic (like true or false), considering numbers, characters, String and the boolean method as validation parameters.

* `>= > <= <` to compare;
* `==` to say that is equal;
* `||` to say this situation OR that situation;
* `&&` to say this situation AND that situation;
* For boolean methods → `!existVariable` means false, `existVariable` means true; 

<h3>if...else if...else</h3>

>if (variable == 0)<br>
>    //code case the conditional is true<br>
>else if (variable == 1)<br>
>    //code case the conditional is is an specific difference<br>
>else <br>
>    //code case the conditional not corresponds or to all the other differences

<h3>switch...case</h3>

>switch(variableOptions) { <br>
>case 1: //code for first option <br>
>break; //to close the case<br>
>case 2: //code for second option <br>
>break; <br>
>default: //code if none of the options is selected <br>
>break; <br>
>}


<h3>Ternary</h3>

>(boolean conditional) ? value case true : value case false; <br>
>int age = sc.nextInt() <br>
>String message = (age >= 21) ? "Adult" : "Young"; 

<h2>Loop: </h2>

Increment (index) → `a = a + 1` equals to `a += 1` equals to `a++` or `++a`

* `a++` is a post-increment(uses the current value of the variable 'a' in operations and then increases the value of 'a');
* `++a` is a pre-increment(increases the value of variable 'a' before using the incremented value in any operation);

<h3>while</h3>

>int variableIndex = 0; <br>
>while (variableIndex <= 10) {<br>
>    //loop code case the conditional keep true<br>
> variableIndex++ //to refresh the index <br>
>}

<h3>for</h3>

>for (int i = 0 //initiate value of the index; i <= 10 //the condition of the index; ++i //the refresh of the index) {<br>
>    //looping if conditional stays true<br>
>}

<h3>for-each</h3>

* for-each is used to iterate through two elements of a collection, such as an array or a list, without the need to use explicit indices.

>for (typeOfElement element : array) { <br>
>    // Code <br>
>}

<h3>do...while</h3>

* do-while always does at least one iteration before ending the loop.

>int variableIndex = 0; <br>
>do {<br>
>    //loop at least once and continue looping if conditional stays true<br>
> variableIndex++ //to refresh the index <br>
>} while (variableIndex <= 10);

<h2>Array: </h2>
<p>Arrays are lists divided into vectors and matrices, which can contain objects, strings and primitive types (int, double, boolean)....</p>

<h3>Vector</h3> 

>To declare the vector:

```
int vector[] = new int [numberOfPositions];
```

>To iterate through the vector elements:

```
for (int i = 0; i < numberOfPositions; ++i) {
  vector [i] = i;
}
```

| 0 | 1 | 2 |
| ---- | ---- | ---- |

<h3>Matrix</h3>

>To declare the matrix:

```
int matrix[][] = new int [numberOfPositionsInRow][numberOfPositionsInColumn];
```

>To iterate through the matrix elements:

```
for (int i = 0; i < numberOfPositionsInRow; ++i) {
  for (int j = 0; j < [numberOfPositionsInColumn; ++j) {
    if (i ==0)
      vector [i][j] = i + j;
    else
      vector [i][j] = i;
  }
}
```

| 0 | 1 | 2 | 3 |
| ---- | ---- | ---- | ---- |
| 1 | 1 | 1 | 1 | 
| 2 | 2 | 2 | 2 |
| 3 | 3 | 3 | 3 |

<details>

  <summary>Array curiosity</summary>

<br>
  
>You can add more `[]` for multidimensional arrays...

```
int multiMatrix[][][] = new int [numberOfPositionsInRow][numberOfPositionsInColumn][DepthPositionNumber];
```

![Cubo](https://github.com/Goestoso/Java/assets/132786474/463a05a2-ec5a-4457-a69b-628b1f3761a4)

* To iterate through the multiMatrix elements:

```
for (int i = 0; i < numberOfPositionsInRow; ++i) {
  for (int j = 0; j < numberOfPositionsInColumn; ++j) {
    for (int z = 0; z < DepthPositionNumber; ++z) {
       multiMatrix[i][j][z] = i + j + k;  
    }
  }
}
```
<br>

>You can create an array (`Jagged Array`) that contains other arrays, where these inner arrays can be of different sizes.

```
int[][] jaggedArray = {
    {1, 2, 3},
    {4, 5},
    {6, 7, 8, 9}
};
```

| 1 | 2 | 3 |  |
| ---- | ---- | ---- | ---- |
| 4 | 5 | 
| 6 | 7 | 8 | 9 |

</details>


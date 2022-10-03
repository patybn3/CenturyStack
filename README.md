<h3>Object-Oriented Data Structure Using Java, 4th Edition</h3>

<h4>Student: Patricia Antlitz - NECC Fall 2022 <br> Computer Science II</h4>
<h5>Chapter 2 - Exercise 24, 34, 49 </h5>

####variables used:

```java
    public int ARRAYMAX;     //user inputs
    protected int[] stackArr;
    protected int indexTop;
    int random;
    String[] myLine;
```

24. A Century Stack is a stack with a fixed size of 100. If a Century Stack is full, then the
    element that has been on the stack, the longest, is removed to make room for the
    new element. Create a `CenturyStackInterface` file that captures this specification
    of a Century Stack.<br>
```java
    int push(int stackElements);   //method that must be used by the files implementing this interface
    void pop();
    int ARRAYMAX = 100;
```

34. Implement a Century Stack (see Exercise 24).

a. Using an array (can you devise a solution that maintains O(1) ef iciency for the
push operation?).<br>
file used = `CenturyStacl_Implemented.java`
```java
    //methods used    
    public int push(int stackElements);           //required. Uses a variable increment to increment the indexes. push() can only push 1 element
    public void pushToArray();                    // not required. Uses a loop to call push() passing a random number as a parameter
    public void pop();                            //required. Will loop through the array to remove the element in index 0
    public void pushLast(int num);                // not required. Uses method push() to insert one more element at the end of the array
// the end of the list. Value of the parameter is passed in the main method as a random numbers
    public void printList();                      //prints all the results
```
b. Using an ArrayList<br>
file used = `CenturyStack_ArrayList.java`
```java
    public int push(int stackElements);           //required. Uses ArrayList's functionality .add() to add one element into the list
    public void pushToArray();                    // not required. Uses a loop to call push() passing a random number as a parameter
    public void pop();                            //required. Will use ArrayList's function .remove(index) to remove index 0
    public void pushLast(int num);                // not required. Uses method push() to insert one more element at 
// the end of the list. Value of the parameter is passed in the main method as a random numbers
    public void printList();                      //prints all the results
```

47. Implement a Century Stack (see Exercise 24) using a linked list.<br>
file used: `CenturyStack_LinkedList.java`
```java
    public int push(int stackElements);           //required. Uses ArrayList's functionality .add() to add one element into the list
    public void pushToArray();                    // not required. Uses a loop to call push() passing a random number as a parameter
    public void pop();                            //required. Will use ArrayList's function .remove(index) to remove index 0
    public void pushLast(int num);                // not required. Uses method push() to insert one more element at 
// the end of the list. Value of the parameter is passed in the main method as a random numbers
    public void printList();                      //prints all the results
```

###Main class: CenturyStack_PatriciaAntlitz.java

####***this program is an example of how the ArrayBoundedStack.java class works, it uses the second constructor passing a value as a parameter. It implements the ArrayBoundedStack to allow the program to use some elements that are placed outside a method (array)

```java
//calls method:
    public void printSeparationLine(); //prints a dashed line to separate the different lists
```

<hr>
<h5>Problems and Specs:</h5>

- The instructions stated that the list should be of a size of 100. I can't set a fixed size for ArrayList and LinkedList. I added the size to
ArrayList, but I know that makes no difference. I didn't do to the LinkedList because it wouldn't allow me. I just discovered you cant do it without having to go around it.
  
- I added a try/catch to `CenturyStack_Implemented.java` (the array file). I dont think that is needed, all values are set by the program. I did it anyway, but I did not include it to other files.

- `push(int)` only pushes one value into the lists, `pushToArray()` is the method that has a loop that loops 100 times to add all values to the lists.
    - I did that, so I could use push() by itself to push one more element to the end of the array (index 99), done by `pushLast(int)`
    - `pop(int)` take a parameter, the parameter is passed by `pushToArray()` as a random number.
    - `pushLast(int)`'s parameter is passed when it's called in the main method as a random number.
    
- `pop()` will only pop the very first element entered by the loop (index 0);

- the program prints the list when first generated. Then it prints the list without index 0 (index 1 shifted to position 0). Then it prints the new list with one more element added to index 99.

- I found the implementation using a regular array very time consuming. I had some trouble coding that. All sources I found (attached) where for FIFO using LinkedList, mostly, or ArrayLists.

<hr>

###Sources

remove first from arrayList<br>
https://www.geeksforgeeks.org/remove-first-element-from-arraylist-in-java/ <br>
first and last<br>
https://www.geeksforgeeks.org/find-first-and-last-element-of-arraylist-in-java/
<br>
linked list<br>
https://www.baeldung.com/java-remove-first-element-from-list
<br>
fifo<br>
https://www.geeksforgeeks.org/fifo-first-in-first-out-approach-in-programming/


<h5>Technologies</hr>
- JAVA 15.0.1


<hr>

<h3>To run:</h3>
<hr>

IDE:<br>
Build the project and run the CenturyStack_PatriciaAntlitz.java file

CLI:<br>
* Navigate to the correct directory ....../CenturyStack_PatriciaAntlitz/src <br>
* Run on terminal:
    * javac CenturyStack_PatriciaAntlitz.java => compile
    * java CenturyStack_PatriciaAntlitz.java => run

by [Patricia Antlitz - GitHub](https://github.com/patybn3)
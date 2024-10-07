Project 05: Sorted Stack
Overview
Project 05: Sorted Stack is a Java-based program that demonstrates the use of the Stack class along with sorting mechanisms. The program allows users to input integers, which are stored in a stack. After all inputs are provided, the stack is sorted in ascending order using Java’s Collections.sort() method and then printed.

Key Concepts
Stack Data Structure:

This project showcases the use of the Stack class, which follows the LIFO (Last In, First Out) principle for storing elements.
Sorting a Stack:

While stacks are not inherently designed for sorting, this project demonstrates how to achieve sorting by leveraging the Collections.sort() method, which temporarily converts the stack into a list for sorting purposes.
User Interaction:

The program provides a simple, console-based interface where users can input integers. Input ends when a non-integer is provided, and the sorted stack is displayed afterward.
Features
Dynamic User Input: Accepts integer inputs until the user enters a non-integer, at which point the input process stops.
Stack Operations: Demonstrates the fundamental operations of a stack, such as push() for inserting integers.
Sorted Output: Once all input is provided, the stack is sorted using Collections.sort() and the sorted stack is printed.
Javadoc Documentation: The program is documented with detailed Javadoc comments for each method and class, making it easy to understand and maintain.
How It Works
User Input:

The user is prompted to enter integers, which are stored in a stack.
Input ends when a non-integer is entered.
Sorting:

The stack is sorted using Collections.sort(), which temporarily converts the stack to a list, sorts it, and stores the sorted elements back in the stack.
Output:

The sorted stack is printed to the console after the input process is complete.
Example Usage
Enter numbers (non-integer to stop):
> 45 12 78 3 56

Sorted Stack:
> [3, 12, 45, 56, 78]
How to Run
Compile the program:
javac SortedStack.java
Run the program:
java SortedStack
Input:

Enter integers one by one, and input stops when a non-integer is entered. The sorted stack will then be printed.
Educational Purpose
This project demonstrates:

The use of Stacks as a dynamic data structure.
How to achieve sorting on a stack using Java’s Collections Framework.
Real-time application of sorting algorithms and stack operations, making it a valuable learning tool for understanding Java data structures.

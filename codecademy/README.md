#10 Advanced Java Code Challenges (from [codecademy](https://www.codecademy.com/resources/blog/advanced-java-code-challenges)).

1. Write a Java program to reverse a string without using the reverse method of Java's String class
   This exercise will teach you about how Java handles strings. First, you should create a class with a main method that accepts a string and then returns a string where the characters are in reverse order. But, you can't use the reverse method of the String class because that’d be cheating.

Even without doing that, there are at least three ways you can solve this exercise. Can you solve it in three different ways?

2. Write a Java program to determine whether a number is prime or not
   This program should accept an array of numbers. It should iterate through the array of numbers and determine if each is prime or not. Once it’s done processing, it should return only those numbers that are prime in an array.

3. Create a Java Singleton class
   The singleton pattern is a design pattern that restricts the instantiation of an object to only one instance. To do this, you’ll need to create a Singleton class that has a non-parameterized constructor.

The class should have one public variable called str. It should also have a static method called getSingleInstance that’ll return the single instance of the class.

4. Write a Java program that returns an MD5 hash
   MD5 (Message-Digest algorithm 5) is a cryptographic function for creating 128-bit hashes from strings. It was designed by Professor Ronald Rivest of MIT, and although the function is considered cryptographically broken, it’s still useful as a programming exercise.

Research the algorithm and write a Java class from scratch that accepts an alphanumeric string and returns the MD5 hash for that string.

5. Write three Java lambda expressions
   This exercise will test your ability to write lambda expressions in Java. Java lambda expressions take in parameters and return a value. They’re similar to methods but don't need a name and can be implemented in the body of a method.

In this challenge, you’ll write three of them:

One that returns true if a number passed to it is odd and false if it’s even.
One that returns true if a number is prime and false if it’s not.
One that returns true if the parameter is a palindrome and false if it’s not.
6. Write a phone number word decoder
   Write a program in Java that’ll accept a phone number with letters and convert it to a phone number with only digits. For example, if you sent the program a phone number like 800888TEST, it should return (800) 888-8378.

Note that it shouldn’t only convert letters to the digits they represent but also format the number correctly with parentheses and dashes. And, if you send the program an invalid number, it should throw an error.

7. Write a method to determine consecutive numbers
   Create a method in a Java class that accepts an array of numbers as a parameter. If the array of numbers can be rearranged so that they’re consecutive numbers where no number appears twice, return true. If this isn’t possible, return false. The array can be of any size.

8. Find the hex code embedded in a string
   In this challenge, you’ll create a method in Java that accepts both a string to be searched and a string that’s been encoded in hex and embedded in the first string as parameters. The method should search the first parameter and return the index of the occurrence of the second parameter.

9. Reverse only the letters in a string
   Write a method in Java that accepts a string as a parameter. This method should return a string that reverses the letters in the string sent as a parameter but keep all the numbers in order. For example, if you sent the method a parameter of "ez56d" then it should return "ed56z".

10. Write a Pig Latin translator
    Pig Latin is a language or language game. Here are the steps with any word. First, move the first consonant or consonant cluster to the end of the word. Second, add "ay" to the end of the word. For example, the word "banana" would become "ananabay."

Write a method in Java that turns a string that contains words into the equivalent in Pig Latin.
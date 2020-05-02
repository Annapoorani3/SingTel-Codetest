# SingTel-Codetest
Java Programming 

I have created separate project for each section.
I have added the classes according to the scope of the question.

Section A:
1a). Add sing() method in Bird class. We can do unit test for Solution class and make sure when sing() method is called, it prints “I am singing”. Also we can write JUNIT testcases and can use assertion for testing.
1b). The first method is not maintainable and also it is not optimized . So to solve this, we have to create an animal abstract class and can make sing() and fly() method as abstract. 

2). Create two subclass for bird : Duck and Chicken and make bird class as abstract. So that duck can fly, sing and swim and chicken can sing and not fly.

3). Rooster is a male chicken. We can add string gender and also appropriate constructors, getter and setter method. And depending on the gender, the sing() method will return cluck,cluck if it is female or cock-a-doodle-doo if it is male.

4). Create three subclass: Dog, Cat, Parrot and also telephone class. We can use instance of keyword to determine which animal does the parrot live with. Further to keep the parrot maintainable, we can use Object and directly pass any objects like duck or telephone.

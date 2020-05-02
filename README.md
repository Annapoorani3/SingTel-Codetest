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

Section B:

1). First we can create Land Animal and Aquatic Animal which extends Animal class. Then we can create fish and dolphin which extends Aquatic animal. And then shark and clownfish which extends fish. Clown fish have size and color properties. Shark has size, color and Fish object.
So that now clownfish can make jokes and sharks can eat other fishes.
Yes, We can model a dolphin without inheriting from Fish class. As we have Aquatic animal class, We can directly inherit dolphin from that class. As we have the swim method in aquatic animal class, the dolphin can also swim without getting inherited from fish class.

Section D:
1)	Create insects class which extends Animal and Butterfly class which extends Insects with the fly() method inside the class.
2)	Create caterpillar class which extends insects and a transform method into it so that a caterpillar can transform into a butterfly

Section E:
1)	Put all the classes together and implement Boolean for all the walk(), fly(), swim() and sing() method. And then create the array of all animals and use counter to count the number of animals that walk, swim, sing or fly.


package de.mayflower.java101;

public class Joke
{
   String type = "success";
   JokeValue value = new JokeValue();

   class JokeValue {
     int id = 85;
     String joke = "When Steven Seagal kills a ninja, he only takes its hide. When Chuck Norris kills a ninja, he uses every part.";
     String[] categories;
   }
}

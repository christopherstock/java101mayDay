package de.mayflower.java101;

import com.google.api.client.util.Key;

public class Joke
{
   @Key("type")
   String type;
   @Key("value")
   JokeValue value;

   public static class JokeValue {
     @Key("id")
     int id;
     @Key("joke")
     String joke;
     @Key("categories")
     String[] categories;
   }
}

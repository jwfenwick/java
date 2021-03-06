import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyDictionary {

    public class EnhancedHash extends HashMap {
      public void EnhAdd(String key, String value) {
      this.add(key, value);
      }

      public void EnhDel(String key, String Value) {
      this.delete(key);
      }

    }

  public static void main(String args[]){

    EnhancedHash<String,String> myDictionary = new EnhancedHash<String, String>();

    List<String> myList = new ArrayList<String>();

    myDictionary.put("one","uno");
    myDictionary.put("two","dos");
    myDictionary.put("three","tres");
    System.out.println(myDictionary.get("two"));

    myList.add("one");
    myList.add("two");
    myList.add("three");

    System.out.println(myDictionary.isEmpty());
    System.out.println(myDictionary.size());
    System.out.println(myDictionary.keySet());
    System.out.println(myDictionary.values());
    System.out.println(myDictionary.containsKey("one"));
    System.out.println(myDictionary.containsValue("uno"));

    for (int i=0; i<myList.size();i++){
      System.out.println(myList.get(i));
    }

    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(myList.size() );
    System.out.println(randomInt);
    System.out.println(myList.get(randomInt));

  }
}

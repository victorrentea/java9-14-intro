package victor.training;


import java.util.*;

public class Vars {

   public static void main(String[] args) {
      var map = Map.of(1, "unu", 2, "two");

      List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
      List<Integer> list2 = List.of(1, 2, 3); // immutable
      list2.add(1);

      var i = 1;
      var s = "a";

      var t = new Packet<String>();
      final var var = 1; // ~= val


      for (var entry : map.entrySet()) {

      }

      var stringListHashMap = new HashMap<String, List<String>>();

      Packet<String> packet = m(1);

   }

//   var j = 1;
   public static Packet<String> m(int x) {
       return new Packet<>();
   }
}

class Packet<T> {

}

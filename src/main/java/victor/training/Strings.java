package victor.training;

public class Strings {
   public static void main(String[] args) {
      String jude = """
          SELECT u.username
          FROM User u
          
          {
            "field":"data",
            "field":"%.2g"
          }
            
          Hey Jude, don't make it bad
          Take a sad song and make it better
          Remember to let her into your heart
          Then you can start to make it better""".formatted(12.5);
      System.out.println(jude);

      // \
      // .formatted %s
   }
}

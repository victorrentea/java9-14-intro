package victor.training;

public class Records {
   public static void main(String[] args) {
      System.out.println(new Interval(1, 3).intersects(new Interval(2, 4)));
   }

}

record Interval(int start, int end) {
   public Interval {
      if (start > end) {
         throw new IllegalArgumentException();
      }
   }

   public Interval(String startStr, int end) {
      this(Integer.parseInt(startStr), end);
   }

   public boolean intersects(Interval other) {
      return start() <= other.end() && other.start() <= end();
   }
}

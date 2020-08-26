package victor.training;

import java.util.Objects;

public class Records {
   public static void main(String[] args) {
      System.out.println(intervalsIntersect(new Interval(1, 3), new Interval(2, 4)));
   }

   public static boolean intervalsIntersect(Interval interval, Interval interval1) {
      return interval.start() <= interval1.end() && interval1.start() <= interval.end();
   }
}

class Interval {
   private final int start;
   private final int end;

   public Interval(int start, int end) {
      this.start = start;
      this.end = end;
   }

   public int start() {
      return start;
   }

   public int end() {
      return end;
   }

   @Override
   public String toString() {
      return "Interval{" +
             "start=" + start +
             ", end=" + end +
             '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Interval interval = (Interval) o;
      return start == interval.start &&
             end == interval.end;
   }

   @Override
   public int hashCode() {
      return Objects.hash(start, end);
   }
}

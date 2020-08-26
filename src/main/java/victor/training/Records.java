package victor.training;

public class Records {
   public static void main(String[] args) {
      System.out.println(intervalsIntersect(1, 3, 2, 4));
   }

   public static boolean intervalsIntersect(int start1, int end1, int start2, int end2) {
      return start1 <= end2 && start2 <= end1;
   }
}

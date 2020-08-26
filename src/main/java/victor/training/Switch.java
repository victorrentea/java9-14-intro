package victor.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Switch {
   private static final Logger log = LoggerFactory.getLogger(Switch.class);
   public static void main(String[] args) {
      System.out.println("VAT BG = " + getVAT(CountryCode.BG, 10, true));
      System.out.println("VAT BD = " + getVAT(CountryCode.MD, 20, false));

      auditMessage(MessageCode.CreateOrder);

   }

   private static double getVAT(CountryCode isoCode, double value, boolean tobacco) {
      /* TODO for MD return 15 + ... if tobacco==true */
      return switch (isoCode) {
         case BG -> 0;
         case US, MX -> 15 + .05 * value;
         case MD -> {
            if (tobacco) yield 15 + .02 * value;
            else yield 7 + .02 * value;
         }
//         default -> throw new IllegalArgumentException();
      };
   }

   public static void auditMessage(MessageCode messageCode) {
      switch (messageCode) {
         case CreateOrder:
            log.info("Order Created");
            break;

         case ViewOrder:
         case PrintOrder:
            log.info("Order Accessed");
            break;
         default: throw new IllegalArgumentException("unkown code : " +messageCode);
      }
   }
}

enum CountryCode {
   BG,US,MX,MD
//   ,HU
}
enum MessageCode {
   CreateOrder,
   ViewOrder,
   PrintOrder,
   ExportOrder
}

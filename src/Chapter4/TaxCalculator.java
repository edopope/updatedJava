package Chapter4;

import java.math.BigDecimal;

public class TaxCalculator {
  private static final BigDecimal MINIMUM_EARNINGS = BigDecimal.valueOf(30000);
  private static final double BASE_TAX_RATE = 0.15;
  private static final double ADDITIONAL_RATE = 0.20;



  public static BigDecimal calculateTax(Citizen citizen) {
    BigDecimal taxAmount = BigDecimal.ZERO;
       if (citizen.getEarnings().compareTo(MINIMUM_EARNINGS) < 1) {
      taxAmount = citizen.getEarnings().multiply(BigDecimal.valueOf(BASE_TAX_RATE));
    } else {
    BigDecimal minus = citizen.getEarnings().subtract(MINIMUM_EARNINGS);
      BigDecimal sum = minus.multiply(BigDecimal.valueOf(ADDITIONAL_RATE));
      BigDecimal salary = MINIMUM_EARNINGS.multiply(BigDecimal.valueOf(BASE_TAX_RATE));
    taxAmount = sum.add(salary );
    }
    return taxAmount;
  }
  public static BigDecimal calculate(double earnings){
    double taxAmount;
    if (earnings <= MINIMUM_EARNINGS.doubleValue()){
      taxAmount = earnings * MINIMUM_EARNINGS.doubleValue();
          }
    else{
      taxAmount = MINIMUM_EARNINGS.doubleValue() * BASE_TAX_RATE;
      double calcEarnings = earnings - BASE_TAX_RATE;
      taxAmount += calcEarnings * ADDITIONAL_RATE;
    }
    return BigDecimal.valueOf(taxAmount);
  }
}

//  public static BigDecimal calculateTaxes(Citizen citizen) {
//    BigDecimal taxAmount1 = BigDecimal.ZERO;
//    if (citizen.getEarnings().compareTo(MINIMUM_EARNINGS) < 1) {
//      taxAmount1 = citizen.getEarnings().multiply(BigDecimal.valueOf(ADDITIONAL_RATE));
//    }
//
//    return taxAmount1;
//  }
//}
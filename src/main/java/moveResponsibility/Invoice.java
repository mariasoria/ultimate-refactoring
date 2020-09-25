package moveResponsibility;

import java.math.BigDecimal;

public class Invoice {
    public BigDecimal grossAmount;
    public BigDecimal taxPercentage;
    public int numberOfItems;

    public String calculateNetAmount(String amount, String tax){
        this.grossAmount = new BigDecimal(amount); // feature envy
        this.taxPercentage = new BigDecimal(tax);
        return this.grossAmount.subtract( // tell don't ask / law of demeter
                this.grossAmount.multiply(
                        this.taxPercentage.divide(
                                new BigDecimal("100")
                        )))
                .toString();
    }
}

package seminars.first.Homework;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import seminars.first.Calculator.Calculator;
public class CalculatorTest {

    @Test
    public void testCalculateDiscountValidInput() {
        double purchaseAmount = 100.0;
        int discountAmount = 20;
        double expectedDiscountedAmount = 80.0;
        double actualDiscountedAmount = Calculator.calculateDiscount(purchaseAmount, discountAmount);
        Assertions.assertThat(actualDiscountedAmount).isEqualTo(expectedDiscountedAmount);
    }

    @Test
    public void testCalculateDiscountZeroDiscount() {
        double purchaseAmount = 100.0;
        int discountAmount = 0;
        double actualDiscountedAmount = Calculator.calculateDiscount(purchaseAmount, discountAmount);
        Assertions.assertThat(actualDiscountedAmount).isEqualTo(purchaseAmount);
    }

    @Test
    public void testCalculateDiscountNegativePurchaseAmount() {
        double purchaseAmount = -100.0;
        int discountAmount = 20;
        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class);
    }

    @Test
    public void testCalculateDiscountNegativeDiscountAmount() {
        double purchaseAmount = 100.0;
        int discountAmount = -20;
        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(purchaseAmount, discountAmount))
                .isInstanceOf(ArithmeticException.class);
    }
}

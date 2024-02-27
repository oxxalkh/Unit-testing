package seminars.fourth.card;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


/**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */




class PaymentFormTest {
    PaymentFormTest() {
    }

    @Test
    public void testPaymentForm() {
        CreditCard mockCreditCard = mock(CreditCard.class);
        Mockito.when(mockCreditCard.getCardNumber()).thenReturn("1234567812345678");
        Mockito.when(mockCreditCard.getCardHolder()).thenReturn("Test User");
        Mockito.when(mockCreditCard.getExpiryDate()).thenReturn("01/23");
        Mockito.when(mockCreditCard.getCvv()).thenReturn("123");
        PaymentForm paymentForm = new PaymentForm(mockCreditCard);
        paymentForm.pay(100.0);
        ((CreditCard) verify(mockCreditCard, Mockito.times(1))).charge(100.0);
    }
    @Test
    void creditTest() {
        CreditCard creditCard = mock(CreditCard.class);
        PaymentForm paymentForm = new PaymentForm(creditCard);

        paymentForm.pay(22);

        verify(creditCard).charge(22);
    }
}


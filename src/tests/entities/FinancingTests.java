package tests.entities;

import entities.Financing;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.factory.FinancingFactory;

public class FinancingTests {


    @Test
    public void construtorShouldCreateNewDadosWhenValidData(){
        double totalAmount = 100000.0;
        double income = 2000.0;
        int months = 80;

        Financing f = FinancingFactory.creataFinancing(totalAmount,income,months);
        Assertions.assertEquals(totalAmount, f.getTotalAmount());
        Assertions.assertEquals(income, f.getIncome());
        Assertions.assertEquals(months, f.getMonths());
    }

    @Test
    public void construtorShouldIllegalArgumentExceptionWhenInvalidData(){
        double totalAmount = 100000.0;
        double income = 2000.0;
        int months = 20;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = FinancingFactory.creataFinancing(totalAmount,income,months);
        });
    }

    @Test
    public void setTotalAmountShouldSetDataWhenValidData(){
        double totalAmount = 100000.0;
        double income = 2000.0;
        int months = 80;
        Financing f = FinancingFactory.creataFinancing(totalAmount,income,months);
        f.setTotalAmount(90000.0);
        Assertions.assertEquals(90000.0, f.getTotalAmount());
        Assertions.assertEquals(income, f.getIncome());
        Assertions.assertEquals(months, f.getMonths());
    }

    @Test
    public void setTotalAmountShouldIllegalArgumentExceptionWhenInvalidData(){
        double totalAmount = 100000.0;
        double income = 2000.0;
        int months = 80;
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = FinancingFactory.creataFinancing(totalAmount,income,months);
            f.setTotalAmount(110000.0);
        });
    }


    @Test
    public void setIncomeShouldSetDataWhenValidData(){
        double totalAmount = 100000.0;
        double income = 2000.0;
        int months = 80;
        Financing f = FinancingFactory.creataFinancing(totalAmount,income,months);
        f.setIncome(4000.00);
        Assertions.assertEquals(4000.00, f.getIncome());

    }

    @Test
    public void setIncomeShouldIllegalArgumentExceptionWhenInvalidData(){
        double totalAmount = 100000.0;
        double income = 2000.0;
        int months = 80;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = FinancingFactory.creataFinancing(totalAmount,income,months);
            f.setIncome(100.00);
        });
    }

    @Test
    public void setMonthsShouldSetDataWhenValidData(){
        double totalAmount = 100000.0;
        double income = 2000.0;
        int months = 80;
        Financing f = FinancingFactory.creataFinancing(totalAmount,income,months);
        f.setMonths(90);
        Assertions.assertEquals(90, f.getMonths());
    }

    @Test
    public void setMonthsShouldIllegalArgumentExceptionWhenInvalidData(){
        double totalAmount = 100000.0;
        double income = 2000.0;
        int months = 80;

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f = FinancingFactory.creataFinancing(totalAmount,income,months);
            f.setMonths(10);
        });
    }

    @Test
    public void entryShouldCalculateEntryCorrectly(){
        double totalAmount = 100000.0;
        double income = 2000.0;
        int months = 80;
        Financing f = FinancingFactory.creataFinancing(totalAmount,income,months);

        Assertions.assertEquals(20000.0,f.entry());
    }

    @Test
    public void quotaShouldCalculateQuotaCorrectly(){
        double totalAmount = 100000.0;
        double income = 2000.0;
        int months = 80;
        Financing f = FinancingFactory.creataFinancing(totalAmount,income,months);
        Assertions.assertEquals(1000.0,f.quota());
    }



}

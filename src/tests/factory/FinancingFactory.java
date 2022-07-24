package tests.factory;

import entities.Financing;

public class FinancingFactory {

    public static Financing creataFinancing(double totalAmont, double income, int months) { return new Financing(totalAmont, income, months);}

}

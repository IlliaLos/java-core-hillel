package org.example.homework4;

public class ProductCostCalculator {
    public static void main(String[] args) {
        // price of the product
        double unitPrice = 10.0;
        // Quantity
        int quantity = 55;

        double totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total cost of the product: " + totalCost);
    }

    private static double calculateTotalCost(double unitPrice, int quantity) {
        double totalCost;
        double discount;

        if (quantity > 80)
            discount = 0.87;
        else if (quantity > 30) {
            double addDiscount = (quantity - 30) / 10 * 0.004;
            discount = 0.88 - addDiscount;
        } else if (quantity > 20)
            discount = 0.90;
        else if (quantity > 10)
            discount = 0.95;
        else discount = 1;

        totalCost = unitPrice *quantity * discount;
        return totalCost;
    }
}

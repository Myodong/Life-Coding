
public class AccountingMethodApp {

	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;

	public static void main(String[] args) {
		
		valueOfSupply =10000.0;
        vatRate = 0.1;
        expenseRate = 0.3;
        double vat = getVAT();
        double total = getTotal();
        double expense = getExpense();
        double income = valueOfSupply - expense;
        double dividend1 = income * 0.5;
        double dividend2 = income * 0.3;
        double dividend3 = income * 0.2;
 
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);
	}

	private static double getExpense() {
		double expense = valueOfSupply * expenseRate;
		return expense;
	}

	private static double getTotal() {
		double total = valueOfSupply + getVAT();
		return total;
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;
	}

}

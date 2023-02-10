
public class AccountingArrayApp {

	public static void main(String[] args) {
		
		
		double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        
        double rate1 = income * 0.5;
        double rate2 = income * 0.3;
        double rate3 = income * 0.2;
        
        double dividend1 = income * rate1;
        double dividend2 = income * rate2;
        double dividend3 = income * rate3;
 
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
        System.out.println("Dividend 1 : " + dividend1);
        System.out.println("Dividend 2 : " + dividend2);
        System.out.println("Dividend 3 : " + dividend3);
	}

}

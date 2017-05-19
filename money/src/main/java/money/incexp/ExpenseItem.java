package money.incexp;

//"статья расходов"
public class ExpenseItem extends Item{
	String typeOfExpense;		//тип расхода
	String whereBuy;			//где купил
	
	//создать "статью расходов"
	ExpenseItem(String date, double amount, String comment, String typeOfExpense, String whereBuy) {
		super(date, amount, comment);
		this.typeOfExpense = typeOfExpense;
		this.whereBuy = whereBuy;
	}
	
	//изменить данные "статьи расходов"
	public void setExpenseItem(String date, double amount, String comment, String typeOfExpense, String whereBuy) {
		super.date = date;
		super.amount = amount;
		super.comment = comment;		
		this.typeOfExpense = typeOfExpense;		
		this.whereBuy = whereBuy;
	}
	
	//Получить значения полей
	public String getDate() {
		return date;		
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String getComment() {
		return comment;
	}
	
	public String getTypeOfExpense () {
		return typeOfExpense;
	}
	
	public String getWhere() {
		return whereBuy;
	}
}

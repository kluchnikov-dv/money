package money.incexp;

//"статья расходов"
public class ExpenseItem extends Item{
	private String typeOfExpense;																		//тип расхода
	private String whereBuy;																			//где купил	
	private static String fields[] = {"ДАТА", "СУММА", "КОММЕНТАРИЙ", "ВИД РАСХОДА", "МЕСТО ПОКУПКИ"};		//поля
	
	ExpenseItem() {
		super();
		typeOfExpense = null;
		whereBuy = null;
	}
	
	//создать "статью расходов"
	ExpenseItem(String date, double amount, String comment, String typeOfExpense, String whereBuy) {
		super(date, amount, comment);
		this.typeOfExpense = typeOfExpense;
		this.whereBuy = whereBuy;
	}
	
	//изменить данные "статьи расходов"
	public void setExpenseItem(String date, double amount, String comment, String typeOfExpense, String whereBuy) {
		setItem(date, amount, comment);		
		this.typeOfExpense = typeOfExpense;		
		this.whereBuy = whereBuy;
	}
	
	public String getTypeOfExpense () {
		return typeOfExpense;
	}
	
	public String getWhere() {
		return whereBuy;
	}
	
	public static String[] getFields() {
		return fields;
	}
}

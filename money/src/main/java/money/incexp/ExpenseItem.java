package money.incexp;

interface IExpenseItemFields {
	final  static String fields[] = {"ДАТА", "СУММА", "КОММЕНТАРИЙ", "ВИД РАСХОДА", "МЕСТО ПОКУПКИ"};	//поля
	final  static int minWidth[] = {100, 100, 400, 200, 200};											//минимальная ширина поля
	
}

//"статья расходов"
public class ExpenseItem extends Item implements IExpenseItemFields{
	private String typeOfExpense;																		//тип расхода
	private String whereBuy;																			//где купил	
	
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
		
}

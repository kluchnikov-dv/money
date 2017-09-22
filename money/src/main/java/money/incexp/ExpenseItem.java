package money.incexp;

//"статья расходов"
public class ExpenseItem extends Item {
	public String[] fieldsName = new String[] {"ДАТА", "СУММА", "КОМЕНТАРИЙ", "ВИД РАСХОДА", "ГДЕ КУПИЛ"};		
	public String[] fields = new String[] {"date", "amount", "comment", "typeOfExpense", "whereBuy"};
	public int[] minWidth = new int[] {150, 100, 400, 200, 200};	
	private String typeOfExpense;																		//тип расхода
	private String whereBuy;																			//где купил	
	
	ExpenseItem() {
		super();
		typeOfExpense = null;
		whereBuy = null;
	}
	
	//создать "статью расходов"
	ExpenseItem(String date, String amount, String comment, String typeOfExpense, String whereBuy) {
		super(date, amount, comment);
		this.typeOfExpense = typeOfExpense;
		this.whereBuy = whereBuy;
	}
	
	//изменить данные "статьи расходов"
	public void setExpenseItem(String date, String amount, String comment, String typeOfExpense, String whereBuy) {
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

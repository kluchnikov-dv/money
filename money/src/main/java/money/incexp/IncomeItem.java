package money.incexp;

interface IIncomeItemFields {
	static final String fields[] = {"ДАТА", "СУММА", "КОММЕНТАРИЙ", "ВИД ДОХОДА"};	//поля
	static final int  minWidth[] = {100, 100, 400, 200};							//минимальная ширина поля
}

//"статья доходов"
public class IncomeItem extends Item implements IIncomeItemFields {
	private String typeOfIncome;														//тип дохода		
	
	IncomeItem() {
		super();
		typeOfIncome = null;
	}
	
	//создать "статью доходов"
	IncomeItem(String date, double amount, String comment, String typeOfIncome) {
		super(date, amount, comment);
		this.typeOfIncome = typeOfIncome;
	}
	
	//изменить данные "статьи доходов"
	public void setIncomeItem(String date, double amount, String comment, String typeOfIncome) {
		setItem(date, amount, comment);
		this.typeOfIncome = typeOfIncome;
	}
		
	public String getTypeOfIncome() {
		return typeOfIncome;	
	}
	
}

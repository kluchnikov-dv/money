package money.incexp;

//"статья доходов"
public class IncomeItem extends Item {
	private String typeOfIncome;														//тип дохода	
	private static String fields[] = {"ДАТА", "СУММА", "КОММЕНТАРИЙ", "ВИД ДОХОДА"};	//поля 
	
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
	
	public static String[] getFields() {
		return fields;
	}
}

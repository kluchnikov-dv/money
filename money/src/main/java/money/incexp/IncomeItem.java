package money.incexp;
//"статья доходов"
public class IncomeItem extends Item {
	public String[] fieldsName = new String[] {"ДАТА", "СУММА", "КОМЕНТАРИЙ", "ВИД ДОХОДА"};		
	public String[] fields = new String[] {"date", "amount", "comment", "typeOfIncome"};
	public int[] minWidth = new int[] {150, 100, 400, 200};
	
	private String typeOfIncome;														//тип дохода				
	
	IncomeItem() {
		super();
		typeOfIncome = null;
	}
	
	//создать "статью доходов"
	IncomeItem(String date, String amount, String comment, String typeOfIncome) {
		super(date, amount, comment);
		this.typeOfIncome = typeOfIncome;
	}
	
	//изменить данные "статьи доходов"
	public void setIncomeItem(String date, String amount, String comment, String typeOfIncome) {
		setItem(date, amount, comment);
		this.typeOfIncome = typeOfIncome;
	}
		
	public String getTypeOfIncome() {
		return typeOfIncome;	
	}
	
}

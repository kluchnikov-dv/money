package money.incexp;

//"статья доходов"
public class IncomeItem extends Item {
	String typeOfIncome;		//тип дохода
	
	//создать "статью доходов"
	IncomeItem(String date, double amount, String comment, String typeOfIncome) {
		super(date, amount, comment);
		this.typeOfIncome = typeOfIncome;
	}
	
	//изменить данные "статьи доходов"
	public void setIncomeItem(String date, double amount, String comment, String typeOfIncome) {
		super.date = date;
		super.amount = amount;
		super.comment = comment;
		this.typeOfIncome = typeOfIncome;
	}
	
	//получить значения полей
	public String getDate() {
		return date;		
	}
	
	public double getAmount() {
		return amount;
	}	
	
	public String getComment() {
		return comment;
	}
	
	public String getTypeOfIncome() {
		return typeOfIncome;
	}
}

package money.incexp;


//абстрактный класс "Статья"
public abstract class Item {
	private String date; 													//дата
	private double amount;													//сумма	
	private String comment;													//коментарий				
	
	Item() {
		date = null;
		amount = 0;
		comment = null;		
	}
	
	//создать статью
	Item(String date, double amount, String comment) {
		this.date = date;
		this.amount = amount;		
		this.comment = comment;		
	}	
	
	public void setItem (String date, double amount, String comment) {
		this.date = date;
		this.amount = amount;		
		this.comment = comment;
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
}
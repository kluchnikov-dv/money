package money.incexp;


//абстрактный класс "Статья"
public abstract class Item extends WorkDB{
	private String date; 													//дата
	private String amount;													//сумма	
	private String comment;													//коментарий					
	
	Item() {
		date = null;
		amount = null;
		comment = null;		
	}
	
	//создать статью
	Item(String date, String amount, String comment) {
		this.date = date;
		this.amount = amount;		
		this.comment = comment;		
	}
	
	public void setItem (String date, String amount, String comment) {
		this.date = date;
		this.amount = amount;		
		this.comment = comment;
	}
	
	//получить значения полей
	public String getDate() {
		return date;		
	}
	
	public String getAmount() {
		return amount;
	}	
	
	public String getComment() {
		return comment;
	}	
}
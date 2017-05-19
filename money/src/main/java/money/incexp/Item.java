package money.incexp;

//абстрактный класс "Статья"
public abstract class Item {
	String date; 				//дата
	double amount;				//сумма	
	String comment;				//коментарий		
	
	//создать статью
	Item(String date, double amount, String comment) {
		this.date = date;
		this.amount = amount;		
		this.comment = comment;		
	}	
}

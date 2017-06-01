package money.incexp;

import javafx.scene.layout.*;	//корневой узел
import javafx.scene.control.*;	//кнопки

public class MoneyTableView {	
	private IncomeItem incomeItem;
	private ExpenseItem expenseItem;
	
	private TableView tableViewIncome = new TableView();											//создать таблицу для доходов
	private TableView tableViewExpense = new TableView();											//создать таблицу для расходов
	
	MoneyTableView() {
		//создать колонки
		for (int i = 0; i < incomeItem.getFields().length; i++) {
			tableViewIncome.getColumns().add(new TableColumn(incomeItem.getFields()[i]));								
		}
		
		for (int i = 0; i < expenseItem.getFields().length; i++) {
			tableViewExpense.getColumns().add(new TableColumn(expenseItem.getFields()[i]));	
		}
		
	}	
	
	TableView getTableViewByName(String nameTableView) {
		if (nameTableView == "tableViewIncome") 
			return tableViewIncome;
		if (nameTableView == "tableViewExpense") 
			return tableViewExpense;
		return null;
	}
	
}

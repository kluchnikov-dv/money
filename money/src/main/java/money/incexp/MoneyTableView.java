package money.incexp;

import javafx.scene.layout.*;	//корневой узел
import javafx.scene.control.*;	//кнопки

public class MoneyTableView {	
	private IncomeItem incomeItem;
	private ExpenseItem expenseItem;
	
	private TableView tableViewIncome = new TableView();							//создать таблицу для доходов
	private TableView tableViewExpense = new TableView();							//создать таблицу для расходов
	
	MoneyTableView() {
		TableColumn temp;
		//создать колонки
		for (int i = 0; i < incomeItem.fields.length; i++) {			
			temp = new TableColumn(incomeItem.fields[i]);							//создать колонку с именем из incomeItem.Fields[i]			
			temp.setMinWidth(incomeItem.minWidth[i]);								//присвоить минимальную ширину колонке							
			tableViewIncome.getColumns().add(temp);									//добавить колонку в таблицу
		}
		
		for (int i = 0; i < expenseItem.fields.length; i++) {
			temp = new TableColumn(expenseItem.fields[i]);
			temp.setMinWidth(expenseItem.minWidth[i]);
			tableViewExpense.getColumns().add(temp);	
		}
		
	}	
	
	TableView getTableViewIncome() {		 
			return tableViewIncome;		
	}
	
	TableView getTableViewExpense() {
		return tableViewExpense;
	}
	
}

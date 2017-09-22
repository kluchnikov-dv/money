package money.incexp;

import javafx.scene.layout.*;	//корневой узел
import javafx.scene.control.*;	//кнопки
import javafx.scene.control.cell.PropertyValueFactory;

public class MoneyTableView {	
	private IncomeItem incomeItem = new IncomeItem();
	private ExpenseItem expenseItem = new ExpenseItem();
	
	private TableView<IncomeItem> tableViewIncome = new TableView();							//создать таблицу для доходов
	private TableView<ExpenseItem> tableViewExpense = new TableView();							//создать таблицу для расходов
	
	MoneyTableView() {
		
		
		for(int i = 0; i < incomeItem.fields.length; i++) {
			//создать одну из колонок таблицы доходов
			TableColumn<IncomeItem, String> temp = new TableColumn(incomeItem.fieldsName[i]);
			//задать минимальную ширину колонки
			temp.setMinWidth(incomeItem.minWidth[i]);
			//свзяать колонку с полем класса incomeItem
			temp.setCellValueFactory(new PropertyValueFactory(incomeItem.fields[i]));
			//добавить колонку в таблицу
			tableViewIncome.getColumns().add(temp);

		}
		//загрузить данные в таблицу доходов
		incomeItem.ConnectToDB();
		tableViewIncome.setItems(incomeItem.getIncomeItemList());
		incomeItem.DisconnectDB();
		
		
		for(int i = 0; i < expenseItem.fields.length; i++) {
			//создать одну из колонок таблицы расходов
			TableColumn<ExpenseItem, String> temp = new TableColumn(expenseItem.fieldsName[i]);
			//задать минимальную ширину колонки
			temp.setMinWidth(expenseItem.minWidth[i]);
			//свзяать колонку с полем класса expenseItem
			temp.setCellValueFactory(new PropertyValueFactory(expenseItem.fields[i]));
			//добавить колонку в таблицу
			tableViewExpense.getColumns().add(temp);
			//expenseItem.DisconnectDB();
		}
		expenseItem.ConnectToDB();
		//загрузить данные в таблицу доходов
		tableViewExpense.setItems(expenseItem.getExpenseItemList());		
		expenseItem.DisconnectDB();
	}	
	
	TableView getTableViewIncome() {		 
			return tableViewIncome;		
	}
	
	TableView getTableViewExpense() {
		return tableViewExpense;
	}
	
}

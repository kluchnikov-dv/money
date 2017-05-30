package money.incexp;

import javafx.scene.layout.*;	//корневой узел
import javafx.scene.control.*;	//кнопки

public class MoneyTableView {
	
	private TableView tableView = new TableView();								//создать таблицу
	//private TableColumn tableColumns[];										//колонки
	
	MoneyTableView(String ...tableColumns) {									//создать колонки, перечислив их названия в качестве строковых параметров 
		//this.tableColumns = new TableColumn[tableColumns.length];							
		
		for(int i = 0; i < tableColumns.length; i++) {
			//this.tableColumns[i] = new TableColumn(tableColumns[i]);
			 tableView.getColumns().add(new TableColumn(tableColumns[i]));		//добавить колонки в таблицу this.tableColumns[i]
		}		
	}
	
	TableView getTableView() {
		return tableView;
	}
	
}

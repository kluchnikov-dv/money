package money.incexp;


import javafx.stage.*;			//подмосток
import javafx.scene.layout.*;	//корневой узел
import javafx.scene.control.*;	//кнопки
import javafx.event.*;			//обработчик события 


public class MoneyMenu {
	private MenuBar menuBar = new MenuBar();														//создать строку меню-бар
	//private WorkDB workDB;																			//работа с БД
	
	MoneyMenu() {		
		Menu menuFile = new Menu("Файл");														//создать меню "Файл"
		MenuItem menuItemConnectDB = new MenuItem("Подключить БД");									//создать подменю
		MenuItem menuItemExit = new MenuItem("Выход");									
		menuFile.getItems().addAll(menuItemConnectDB, new SeparatorMenuItem(), menuItemExit);		//добавить подменю в меню
		
		Menu menuHelp = new Menu("Справка");
		MenuItem menuItemHelp = new MenuItem("Справка money");
		MenuItem menuItemAbout = new MenuItem("О программе");
		menuHelp.getItems().addAll(menuItemHelp, new SeparatorMenuItem(), menuItemAbout);
		
		menuBar.getMenus().addAll(menuFile, menuHelp);											//добавить меню в меню-бар
		
		//обработчик события меню  "Выход"
		menuItemExit.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae) {
				money.getPrimaryStage().close();
				//Закрыть соединение с БД
				
			}
		});  
		
		//обработчик события меню "Подключить БД"
		menuItemConnectDB.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae) {
				//соединяем БД PostgreSQL			
				//workDB = new WorkDB();				
			}
		});
	}
	
	MenuBar getMenuBar() {
		return menuBar;
	}
	
		
}

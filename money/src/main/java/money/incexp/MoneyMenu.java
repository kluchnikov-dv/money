package money.incexp;


import javafx.stage.*;			//подмосток
import javafx.scene.layout.*;	//корневой узел
import javafx.scene.control.*;	//кнопки
import javafx.event.*;			//обработчик события 


public class MoneyMenu {
	private MenuBar menuBar = new MenuBar();														//создать строку меню-бар
	
	MoneyMenu() {		
		Menu menuFile = new Menu("Файл");														//создать меню "Файл"
		MenuItem menuItemOpenDB = new MenuItem("Открыть БД");									//создать подменю
		MenuItem menuItemExit = new MenuItem("Выход");									
		menuFile.getItems().addAll(menuItemOpenDB, new SeparatorMenuItem(), menuItemExit);		//добавить подменю в меню
		
		Menu menuHelp = new Menu("Справка");
		MenuItem menuItemHelp = new MenuItem("Справка money");
		MenuItem menuItemAbout = new MenuItem("О программе");
		menuHelp.getItems().addAll(menuItemHelp, new SeparatorMenuItem(), menuItemAbout);
		
		menuBar.getMenus().addAll(menuFile, menuHelp);											//добавить меню в меню-бар
		
		//обработчик события меню  "Выход"
		menuItemExit.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent ae) {
				money.getPrimaryStage().close();
			}
		});  
	}
	
	MenuBar getMenuBar() {
		return menuBar;
	}
	
		
}

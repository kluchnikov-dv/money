package money.incexp;

import javafx.application.*;	//javafx класс
import javafx.stage.*;			//подмосток
import javafx.scene.*;			//сцена
import javafx.scene.layout.*;	//корневой узел
import javafx.scene.control.*;	//кнопки
import javafx.event.*;			//обработчик события 
import javafx.geometry.*;		//
import javafx.beans.value.*;


public class money extends Application 
{		
	
	//этот метод можно пропустить
    public static void main( String[] args )
    {
        //запустить JavaFX-приложение
        launch(args);
    }    
    
    //переопределить метод start()
    public void start(Stage getStage) {
    	Stage primaryStage = getStage;
    	primaryStage.setTitle("money");	    													//задаем заголовок подмостка    	    	
    	BorderPane rootNode = new BorderPane();													//создаем корневой узел - панель граничной компановки    	
    	primaryStage.setScene(new Scene(rootNode, 1280, 1024));									//Создаем сцену и устанавливаем сцену на подмосток
    	
    	rootNode.setTop(new MoneyMenu(primaryStage).getMenuBar());								//создать меню    и разместить в корневом узле сверху    	
    	rootNode.setLeft(new MoneyTree("деньги", "доходы", "расходы").getTreeView());			//создать дерево  и разместить в корневом узле слева
    	
    	rootNode.setCenter(new MoneyTableView("дата", "сумма", "коментарий").getTableView());	//создать таблицу и разместить в корневом узле по центру
    	
    	primaryStage.show();																	//Показываем подмосток с размещеной на нем сценой
    }   
    
}

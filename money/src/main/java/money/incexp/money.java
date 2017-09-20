package money.incexp;

import javafx.application.*;	//javafx класс
import javafx.stage.*;			//подмосток
import javafx.scene.*;			//сцена
import javafx.scene.layout.*;	//корневой узел
import javafx.scene.control.*;	//кнопки
import javafx.event.*;			//обработчик события 
import javafx.geometry.*;		//
import javafx.beans.value.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class money extends Application 
{		
	private static Stage primaryStage;															//подмостк
	private static BorderPane rootNode;															//корневой узел - панель граничной компановки
	private static MoneyTableView moneyTableView;												//таблица
	private MoneyMenu moneyMenu;																//меню
	private MoneyTree moneyTree;																//дерево	
		
    public static void main( String[] args )
    {    
        launch(args);																			//запустить JavaFX-приложение
    }    
    
    //переопределить метод start()
    public void start(Stage getStage) {
    	
    	rootNode = new BorderPane();
    	
    	primaryStage = getStage;
    	primaryStage.setTitle("money");	    													    	    	    	    	
    	primaryStage.setScene(new Scene(rootNode, 1280, 1024));									//Создаем сцену и устанавливаем сцену на подмосток
    	
    	moneyMenu = new MoneyMenu();												
    	rootNode.setTop(moneyMenu.getMenuBar());											    //разместить меню в корневом узле сверху
    	
    	
    	moneyTree = new MoneyTree("ДЕНЬГИ", "ДОХОДЫ", "РАСХОДЫ");								
    	rootNode.setLeft(moneyTree.getTreeView());												//разместить дерево в корневом узле слева
    	moneyTree.expandTreeItems();															//раскрыть все узлы
    	    	
    	moneyTableView = new MoneyTableView();													//создать таблицы 

    	primaryStage.show();																	//Показываем подмосток с размещеной на нем сценой
    }       
    
    public static Stage getPrimaryStage() {
    	return primaryStage;
    }
    
    public static BorderPane getRootNode() {
    	return rootNode;
    }         
    
    public static MoneyTableView getMoneyTableView() {
    	return moneyTableView;
    }
}

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
	//создаем кнопки
	ToggleButton incomeToggleButton = new ToggleButton("  Доходы  ");	
	ToggleButton expenseToggleButton = new ToggleButton(" Расходы  ");
	Button exitButton = new Button("  Выход   ");
	
	//этот метод можно пропустить
    public static void main( String[] args )
    {
        //запустить JavaFX-приложение
        launch(args);
    }
   
    //переопределить метод start()
    public void start(final Stage primaryStage) {    
    	primaryStage.setTitle("money");	    						//задаем заголовок подмостка    	    	
    	FlowPane rootNode = new FlowPane(10, 10);					//создаем корневой узел - панель поточной компановки    	
    	rootNode.setAlignment(Pos.TOP_CENTER);						//Выровнять все элементы по центру слева
    	primaryStage.setScene(new Scene(rootNode, 1500, 1000));		//Создаем сцену и устанавливаем сцену на подмосток
    	
    	
    	TreeItem<String> itemRoot = new TreeItem<String>("деньги");
    	TreeItem<String> itemIncome = new TreeItem<String>("доходы");
    	TreeItem<String> itemExpense = new TreeItem<String>("расходы");
    	TreeView<String> tvRoot = new TreeView<String>(itemRoot);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	    	
    	incomeToggleButton.setOnAction(new EventHandler<ActionEvent>() {								//обработчик события кнопки "Доходы"
    		public void handle(ActionEvent ae) {														//зарегестрировать обработчик события для конкретной кнопки, при помощи setOnAction    			
    			 if (incomeToggleButton.isSelected()) expenseToggleButton.setSelected(false);			//создать анонимный внутренний класс на основе интерфейса EventHandler	 	    	
    		}																							//реализовать единственный метод handle для обработки события
    	});
    	

    	expenseToggleButton.setOnAction(new EventHandler<ActionEvent>() {								//обработчик события кнопки "Расходы"
    		public void handle(ActionEvent ae) {
    			 if (expenseToggleButton.isSelected()) incomeToggleButton.setSelected(false); 			    	    	
    		}
    	});
    	    	
    	exitButton.setOnAction(new EventHandler<ActionEvent>() {										//обработчик события кнопки "Выход"
    		public void handle(ActionEvent ae) {
    			primaryStage.close();
    		}
    	});
    	
    	rootNode.getChildren().addAll(incomeToggleButton, expenseToggleButton, exitButton);				//ввести элементы (кнопки) в (корневой узел - граф) сцены    	
    	primaryStage.show();																			//Показываем подмосток и сцену
    }   
    
}

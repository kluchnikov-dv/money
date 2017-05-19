package money.incexp;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;  //корневой узел
import javafx.scene.control.*; //кнопки
import javafx.event.*;
import javafx.geometry.*;
//import javafx.beans.*;
//для рисования
import javafx.scene.shape.*;
import javafx.scene.canvas.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;

public class money extends Application 
{	
	//создаем кнопки
	Button incomeButton = new Button(" Доходы ");
	Button expenseButton = new Button(" Расходы ");
	Button exitButton = new Button("Выход");
	
	//графический контекст
	GraphicsContext gc;	
	
	//этот метод можно пропустить
    public static void main( String[] args )
    {
        //запустить JavaFX-рпиложение, вызвав метод launch();
        launch(args); //можно передать любой строковый параметр или вообще не передавать
    }
    
    /* init и stop
    //переопределить метод init(), не обязательно
    public void init() {
    	System.out.println("В теле метода init().");
    }
  
    //переопределить метод stop()
    public void stop() {
    	System.out.println("В теле метода stop().");
    }
    */
    //переопределить метод start()
    public void start(final Stage incexpStage) {    
    	
    	//задаем заголовок подмостка
    	incexpStage.setTitle("money");
    	
    	//создаем корневой узел
    	//Панель поточной компановки
    	//Установить промежутки между компановочными элементами по горизонтали и вертикали  = 10
    	FlowPane rootNode = new FlowPane(10, 10);
    	//Выровнять все элементы по центру слева
    	rootNode.setAlignment(Pos.TOP_CENTER);    	
    	
    	//Создаем сцену и устанавливаем сцену на подмосток
    	incexpStage.setScene(new Scene(rootNode, 1500, 1000));
    	
    	
    	
    	
    	//обработчик события кнопки "Доходы"
    	//зарегестрировать обработчик события для конкретной кнопки, при помощи setOnAction
    	//создать анонимный внутренний класс на основе интерфейса EventHandler 
    	//реализовать единственный метод handle для обработки события
    	incomeButton.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent ae) {    	    	
    	    	    	    	
    		}
    	});
    	
    	//обработчик события кнопки "Расходы"
    	expenseButton.setOnAction(new EventHandler<ActionEvent>() {
    			public void handle(ActionEvent ae) {

    			}
    		}
    	);
    	
    	exitButton.setOnAction(new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent ae) {
    			incexpStage.close();
    		}
    	});
    	
    	//Создать холст
    	Canvas canvas = new Canvas(400, 400);
    	//Получить графический контекст для холста
    	gc = canvas.getGraphicsContext2D();
    	
    	gc.strokeRect(0, 0, 400, 400);		//рисуем границы холста
    	gc.strokeOval(100, 100, 200, 200);	//рисуем круг
    	
    	gc.setStroke(Color.RED);    	    	    	    	
    	gc.strokeLine(100, 100, 200, 200);	//рисуем линию
    	
    	
    	//ввести элементы (кнопки) в (корневой узел - граф) сцены
    	rootNode.getChildren().addAll(incomeButton, expenseButton, exitButton, canvas);
    	//rootNode.getChildren().add(incomeButton);
    	//rootNode.getChildren().add(expenseButton);
    	
    	//Показываем подмосток и сцену
    	incexpStage.show();
    	
    }
    
    
}

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
	private Stage primaryStage;
	private BorderPane rootNode;
	private String selected; 
		
	//этот метод можно пропустить
    public static void main( String[] args )
    {
        //запустить JavaFX-приложение
        launch(args);
    }    
    
    //создание меню
    private void initMenu() {
    	MenuBar menuBar = new MenuBar();														//создать строку меню-бар   	
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
    			primaryStage.close();
    		}
    	});  
    	
    	rootNode.setTop(menuBar);
    }
    
    //создание дерева пунктов
    public void initTree() {
    	TreeItem<String> treeItemRoot = new TreeItem<String>("деньги");							//создать корневой узел
    	TreeItem<String> treeItemIncome = new TreeItem<String>("доходы");						//создать дочерний узел
    	TreeItem<String> treeItemExpense = new TreeItem<String>("расходы");		
    	treeItemRoot.getChildren().addAll(treeItemIncome, treeItemExpense);						//ввести дочерний узел в корневой    	
    	TreeView<String> treeViewRoot = new TreeView<String>(treeItemRoot);						//создать древовидное представление используя построенное дерево
    	treeItemRoot.setExpanded(true);
    	
    	//обработчик дерева пунктов
    	MultipleSelectionModel <TreeItem<String>> treeViewMultipleSelectionModel = treeViewRoot.getSelectionModel();	//получить модель выбора для древовидного представления
    	    	    	
    	treeViewMultipleSelectionModel.selectedItemProperty().addListener(												//Использовать приёмник событий изменения, чтобы оперативно 
    			new ChangeListener<TreeItem<String>>() {																//реагировать на выбор элементов в древовидном представлении
    				public void changed(ObservableValue<? extends TreeItem<String>> changed, TreeItem<String> oldVal, TreeItem<String> newVal){
    					if (newVal != null) selected = newVal.getValue();
    				}
    			}
    	);
    	rootNode.setLeft(treeViewRoot);
    }
    
    //данные dataGrid
    public void initDataGrid() {
    	TableView tableViewData = new TableView();
    	tableViewData.setEditable(true);
    	TableColumn data = new TableColumn("Дата");
    	TableColumn amount = new TableColumn("Сумма");
    	TableColumn comment = new TableColumn("Комментарий");
    	tableViewData.getColumns().addAll(data, amount, comment);
    	
    	VBox vbox = new VBox();    	
    	vbox.setPadding(new Insets(10, 10, 10, 10));
    	vbox.getChildren().add(tableViewData);  	
    	rootNode.setRight(vbox);
    }
    
    //переопределить метод start()
    public void start(Stage getStage) {
    	primaryStage = getStage;
    	primaryStage.setTitle("money");	    											//задаем заголовок подмостка    	    	
    	rootNode = new BorderPane();													//создаем корневой узел - панель граничной компановки    	
    	primaryStage.setScene(new Scene(rootNode, 1280, 1024));							//Создаем сцену и устанавливаем сцену на подмосток    	
    	initMenu();
    	initTree();
    	initDataGrid();
    	primaryStage.show();															//Показываем подмосток и сцену
    }   
    
}

package money.incexp;

import javafx.scene.layout.*;	//корневой узел
import javafx.scene.control.*;	//кнопки
import javafx.event.*;			//обработчик события
import javafx.beans.value.*;

public class MoneyTree {
	private String selected;						//имя выбранного узла дерева
	private TreeView<String> treeView ;				//дерево
	private TreeItem<String> treeItems;				//узлы дерева
	
	
	MoneyTree(String ...treeItems) {
		
		//создать корневой узел
		if (treeItems.length != 0)this.treeItems = new TreeItem<String>(treeItems[0]);			
		//создать  дочерние узлы
		for(int i = 1; i < treeItems.length; i++) {
			this.treeItems.getChildren().add(new TreeItem<String>(treeItems[i])); 			
		}		
		//создать дерево
		treeView = new TreeView<String>(this.treeItems);																//создать древовидное представление используя построенное дерево
	    	
    	//обработчик дерева пунктов
    	MultipleSelectionModel <TreeItem<String>> treeViewMultipleSelectionModel = treeView.getSelectionModel();		//получить модель выбора для древовидного представления
    	    	    	
    	treeViewMultipleSelectionModel.selectedItemProperty().addListener(												//Использовать приёмник событий изменения, чтобы оперативно 
    			new ChangeListener<TreeItem<String>>() {																//реагировать на выбор элементов в древовидном представлении
    				public void changed(ObservableValue<? extends TreeItem<String>> changed, TreeItem<String> oldVal, TreeItem<String> newVal){
    					if (newVal != null) selected = newVal.getValue();
    				}
    			}
    	);
    	//this.treeItems.setExpanded(true);																			//раскрыть узлы
	}
	
	String getSelected() {
		return selected;
	}
	
	TreeView<String> getTreeView() {
		return treeView;
	}
	
}
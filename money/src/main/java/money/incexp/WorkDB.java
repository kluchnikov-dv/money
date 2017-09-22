package money.incexp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;	//tableview

//Сначало надо к проекту подключить драйвер jdbc - для postgresql
//Project -> Properties -> JavaBuildPath -> Libraries -> AddExternalJars -> ищем драйвер jdbc 

public class WorkDB {
	private String url = "jdbc:postgresql://localhost:5432/money";
	private String login = "pgmoney";
	private String password = "pgmoney";
	private Connection connection;	
	
	//подключиться к БД
	public void ConnectToDB() {
		try{			
			Class.forName("org.postgresql.Driver");						
			connection = DriverManager.getConnection(url, login, password);
			System.out.println("БД подключена.");			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ошибка подключения БД.");
		}		
	}
	
	//отключиться от БД
	public void DisconnectDB() {
		try {
			connection.close();
			System.out.println("БД отключена.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ошибка отключения БД.");
		}
	}
	
	//возвратить список из обьектов класса IncomeItem заполненных данными из БД
	public ObservableList<IncomeItem> getIncomeItemList() {
		try {			
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM income");
			ObservableList<IncomeItem> incomeItemList = FXCollections.observableArrayList(); //создает массив класса IncomeItem 
			while (rs.next()) {					
				//создать обьект класса IncomeItem и заполнить поля значениями из БД
				incomeItemList.add(new IncomeItem(rs.getString("date"), rs.getString("amount"), rs.getString("comment"), rs.getString("typeOfIncome")));				
			} 
			return incomeItemList; //возвратить список из обьектов класса IncomeItem заполненных данными из БД
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 		
	}
	
	//возвратить список из обьектов класса ExpenseItem заполненных данными из БД
	public ObservableList<ExpenseItem> getExpenseItemList() {
		try {			
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM expense");
			ObservableList<ExpenseItem> expenseItem = FXCollections.observableArrayList(); //создает массив класса ExpenseItem
			while (rs.next()) {					
				//создать обьект класса ExpenseItem и заполнить поля значениями из БД
				expenseItem.add(new ExpenseItem(rs.getString("date"), rs.getString("amount"), rs.getString("comment"), rs.getString("typeOfExpense"), rs.getString("whereBuy")));				
			} 
			return expenseItem; //возвратить список из обьектов класса ExpenseItem заполненных данными из БД
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 		
	}
	
	/*
	public ObservableList<ExpenseItem> getExpenseItem() {
		try {			
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM expense");
			ObservableList<ExpenseItem> expenseItem = FXCollections.observableArrayList(); //создает массив класса ExpenseItem
			while (rs.next()) {					
				//добавить данные в таблицу
				expenseItem.add(new ExpenseItem(rs.getString("date"), rs.getString("amount"), rs.getString("comment"), rs.getString("typeOfExpense"), rs.getString("whereBuy")));				
			} 
			return expenseItem;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 		
	}
	*/
			
}

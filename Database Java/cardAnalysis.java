import java.sql.*;


public class cardAnalysis {

	
	
	
	public static void main(String[] args) {
	
	//Temp array made to store values from the query into an array
	//int[] array = new int[10];
	
	int[][] freqChart = new int[31][10];
		
	Connection conn = null;
	
	//Sets up the connection to the database
	try{
		
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost/blackjack", "root", "root");
	
	//object to execute an sql statement
	Statement sqlState = conn.createStatement();
	
	
	/*
	//Stores a query into a string variable
	String selectStuff = "SELECT COUNT(*) from millionhands where card1_value+card3_value=5 AND card2_value=2 union "
			+ "SELECT COUNT(*) from millionhands where card1_value+card3_value=5 AND card2_value=3";
	
	
	//creates an object to execute the query
	ResultSet rows = sqlState.executeQuery(selectStuff);
	
		//While there are more rows of data in the table created by the query we store those values into an array
		while(rows.next()){
			
			array[0] = rows.getInt("count(*)");
			System.out.println(rows.getInt("count(*)"));
				
		}
		
		System.out.println(array[0]);
		array[0] +=5;
		System.out.println(array[0]);
	*/
	
	//Prints out the columns of the chart
	System.out.print("\t");
	for(int x = 2; x < 11; x++)
	System.out.print(x + "\t");
	System.out.println("A");
	
	//Stores a query in a string variable
	String fiveQuery = "SELECT COUNT(*) from millionhands"
			+ " where card1_value+card3_value=5 AND card2_value=2 AND (card1_value != 1 AND card3_value!=1)"
			+ " union"
			+ " SELECT COUNT(*) from millionhands"
			+ " where card1_value+card3_value=5 AND card2_value=3 AND (card1_value != 1 AND card3_value!=1)"
			+ " union"
			+ " SELECT COUNT(*) from millionhands"
			+ " where card1_value+card3_value=5 AND card2_value=4 AND (card1_value != 1 AND card3_value!=1)"
			+ " union"
			+ " SELECT COUNT(*) from millionhands"
			+ " where card1_value+card3_value=5 AND card2_value=5 AND (card1_value != 1 AND card3_value!=1)"
			+ " union"
			+ " SELECT COUNT(*) from millionhands"
			+ " where card1_value+card3_value=5 AND card2_value=6 AND (card1_value != 1 AND card3_value!=1)"
			+ " union"
			+ " SELECT COUNT(*) from millionhands"
			+ " where card1_value+card3_value=5 AND card2_value=7 AND (card1_value != 1 AND card3_value!=1)"
			+ " union"
			+ " SELECT COUNT(*) from millionhands"
			+ " where card1_value+card3_value=5 AND card2_value=8 AND (card1_value != 1 AND card3_value!=1)"
			+ " union"
			+ " SELECT COUNT(*) from millionhands"
			+ " where card1_value+card3_value=5 AND card2_value=9 AND (card1_value != 1 AND card3_value!=1)"
			+ " union"
			+ " SELECT COUNT(*) from millionhands"
			+ " where card1_value+card3_value=5 AND (card2_value=10 OR card2_value=11 OR card2_value= 12 OR card2_value=13) AND (card1_value != 1 AND card3_value!=1)"
			+ " union"
			+ " SELECT COUNT(*) from millionhands"
			+ " where card1_value+card3_value=5 AND card2_value=1 AND (card1_value != 1 AND card3_value!=1)";
	
	//Creates object to execute query
	ResultSet fiveData = sqlState.executeQuery(fiveQuery);
	
	//While there are more lines in the table of data we print out the query
	System.out.print("5");
	while(fiveData.next()){
		
		System.out.print("\t" + (fiveData.getFloat("count(*)")));
		
	
	}	
		
	
	System.out.println();
	//Stores a query in a string variable
		String sixQuery = "SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=6 AND card2_value=2 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=3 AND card3_value !=3))"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=6 AND card2_value=3 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=3 AND card3_value !=3))"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=6 AND card2_value=4 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=3 AND card3_value !=3))"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=6 AND card2_value=5 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=3 AND card3_value !=3))"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=6 AND card2_value=6 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=3 AND card3_value !=3))"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=6 AND card2_value=7 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=3 AND card3_value !=3))"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=6 AND card2_value=8 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=3 AND card3_value !=3))"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=6 AND card2_value=9 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=3 AND card3_value !=3))"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=6 AND (card2_value=10 OR card2_value=11 OR card2_value= 12 OR card2_value=13) AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=3 AND card3_value !=3))"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=6 AND card2_value=1 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=3 AND card3_value !=3))";
		
		//Creates object to execute query
		ResultSet sixData = sqlState.executeQuery(sixQuery);
		
		//While there are more lines in the table of data we print out the query
		System.out.print("6");
		while(sixData.next()){
			
			System.out.print("\t" + sixData.getFloat("count(*)"));
			
		
		}	
		
		/*
		System.out.println();
		//Stores a query in a string variable
		String sevenQuery = "SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=7 AND card2_value=2 AND (card1_value != 1 AND card3_value!=1)"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=7 AND card2_value=3 AND (card1_value != 1 AND card3_value!=1)"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=7 AND card2_value=4 AND (card1_value != 1 AND card3_value!=1)"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=7 AND card2_value=5 AND (card1_value != 1 AND card3_value!=1)"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=7 AND card2_value=6 AND (card1_value != 1 AND card3_value!=1)"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=7 AND card2_value=7 AND (card1_value != 1 AND card3_value!=1)"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=7 AND card2_value=8 AND (card1_value != 1 AND card3_value!=1)"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=7 AND card2_value=9 AND (card1_value != 1 AND card3_value!=1)"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=7 AND (card2_value=10 OR card2_value=11 OR card2_value= 12 OR card2_value=13) AND (card1_value != 1 AND card3_value!=1)"
				+ " union"
				+ " SELECT COUNT(*) from millionhands"
				+ " where card1_value+card3_value=7 AND card2_value=1 AND (card1_value != 1 AND card3_value!=1)";
		
		//Creates object to execute query
		ResultSet sevenData = sqlState.executeQuery(sevenQuery);
		
		//While there are more lines in the table of data we print out the query
		System.out.print("7");
		while(sevenData.next()){
			
			System.out.print("\t" + sevenData.getFloat("count(*)"));
			
		
		}	
		
		
		System.out.println();
		//Stores a query in a string variable
			String eightQuery = "SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=8 AND card2_value=2 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=4 AND card3_value !=4))"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=8 AND card2_value=3 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=4 AND card3_value !=4))"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=8 AND card2_value=4 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=4 AND card3_value !=4))"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=8 AND card2_value=5 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=4 AND card3_value !=4))"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=8 AND card2_value=6 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=4 AND card3_value !=4))"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=8 AND card2_value=7 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=4 AND card3_value !=4))"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=8 AND card2_value=8 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=4 AND card3_value !=4))"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=8 AND card2_value=9 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=4 AND card3_value !=4))"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=8 AND (card2_value=10 OR card2_value=11 OR card2_value= 12 OR card2_value=13) AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=4 AND card3_value !=4))"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=8 AND card2_value=1 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=4 AND card3_value !=4))";
			
			//Creates object to execute query
			ResultSet eightData = sqlState.executeQuery(eightQuery);
			
			//While there are more lines in the table of data we print out the query
			System.out.print("8");
			while(eightData.next()){
				
				System.out.print("\t" + eightData.getFloat("count(*)"));
				
			
			}	
		
		
			System.out.println();
			//Stores a query in a string variable
			String nineQuery = "SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=9 AND card2_value=2 AND (card1_value != 1 AND card3_value!=1)"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=9 AND card2_value=3 AND (card1_value != 1 AND card3_value!=1)"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=9 AND card2_value=4 AND (card1_value != 1 AND card3_value!=1)"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=9 AND card2_value=5 AND (card1_value != 1 AND card3_value!=1)"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=9 AND card2_value=6 AND (card1_value != 1 AND card3_value!=1)"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=9 AND card2_value=7 AND (card1_value != 1 AND card3_value!=1)"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=9 AND card2_value=8 AND (card1_value != 1 AND card3_value!=1)"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=9 AND card2_value=9 AND (card1_value != 1 AND card3_value!=1)"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=9 AND (card2_value=10 OR card2_value=11 OR card2_value= 12 OR card2_value=13) AND (card1_value != 1 AND card3_value!=1)"
					+ " union"
					+ " SELECT COUNT(*) from millionhands"
					+ " where card1_value+card3_value=9 AND card2_value=1 AND (card1_value != 1 AND card3_value!=1)";
			
			//Creates object to execute query
			ResultSet nineData = sqlState.executeQuery(nineQuery);
			
			//While there are more lines in the table of data we print out the query
			System.out.print("9");
			while(nineData.next()){
				
				System.out.print("\t" + nineData.getFloat("count(*)"));
				
			
			}	
			
		
			System.out.println();
			//Stores a query in a string variable
				String tenQuery = "SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=10 AND card2_value=2 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=5 AND card3_value !=5))"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=10 AND card2_value=3 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=5 AND card3_value !=5))"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=10 AND card2_value=4 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=5 AND card3_value !=5))"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=10 AND card2_value=5 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=5 AND card3_value !=5))"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=10 AND card2_value=6 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=5 AND card3_value !=5))"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=10 AND card2_value=7 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=5 AND card3_value !=5))"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=10 AND card2_value=8 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=5 AND card3_value !=5))"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=10 AND card2_value=9 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=5 AND card3_value !=5))"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=10 AND (card2_value=10 OR card2_value=11 OR card2_value= 12 OR card2_value=13) AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=5 AND card3_value !=5))"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=10 AND card2_value=1 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=5 AND card3_value !=5))";
				
				//Creates object to execute query
				ResultSet tenData = sqlState.executeQuery(tenQuery);
				
				//While there are more lines in the table of data we print out the query
				System.out.print("10");
				while(tenData.next()){
					
					System.out.print("\t" + tenData.getFloat("count(*)"));
					
				
				}	
		
		
		
				
				
				System.out.println();
				//Stores a query in a string variable
				String elevenQuery = "SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=11 AND card2_value=2 AND (card1_value != 1 AND card3_value!=1)"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=11 AND card2_value=3 AND (card1_value != 1 AND card3_value!=1)"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=11 AND card2_value=4 AND (card1_value != 1 AND card3_value!=1)"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=11 AND card2_value=5 AND (card1_value != 1 AND card3_value!=1)"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=11 AND card2_value=6 AND (card1_value != 1 AND card3_value!=1)"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=11 AND card2_value=7 AND (card1_value != 1 AND card3_value!=1)"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=11 AND card2_value=8 AND (card1_value != 1 AND card3_value!=1)"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=11 AND card2_value=9 AND (card1_value != 1 AND card3_value!=1)"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=11 AND (card2_value=10 OR card2_value=11 OR card2_value= 12 OR card2_value=13) AND (card1_value != 1 AND card3_value!=1)"
						+ " union"
						+ " SELECT COUNT(*) from millionhands"
						+ " where card1_value+card3_value=11 AND card2_value=1 AND (card1_value != 1 AND card3_value!=1)";
				
				//Creates object to execute query
				ResultSet elevenData = sqlState.executeQuery(elevenQuery);
				
				//While there are more lines in the table of data we print out the query
				System.out.print("7");
				while(elevenData.next()){
					
					System.out.print("\t" + elevenData.getFloat("count(*)"));
					
				
				}			
		
		
		
				
				System.out.println();
				//Stores a query in a string variable
					String twelveQuery = "SELECT COUNT(*) from millionhands"
							+ " where card1_value+card3_value=12 AND card2_value=2 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=6 AND card3_value !=6))"
							+ " union"
							+ " SELECT COUNT(*) from millionhands"
							+ " where card1_value+card3_value=12 AND card2_value=3 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=6 AND card3_value !=6))"
							+ " union"
							+ " SELECT COUNT(*) from millionhands"
							+ " where card1_value+card3_value=12 AND card2_value=4 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=6 AND card3_value !=6))"
							+ " union"
							+ " SELECT COUNT(*) from millionhands"
							+ " where card1_value+card3_value=12 AND card2_value=5 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=6 AND card3_value !=6))"
							+ " union"
							+ " SELECT COUNT(*) from millionhands"
							+ " where card1_value+card3_value=12 AND card2_value=6 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=6 AND card3_value !=6))"
							+ " union"
							+ " SELECT COUNT(*) from millionhands"
							+ " where card1_value+card3_value=12 AND card2_value=7 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=6 AND card3_value !=6))"
							+ " union"
							+ " SELECT COUNT(*) from millionhands"
							+ " where card1_value+card3_value=12 AND card2_value=8 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=6 AND card3_value !=6))"
							+ " union"
							+ " SELECT COUNT(*) from millionhands"
							+ " where card1_value+card3_value=12 AND card2_value=9 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=6 AND card3_value !=6))"
							+ " union"
							+ " SELECT COUNT(*) from millionhands"
							+ " where card1_value+card3_value=12 AND (card2_value=10 OR card2_value=11 OR card2_value= 12 OR card2_value=13) AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=6 AND card3_value !=6))"
							+ " union"
							+ " SELECT COUNT(*) from millionhands"
							+ " where card1_value+card3_value=12 AND card2_value=1 AND ((card1_value !=1 AND card3_value != 1) AND (card1_value !=6 AND card3_value !=6))";
					
					//Creates object to execute query
					ResultSet twelveData = sqlState.executeQuery(twelveQuery);
					
					//While there are more lines in the table of data we print out the query
					System.out.print("10");
					while(twelveData.next()){
						
						System.out.print("\t" + twelveData.getFloat("count(*)"));
						
					
					}	
			
		
		
		
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
	//Gives us a message saying why we can't connect (if we cannot connect to the database)
	catch(SQLException ex){
		
		System.out.println("SQLException: " + ex.getMessage());
		System.out.println("Vendor Error: " + ex.getErrorCode());
		
	}
	
	catch(ClassNotFoundException e){
	
		e.printStackTrace();
	}
	
	
	
	}

}

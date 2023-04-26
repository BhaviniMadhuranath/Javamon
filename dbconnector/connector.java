package Javamon.dbconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connector {
    public static void main(String[] args){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javamon?" + "user=root&password=nugget");
        }catch(SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
        }catch(Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
    }                                             
}

// public class connector {
//     // Create a database connection
    
//     void connect()
//     {
//         // connect to database
//         String url = "jdbc:mysql://localhost:3306/javamon";
//         String username = "root";
//         String password = "nugget";
//         try {
//             Connection conn = DriverManager.getConnection(url, username, password);
//             // Use the connection object to interact with the database
//         } catch (SQLException e) {
//             // Handle any errors that may occur
//             e.printStackTrace();
//         }

//         try {
//             Connection conn = DriverManager.getConnection(url, username, password);
//             // Execute a query and retrieve the results
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
//             while (rs.next()) {
//                 // Process the row data
//             }
//             // Close the result set, statement, and connection
//             rs.close();
//             stmt.close();
//             conn.close();
//         } catch (SQLException e) {
//             // Handle any errors that may occur
//             e.printStackTrace();
//         }
        
//     }
// }

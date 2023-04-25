// package Javamon.src;

import java.sql.*;

public class dbconnectivity {

  public static ResultSet retrieveLeaderboard()
    throws SQLException, ClassNotFoundException {
    Connection connection = null;
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection =
      DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/javamon",
        "root",
        "alohomora"
      );
    Statement statement;
    statement = connection.createStatement();
    ResultSet resultSet;
    resultSet =
      statement.executeQuery("select * from playerscore order by score desc");
    return resultSet;
  }

  // use this to check if name exists in leaderboard to determine if create or update should be called
  public static int checkLeaderboard(String name)
    throws SQLException, ClassNotFoundException {
    Connection connection = null;
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection =
      DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/javamon",
        "root",
        "alohomora"
      );
    Statement statement;
    statement = connection.createStatement();
    String query = "select * from playerscore where name =\"" + name + "\";";
    System.out.println(query);
    ResultSet result;
    result = statement.executeQuery(query);
    if (result.next() == false) {
      return 0;
    }
    return 1;
  }

  public static void updateLeaderboard(String name, int score)
    throws SQLException, ClassNotFoundException {
    Connection connection = null;
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection =
      DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/javamon",
        "root",
        "alohomora"
      );
    Statement statement;
    statement = connection.createStatement();
    String query =
      "update playerscore set score=" +
      score +
      " where name =\"" +
      name +
      "\";";
    System.out.println(query);
    int result;
    result = statement.executeUpdate(query);
  }

  public static void addToLeaderboard(String name, int score)
    throws SQLException, ClassNotFoundException {
    Connection connection = null;
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection =
      DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/javamon",
        "root",
        "alohomora"
      );
    Statement statement;
    statement = connection.createStatement();
    String query =
      "insert into playerscore(name,score) values(\"" +
      name +
      "\"," +
      score +
      ");";
    System.out.println(query);
    int result;
    result = statement.executeUpdate(query);
  }

  public static void main(String arg[]) {
    //Connection connection = null;
    try {
      //  // below two lines are used for connectivity.
      //  Class.forName("com.mysql.cj.jdbc.Driver");
      //  connection =
      //    DriverManager.getConnection(
      //      "jdbc:mysql://localhost:3306/javamon",
      //      "root",
      //      "alohomora"
      //    );
      //
      //  // mydb is database
      //  // mydbuser is name of database
      //  // mydbuser is password of database
      //
      //  Statement statement;
      //  statement = connection.createStatement();
      //  ResultSet resultSet;
      //  resultSet = statement.executeQuery("select * from playerscore");
      int code, score;
      String title;
      updateLeaderboard("Gowri", 20);
      ResultSet resultSet = retrieveLeaderboard();
      while (resultSet.next()) {
        code = resultSet.getInt("ID");
        title = resultSet.getString("name").trim();
        score = resultSet.getInt("score");
        System.out.println(
          "Code : " + code + " Title : " + title + " Score : " + score
        );
      }
      resultSet.close();
      //statement.close();
      // connection.close();
    } catch (Exception exception) {
      System.out.println(exception);
    }
  } // function ends
} // class ends

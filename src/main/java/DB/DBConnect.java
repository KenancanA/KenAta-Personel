package DB;
import java.sql.Connection;
import java.sql.DriverManager;

public abstract class DBConnect {
    private static Connection conn=null;
    public static Connection getConn()
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=(Connection) DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=employeeDb;trustServerCertificate=true;","SA","eyupfurkantuylu123");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return conn;
    }
}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String usuario = "RIBERA";
        String contraneña = "ribera";

        try(Connection conn = DriverManager.getConnection(url,usuario,contraneña)){
            String query = "select * " +
                    "from empleado2";
        }catch(SQLException e){
            System.out.println("error al mostrar tabla " + e.getMessage());
        }
    }
}
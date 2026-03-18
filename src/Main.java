import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String usuario = "RIBERA";
        String contraneña = "ribera";

        try(Connection conn = DriverManager.getConnection(url,usuario,contraneña);
            Statement stmt = conn.createStatement()){
            String sql = "select * " +
                    "from empleado2 " +
                    "where MOD(ID,2)!=0";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                double salario = rs.getDouble("salario");
                System.out.println("ID: "+id + " Nombre: " + nombre + " Salario: " + salario);
            }
        }catch(SQLException e){
            System.out.println("error al mostrar tabla " + e.getMessage());
        }
    }
}
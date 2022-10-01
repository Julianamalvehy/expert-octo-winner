package connection;
import java.sql.*;//de aqui nos interesa el conecction y el drivermanager

public class DBConnection {
    //declaramos la conexion con la informacion
    Connection connection;
    //base de datos
    static String bd= "movies_rental";
    // puerto
    static String  port="3307";
    static String login="root";
    static String password="admin";

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //aqui llamo el puerto mas el bd
            String url="jdbc:mysql://localhost:"+this.port+"/"+this.bd;
            connection=DriverManager.getConnection(url,this.login,this.password);
            System.out.println("conexion establecida");
        } catch (Exception ex) {
            System.out.println("error de conexion");
        }
    }
    public Connection getConnection(){
        return connection;
    }
    
    public void desconectar(){
        connection=null;
    }
    
}

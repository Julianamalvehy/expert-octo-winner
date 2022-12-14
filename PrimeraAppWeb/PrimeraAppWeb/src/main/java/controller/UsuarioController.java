package controller;

import java.sql.*;
import com.google.gson.Gson;
import beans.Usuario;
import connection.DBConnection;

public class UsuarioController implements IUsuarioController {
    @Override
    public String login(String username, String contrasena){
        Gson gson= new Gson();
        DBConnection con= new DBConnection();
        String sql="Select *from usuarios where username='"+ username + "'and contrasena='"+contrasena+"'";
        
        try {
            Statement st= con.getConnection().createStatement();
            ResultSet rs= st.executeQuery(sql);
            while (rs.next()){
                String nombre =rs.getString("nombre");
                String apellidos=rs.getString("apellidos");
                String email=rs.getString("email");
                double saldo=rs.getDouble("saldo");
                boolean premium=rs.getBoolean("premium");
                
                Usuario usuario
                        =new Usuario(username,contrasena,nombre,apellidos,email,saldo,premium);
                return gson.toJson(usuario);
                
            }
            
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
        }finally{
            con.desconectar();
        }
        return "false";
    }
}

package exemplos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

    public static void main(String[] args) throws SQLException {

     Connection   ConnectFatory = new ConnectFatory().CriarConexao();
        Statement stmt = ConnectFatory.createStatement();
        stmt.execute("update anime set nome = 'pedro'where nome = 'naruto'");
        stmt.close();
    }


}

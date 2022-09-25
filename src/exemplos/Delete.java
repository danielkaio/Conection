package exemplos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) throws SQLException {
        String nome = "joana";
      Connection  ConnectFatory = new ConnectFatory().CriarConexao();
        PreparedStatement stmt = ConnectFatory.prepareStatement("delete from anime where nome = ?");
        stmt.setString(1,nome);
        stmt.execute();
        stmt.close();
    }
}

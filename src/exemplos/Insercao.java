package exemplos;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Insercao {

    public static void main(String[] args) throws SQLException {

        Connection ConnectFatory = new ConnectFatory().CriarConexao();
        Statement stmt= ConnectFatory.createStatement();
        stmt.execute("insert into pessoa (nome) values('marta')");
        stmt.close();

    }


}

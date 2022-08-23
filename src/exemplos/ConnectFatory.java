    package exemplos;

import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


    public class ConnectFatory {

        public  Connection CriarConexao() throws SQLException {

           return DriverManager.getConnection("jdbc:mysql://localhost:3306/jogo","root","Daniel1996@");

        }



    }


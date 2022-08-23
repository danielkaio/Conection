    package exemplos;
    import java.sql.*;

    public class Listagem  {
        public static void main(String[] args) throws SQLException {

            Connection c = new ConnectFatory().CriarConexao();
            Statement stm = c.createStatement();
            stm.execute("select * from pessoa");
            ResultSet rst = stm.getResultSet();
            while (rst.next()){
              String  nome = rst.getString("nome");
                System.out.println(nome);
            }

            c.close();
        }
    }

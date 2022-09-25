    package exemplos;
    import java.sql.*;

    public class Listagem  {
        public static void main(String[] args) throws SQLException {

            Connection c = new ConnectFatory().CriarConexao();
            PreparedStatement stm = c.prepareStatement("select * from anime");
            stm.execute();
            ResultSet rst = stm.getResultSet();
            while (rst.next()){
              String  nome = rst.getString("nome");
                System.out.println(nome);
            }

            c.close();
        }
    }

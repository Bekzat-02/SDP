package repositories.db;

import repositories.interfaces.IDBRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresRepository implements IDBRepository {
    @Override
    public Connection getConnection() {
        try {
            String getConn = "jdbc:mysql://localhost/sdp";
            Connection conn = DriverManager.getConnection(getConn, "root", "");
            return conn;
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}

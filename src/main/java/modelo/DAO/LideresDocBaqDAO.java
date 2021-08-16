package modelo.DAO;

import util.JDBCutilities;

import java.util.ArrayList;
import modelo.VO.LideresDocBaqVO;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LideresDocBaqDAO {
        
    public ArrayList<LideresDocBaqVO> consultarLideresBaq() throws SQLException {
        
        ArrayList<LideresDocBaqVO> res = new ArrayList<LideresDocBaqVO>();
        
        Connection conexion = JDBCutilities.gConnection();

        String query = "SELECT Nombre || \" \" || Primer_Apellido || \" \" || Segundo_Apellido Nombre, Documento_Identidad " + 
        "FROM  Lider l " +
        "WHERE Ciudad_Residencia = 'Barranquilla' " +
        "ORDER BY Nombre";

        Statement st = conexion.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()) {
            String nombre = rs.getString("Nombre");
            String documento = rs.getString("Documento_Identidad");

            LideresDocBaqVO registro =  new LideresDocBaqVO(nombre, documento);

            res.add(registro);
        }
        
        conexion.close();
        st.close();
        rs.close();
        return res;

    }

}

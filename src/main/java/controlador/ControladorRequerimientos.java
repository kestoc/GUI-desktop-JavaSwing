package controlador;

import java.util.ArrayList;
import modelo.DAO.*;
import modelo.VO.*;
import java.sql.SQLException;

public class ControladorRequerimientos {
    
    private final MaterialesProyectosDAO materialesProyectosDAO;
    private final LideresDocBaqDAO lideresDocBaqDAO;
    private final LideresProyectosPerDAO lideresProyectosPerDAO;

    public ControladorRequerimientos() {
        materialesProyectosDAO = new MaterialesProyectosDAO();
        lideresDocBaqDAO = new LideresDocBaqDAO();
        lideresProyectosPerDAO = new LideresProyectosPerDAO();
    }

    public ArrayList<MaterialesProyectosVO> consultarMaterialesProyectos() throws SQLException {
        return materialesProyectosDAO.consultarMaterialesProyectos();
    }

    public ArrayList<LideresDocBaqVO> consultarLideresBaq() throws SQLException {
        return lideresDocBaqDAO.consultarLideresBaq();
    }

    public ArrayList<LideresProyectosPerVO> consultarLideresPer() throws SQLException {
        return lideresProyectosPerDAO.consultarLideresPer();
    }

}

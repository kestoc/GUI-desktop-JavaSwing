package modelo.VO;

public class MaterialesProyectosVO {

    private String nombreMaterial;
    private Integer precioUnidad;
    private Integer total;

    public MaterialesProyectosVO(String nombreMaterial, Integer precioUnidad, Integer total) {
        this.nombreMaterial = nombreMaterial;
        this.precioUnidad = precioUnidad;
        this.total = total;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    public Integer getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Integer precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    
}
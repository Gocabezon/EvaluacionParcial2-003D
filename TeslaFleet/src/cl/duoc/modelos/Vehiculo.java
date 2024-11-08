
package cl.duoc.modelos;

/**
 *
 * @author Cetecom
 */
public abstract class Vehiculo implements IAlquiler{
    private String idVehiculo;
    private boolean mantenimiento;

    public Vehiculo() {
    }

    public Vehiculo(String idVehiculo, boolean mantenimiento) {
        this.idVehiculo = idVehiculo;
        this.mantenimiento = mantenimiento;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public boolean isMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(boolean mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", mantenimiento=" + mantenimiento + '}';
    }
    
    
}

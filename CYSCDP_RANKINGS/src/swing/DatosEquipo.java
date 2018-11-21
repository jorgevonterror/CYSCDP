
package swing;

/**
 *
 * @author kevincruz
 */
public class DatosEquipo {
    private int Id;
    private String Nombre;
    
    public DatosEquipo() {
        Id = 0;
        Nombre = "";
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}

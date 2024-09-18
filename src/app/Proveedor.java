
package app;

public class Proveedor {
    
    private String nombre;
    private String empresa;
    private String telefono;
    private String email;

    public Proveedor(String nombre, String empresa, String telefono, String email) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        String retorno = 
                "Nombre: " + nombre +
                " / Empresa: " + empresa +
                " / Telefono: " + telefono +
                " / Email: "+ email;
        return retorno;
    }
}
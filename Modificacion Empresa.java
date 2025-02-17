//en este archivo le hice una modificacion a la clase base que esta vacio, la inicialice con los datos vacios, no nulos
//tambien modifique el tipo de dato de tipoEmpresa y estadoEmpresa, en vez de boolean los deje string, para simplificar el codigo y tener un mejor entendimiento de este.
//ademas toco modificar los gets and setter de estos, para que queden acuerdo al tipo de datos 
// 
//  IMPORTANTE: 
//  no he revisado los demas archivos, probablemente toque modificarles cosas, asi que es suceptible a cambios
//
//
package logica;

/*
Clase que contiene los atributos, constructores y métodos de Empresas.
*/
public class Empresa {
  
    private int id; //El id es autoincremental, al realizarse la inserción en base de datos es asignado automáticamente.
    private String nombreEmpresa;
    private String nit; //El NIT solo puede registrarse una vez en la base de datos
    private String nombreRepLegal;
    private String noIdentidad;
    private String tipoEmpresa; //Natural,  Jurídica 
    private int codigoCiiu;
    private String estadoEmpresa; //Activo, Inactivo
    private String departamento;
    private String ciudadMunicipio;

    /*
    Constructor vacío
    */
    public Empresa() {
        this.nombreEmpresa = "";
        this.nit = "";
        this.nombreRepLegal = "";
        this.noIdentidad = "";
        this.tipoEmpresa ="";
        this.codigoCiiu = 0;
        this.estadoEmpresa = "";
        this.departamento = "";
        this.ciudadMunicipio = "";
    }

    
    /*
    Constructor que inicializa todos los atributos excepto el id 
    */
    public Empresa(String nombreEmpresa, String nit, String nombreRepLegal, String noIdentidad, String tipoEmpresa, int codigoCiiu, String estadoEmpresa, String departamento, String ciudadMunicipio) {
        this.nombreEmpresa = nombreEmpresa;
        this.nit = nit;
        this.nombreRepLegal = nombreRepLegal;
        this.noIdentidad = noIdentidad;
        this.tipoEmpresa = tipoEmpresa;
        this.codigoCiiu = codigoCiiu;
        this.estadoEmpresa = estadoEmpresa;
        this.departamento = departamento;
        this.ciudadMunicipio = ciudadMunicipio;
    } 
    
    
    /*
    Constructor que inicializa todos los atributos
    */
    public Empresa(int id, String nombreEmpresa, String nit, String nombreRepLegal, String noIdentidad, String tipoEmpresa, int codigoCiiu, String estadoEmpresa, String departamento, String ciudadMunicipio) {
        this(nombreEmpresa,nit,nombreRepLegal,noIdentidad,tipoEmpresa,codigoCiiu,estadoEmpresa,departamento,ciudadMunicipio);
        this.id = id;
        
    }

 
    /*
    Sobreescritura de método toString adaptado a los atributos de la clase.
    */
    
    public String toString() {
        
        String texto = "empresa{" + "id=" + id + ", nombreEmpresa=" + nombreEmpresa + ", nit=" + nit + ", nombreRepLegal=" + nombreRepLegal + ", noIdentidad=" + noIdentidad + ", tipoEmpresa=" + tipoEmpresa + ", codigoCiiu=" + codigoCiiu + ", estadoEmpresa=" + estadoEmpresa + ", departamento=" + departamento + ", ciudadMunicipio=" + ciudadMunicipio + '}';
        return texto;
    }
    
    
    //Métodos getters y setters de todos los atributos
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombreRepLegal() {
        return nombreRepLegal;
    }

    public void setNombreRepLegal(String nombreRepLegal) {
        this.nombreRepLegal = nombreRepLegal;
    }

    public String getNoIdentidad() {
        return noIdentidad;
    }

    public void setNoIdentidad(String noIdentidad) {
        this.noIdentidad = noIdentidad;
    }

    public String isTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public int getCodigoCiiu() {
        return codigoCiiu;
    }

    public void setCodigoCiiu(int codigoCiiu) {
        this.codigoCiiu = codigoCiiu;
    }

    public boolean isEstadoEmpresa() {
        boolean estado_Empresa ;
        if (estadoEmpresa == "natural"){
            estado_Empresa = false;
        }
        else {
            estado_Empresa = true;
        }
        return estado_Empresa;
    }

    public void setEstadoEmpresa(String estadoEmpresa) {
        this.estadoEmpresa = estadoEmpresa;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudadMunicipio() {
        return ciudadMunicipio;
    }

    public void setCiudadMunicipio(String ciudadMunicipio) {
        this.ciudadMunicipio = ciudadMunicipio;
    }
    
}
    

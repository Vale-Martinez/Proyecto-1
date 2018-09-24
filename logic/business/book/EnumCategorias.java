
package logic.business.book;

public enum EnumCategorias {
    INGENIERIA ("ING","Ingenieria"),
    ADMINISTRACION ("AD","Administracion"),
    CIENCIASNATURALES ("CN","CienciasNaturales"),
    ARTES("AR","Artes"),
    HISTORIA ("HIS","Historia"),
    MATEMATICAS ("MA","Matematicas"),
    FICCION("FI","Ficcion"),
    LITERATURA("LIT","Literatura");
    
    private String codigoCategoria;
    private String palabraCategoria;

    public String getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(String codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getPalabraCategoria() {
        return palabraCategoria;
    }

    public void setPalabraCategoria(String palabraCategoria) {
        this.palabraCategoria = palabraCategoria;
    }

    private EnumCategorias(String codigoCategoria, String palabraCategoria) {
        this.codigoCategoria = codigoCategoria;
        this.palabraCategoria = palabraCategoria;
    }
    
}

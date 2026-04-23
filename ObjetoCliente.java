public class ObjetoCliente {
    private int Id;
    private String Nombre;
    private String TipoServicio;
    private String HoraLlegada;
    private boolean Atendido;
    
    public ObjetoCliente() {
    }

    public ObjetoCliente(int id, String nombre, String tipoServicio, String horaLlegada, boolean atendido) {
        Id = id;
        Nombre = nombre;
        TipoServicio = tipoServicio;
        HoraLlegada = horaLlegada;
        Atendido = atendido;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipoServicio() {
        return TipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        TipoServicio = tipoServicio;
    }

    public String getHoraLlegada() {
        return HoraLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        HoraLlegada = horaLlegada;
    }

    public boolean isAtendido() {
        return Atendido;
    }

    public void setAtendido(boolean atendido) {
        Atendido = atendido;
    }
    
}
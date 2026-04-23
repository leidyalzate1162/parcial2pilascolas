
    public class ObjetoPaginaWeb {
    private String Url;
    private String Titulo;
    private String FechaAcceso;
    
    public ObjetoPaginaWeb() {
    }

    public ObjetoPaginaWeb(String url, String titulo, String fechaAcceso) {
        this.Url = url;
        this.Titulo = titulo;
        this.FechaAcceso = fechaAcceso;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        this.Url = url;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getFechaAcceso() {
        return FechaAcceso;
    }

    public void setFechaAcceso(String fechaAcceso) {
        this.FechaAcceso = fechaAcceso;
    }
}


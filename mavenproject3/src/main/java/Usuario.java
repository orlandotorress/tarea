public class Usuario {
    private String nombreCompleto;
    private String nickname;
    private String clave;
    private String tipo;
    private String fechaCreacion;

    public Usuario(String nombreCompleto, String nickname, String clave, String tipo, String fechaCreacion) {
        this.nombreCompleto = nombreCompleto;
        this.nickname = nickname;
        this.clave = clave;
        this.tipo = tipo;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNickname() {
        return nickname;
    }

    public String getClave() {
        return clave;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", nickname='" + nickname + '\'' +
                ", clave='" + clave + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                '}';
    }
}

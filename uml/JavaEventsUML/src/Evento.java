import java.time.LocalDateTime;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f74dbe84-1383-4f7d-8d79-72a61c461cd3")
public class Evento {
    @objid ("9020bf0f-bd48-4e95-b5c3-d6960f64cb5d")
    private String titulo;

    @objid ("dbac64ba-d65c-4926-a902-f9ddc4a1ca6c")
    private String tipo;

    @objid ("ff6d8aed-3ea1-45dd-8d87-b3aaf804508c")
    private LocalDateTime fechaHora;

    @objid ("7c55dd23-4253-4265-bde8-82d1370ab7a7")
    private double precioDeLaEntrada;

    @objid ("45844b1c-0546-4577-8a2d-3aa2cfd153bd")
    private String portada;

    @objid ("871ad0d6-d603-4e79-8e4b-ebd2d7b0e3ca")
    private double calificacion;

    @objid ("29f12269-e913-4f79-becb-2097fb4536fe")
    public Direccion direccion;

    @objid ("a823b114-7711-4028-a9ab-b0e2ff26fb69")
    public String getTitulo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.titulo;
    }

    @objid ("8fa0c33e-4b79-4214-8e5f-833ce63b014e")
    public void setTitulo(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.titulo = value;
    }

    @objid ("f0cbbebb-ffe4-4789-b455-d7425116519a")
    public String getTipo() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tipo;
    }

    @objid ("63a2839b-ae4d-470e-be88-5814f2ca2008")
    public void setTipo(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.tipo = value;
    }

    @objid ("46707d7f-279d-4e37-a098-8fe2f100e500")
    public LocalDateTime getFechaHora() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.fechaHora;
    }

    @objid ("c9d19301-535f-4313-a485-1c116e2219c1")
    public void setFechaHora(final LocalDateTime value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.fechaHora = value;
    }

    @objid ("f0a22073-2cb8-4ea2-b861-9703fdde9c51")
    public double getPrecioDeLaEntrada() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.precioDeLaEntrada;
    }

    @objid ("01ab674a-5288-4535-99c9-cbc581fcf82b")
    public void setPrecioDeLaEntrada(final double value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.precioDeLaEntrada = value;
    }

    @objid ("cc58ed3a-c29e-4a23-bb1c-5cdb310000b4")
    public String getPortada() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.portada;
    }

    @objid ("f839be30-db34-4e76-96bf-04fa4669532f")
    public void setPortada(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.portada = value;
    }

    @objid ("a68e6f2b-ee8a-4178-b354-d6845a3d3d2e")
    public double getCalificacion() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.calificacion;
    }

    @objid ("4ef5f9a2-3b1a-48b3-816d-2d77aa43d9a7")
    public void setCalificacion(final double value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.calificacion = value;
    }

}

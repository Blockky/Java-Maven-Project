import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2e6b2b1b-ce77-4da8-8d20-55f3dc51c63f")
public class Cliente {
    @objid ("b2f34e90-9b1b-4b7d-af48-410aff2e3665")
    private String nombre;

    @objid ("de8676db-cb44-40e6-872d-a1651282bb83")
    private String correo;

    @objid ("33c6c01e-a6ac-4080-b620-ff96dba4db31")
    private String clave;

    @objid ("b4ab0683-e931-43b5-b4ab-0996c0942f7a")
    private int telefono;

    @objid ("61bcd529-559b-40f0-908a-a166a0fa80bf")
    private boolean vip;

    @objid ("e5a87138-207d-4e6c-8728-e3b6f2316b8f")
    public Direccion direccion;

    @objid ("997c6bb7-7dda-4a68-9d02-40dc72205161")
    public TarjetaDeCredito tarjetaDeCredito;

}

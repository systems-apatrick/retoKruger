package reto.kruger.vacunacion.model;

import javax.persistence.*;

@Entity
@Table(name="roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code_rol;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private ERole name_rol;

    public Role() {
    }

    public Integer getCode_rol() {
        return code_rol;
    }

    public void setCode_rol(Integer code_rol) {
        this.code_rol = code_rol;
    }

    public ERole getName_rol() {
        return name_rol;
    }

    public void setName_rol(ERole name_rol) {
        this.name_rol = name_rol;
    }
}

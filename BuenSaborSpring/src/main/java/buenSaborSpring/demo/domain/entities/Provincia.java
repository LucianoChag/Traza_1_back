package buenSaborSpring.demo.domain.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Provincia extends Base {
    private String nombre;

    @ManyToOne
    private Pais pais;

}

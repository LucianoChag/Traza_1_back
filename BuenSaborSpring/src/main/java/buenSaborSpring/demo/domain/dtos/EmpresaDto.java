package buenSaborSpring.demo.domain.dtos;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpresaDto extends BaseDto{
    private String nombre;
    private String razonSocial;
    private Integer cuil;

}
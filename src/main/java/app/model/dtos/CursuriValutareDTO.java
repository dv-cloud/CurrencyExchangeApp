package app.model.dtos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CursuriValutareDTO {
    private String codValuta;
    private Double curs;
    private String dataCurs;
}

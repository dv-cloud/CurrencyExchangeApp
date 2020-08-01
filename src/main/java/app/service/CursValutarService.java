package app.service;

import app.model.dtos.CursuriValutareDTO;
import app.model.entities.CursValutar;
import app.model.repositories.CursValutarRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursValutarService {
    public CursValutarRepo cursValutar;

    public List<CursuriValutareDTO> getAllCurrencies() {
        List<CursuriValutareDTO> cursList = new ArrayList<>();
        for (CursValutar cv : cursValutar.findAllCurrencies()) {
            cursList.add(new CursuriValutareDTO(cv.getCodValuta(), cv.getCurs(), cv.getDataCurs()));
        }
        return cursList;
    }
}

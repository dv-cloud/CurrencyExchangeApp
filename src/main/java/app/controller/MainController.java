package app.controller;

import app.model.dtos.CodValutaCursDTO;
import app.model.dtos.CursuriValutareDTO;
import app.model.entities.CursValutar;
import app.model.repositories.CursValutarRepo;
import app.service.CursValutarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
public class MainController {
    public CursValutarService cursValutarService;
    public CursValutarRepo cursValutarRepo;

    @RequestMapping(value="/currencies", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<CursuriValutareDTO>> getCurrencies() {
        return new ResponseEntity<>(cursValutarService.getAllCurrencies(), HttpStatus.OK);
    }

    @RequestMapping(value="/currencies", method= RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    CursValutar newCursValutar(@RequestBody CodValutaCursDTO cursValutarNou) {
        String date = LocalDateTime.now().toString();
        Long id = (long) cursValutarRepo.findAll().size() + 1;
        return cursValutarRepo.save(new CursValutar(id, cursValutarNou.getCodValuta(), cursValutarNou.getCurs(), date));
    }
}

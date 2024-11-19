package be.ifapme.personne_mock.controller;

import be.ifapme.personne_mock.model.Personne;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/personne")
public class PersonneController {

    @GetMapping("/{niss}")
    public Personne getPersonneByNiss(@PathVariable String niss) {
        return new Personne("Jean", "Michel");
    }
}

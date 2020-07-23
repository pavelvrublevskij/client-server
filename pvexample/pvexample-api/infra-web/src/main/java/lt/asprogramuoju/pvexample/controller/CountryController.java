package lt.asprogramuoju.pvexample.controller;

import lombok.RequiredArgsConstructor;
import lt.asprogramuoju.pvexample.domain.responses.CountryResponse;
import lt.asprogramuoju.pvexample.service.CountryService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Country controller
 *
 * @author pavel.vrublevskij
 * @version 1.0.0
 */
@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class CountryController {

    private final CountryService service;

    /**
     * Look up all countries, and transform them into a REST collection resource.
     */
    @GetMapping("/country/all")
    public List<CountryResponse> getCountries() {
        return service.getAllCountries();
    }

}

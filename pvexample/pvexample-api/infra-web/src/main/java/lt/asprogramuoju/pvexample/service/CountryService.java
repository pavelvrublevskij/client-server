package lt.asprogramuoju.pvexample.service;

import lt.asprogramuoju.pvexample.domain.responses.CountryResponse;

import java.util.List;

/**
 * Service for countries implementation
 *
 * @author pavel.vrublevskij
 * @version 1.0.0
 */
public interface CountryService {

    /**
     * @return list of all available countries
     */
    List<CountryResponse> getAllCountries();
}

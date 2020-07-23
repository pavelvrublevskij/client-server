package lt.asprogramuoju.pvexample.service;

import lombok.RequiredArgsConstructor;
import lt.asprogramuoju.pvexample.domain.responses.CountryResponse;
import lt.asprogramuoju.pvexample.jpa.dao.CountryRepository;
import lt.asprogramuoju.pvexample.mapper.CountryResponseMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author pavel.vrublevskij
 * @version 1.0.0
 */
@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;
    private final CountryResponseMapper countryResponseMapper;

    @Override
    public List<CountryResponse> getAllCountries() {
        return countryRepository.findAll().stream()
                .map(countryResponseMapper::mapToDomain)
                .collect(Collectors.toList());
    }

}

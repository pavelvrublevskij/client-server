package lt.asprogramuoju.pvexample.service;

import lt.asprogramuoju.pvexample.jpa.dao.CountryRepository;
import lt.asprogramuoju.pvexample.jpa.model.CountryEntity;
import lt.asprogramuoju.pvexample.mapper.CountryResponseMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CountryServiceTest {

    private CountryService countryService;

    @Mock
    private CountryResponseMapper countryResponseMapper;

    @Mock
    private CountryRepository countryRepository;

    private List<CountryEntity> countries;

    @BeforeEach
    void setUp() {
        countryService = new CountryServiceImpl(countryRepository, countryResponseMapper);

        countries = new ArrayList<>();
        countries.add(CountryEntity.builder().countryCode("code1").countryName("Supported country").supported(true).build());
        countries.add(CountryEntity.builder().countryCode("code2").countryName("Unsupported country").supported(false).build());
    }

    @Test
    void shouldFindAllCountries() {
        // given
        when(countryRepository.findAll()).thenReturn(countries);

        // then
        assertEquals(countries.size(), countryService.getAllCountries().size());
        verify(countryRepository, times(1)).findAll();
    }
}

package lt.asprogramuoju.pvexample.mapper;

import lt.asprogramuoju.pvexample.domain.responses.CountryResponse;
import lt.asprogramuoju.pvexample.jpa.model.CountryEntity;
import org.springframework.stereotype.Component;

@Component
public class CountryResponseMapper {

    public CountryResponse mapToDomain(CountryEntity country) {
        return CountryResponse.builder()
                .countryCode(country.getCountryCode())
                .countryName(country.getCountryName())
                .build();
    }
}

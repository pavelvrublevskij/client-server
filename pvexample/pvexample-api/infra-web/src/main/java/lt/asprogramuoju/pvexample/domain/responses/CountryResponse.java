package lt.asprogramuoju.pvexample.domain.responses;

import lombok.Builder;
import lombok.Data;

/**
 * This class is required for creating a response containing the Country to be returned
 *
 * @author pavel.vrublevskij
 * @version 1.0.0
 */
@Builder
@Data
public class CountryResponse {
    String countryCode;
    String countryName;
}

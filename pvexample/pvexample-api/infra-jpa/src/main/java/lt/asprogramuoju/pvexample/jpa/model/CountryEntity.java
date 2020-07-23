package lt.asprogramuoju.pvexample.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author pavel.vrublevskij
 * @version 1.0.0
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "country")
@EqualsAndHashCode(callSuper=false)
public class CountryEntity extends SuperModel {

    @NotNull
    private String countryCode;

    @NotNull
    private String countryName;

    private boolean supported;
}

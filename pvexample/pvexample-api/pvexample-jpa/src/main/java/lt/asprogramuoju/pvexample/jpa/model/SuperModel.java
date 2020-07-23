package lt.asprogramuoju.pvexample.jpa.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author pavel.vrublevskij
 * @version 1.0.0
 */
@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)
public class SuperModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // tells Hibernate that the database provides the primary key value
    private Long id;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}

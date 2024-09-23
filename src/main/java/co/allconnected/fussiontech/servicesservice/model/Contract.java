package co.allconnected.fussiontech.servicesservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "contract", schema = "all_connected_services")
public class Contract {
    @Id
    @Column(name = "id_contract", nullable = false)
    private UUID id;

    @Column(name = "id_user", nullable = false, length = 28)
    private String idUser;

    @Column(name = "due_date", nullable = false)
    private Instant dueDate;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "state", nullable = false)
    private Boolean state = false;

    @Column(name = "description", nullable = false, length = 200)
    private String description;

}
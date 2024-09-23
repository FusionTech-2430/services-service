package co.allconnected.fussiontech.servicesservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "rating", schema = "all_connected_services")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rating", nullable = false)
    private Integer id;

    @Column(name = "id_user", nullable = false, length = 28)
    private String idUser;

    @Column(name = "date", nullable = false)
    private Instant date;

    @Column(name = "rating", nullable = false)
    private Integer rating;

    @Column(name = "comment", length = 500)
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "service_id_service", nullable = false)
    private Service serviceIdService;

}
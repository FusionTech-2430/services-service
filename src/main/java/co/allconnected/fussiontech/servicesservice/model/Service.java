package co.allconnected.fussiontech.servicesservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "service", schema = "all_connected_services")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_service", nullable = false)
    private Integer id;

    @Column(name = "id_business", nullable = false)
    private UUID idBusiness;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "description", nullable = false, length = 280)
    private String description;

    @Column(name = "photo_url", length = 700)
    private String photoUrl;

    @Column(name = "state", nullable = false, length = Integer.MAX_VALUE)
    private String state;

    @ManyToMany(mappedBy = "serviceIdService")
    private Set<Label> labels = new LinkedHashSet<>();

}
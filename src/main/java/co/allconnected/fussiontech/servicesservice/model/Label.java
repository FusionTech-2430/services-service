package co.allconnected.fussiontech.servicesservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "label", schema = "all_connected_services")
public class Label {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_label", nullable = false)
    private Integer id;

    @Column(name = "label", nullable = false, length = 45)
    private String label;

    @ManyToMany
    @JoinTable(
            name = "service_has_label",
            joinColumns = @JoinColumn(name = "label_id_label"),
            inverseJoinColumns = @JoinColumn(name = "service_id_service")
    )
    private Set<Service> serviceIdService = new LinkedHashSet<>();
}
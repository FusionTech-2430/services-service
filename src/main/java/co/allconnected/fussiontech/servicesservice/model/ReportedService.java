package co.allconnected.fussiontech.servicesservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "reported_service", schema = "all_connected_services")
public class ReportedService {
    @Id
    @Column(name = "id_service", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_service", nullable = false)
    private Service service;

    @Column(name = "reason", nullable = false, length = 45)
    private String reason;

    @Column(name = "description", nullable = false, length = 200)
    private String description;

    @Column(name = "report_date", nullable = false)
    private Instant reportDate;

}
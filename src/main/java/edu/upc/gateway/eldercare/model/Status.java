package edu.upc.gateway.eldercare.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="status")
public class Status {
    @Id
    private Long id;
    @Column(name = "safeLed")
    private boolean Safeled;
    @Column(name = "unsafeLed")
    private boolean Unsafeled;
    @Column(name = "distance", length = 50)
    private int Distance;
    @Column(name = "time", length = 50)
    private String Time;
}

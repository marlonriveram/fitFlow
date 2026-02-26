package com.example.fitFlowApi.infrastruture.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "PhysicalProfiles")
public class PhysicalProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double weigth;
    private Double height;
    @Column(name = "blood_type")
    private String bloodType;

}

package com.example.fitFlowApi.infrastruture.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "members")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true, nullable = true)
    private String email;

    @OneToOne(optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "physicalprofile_id")
    private PhysicalProfileEntity physicalProfile;

    @ManyToOne
    @JoinColumn(name = "trainer_id",unique = true)
    private TrainerEntity trainer;
}

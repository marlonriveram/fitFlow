package com.example.fitFlowApi.infrastruture.persistence.entities;

import com.example.fitFlowApi.domain.model.EnrollmentState;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "enrollment")
public class Enrollment {
    @EmbeddedId
    private CompoundKey id;

    @ManyToOne
    @MapsId("memberId") // Este nombre debe coincidir con el campo en CompoundKey
    @JoinColumn(name = "member_id")
    private MemberEntity member;

    @ManyToOne
    @MapsId("gymClassId") // Este nombre debe coincidir con el campo en CompoundKey
    @JoinColumn(name = "gymclass_id")
    private GymClassEntity gymClass;
    private LocalDate registrationDate;
    private EnrollmentState state;
}

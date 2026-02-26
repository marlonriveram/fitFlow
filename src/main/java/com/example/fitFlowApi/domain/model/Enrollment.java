package com.example.fitFlowApi.domain.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Enrollment {
    private Member member;
    private GymClass gymClass;
    private LocalDate registrationDate;
    @Enumerated(EnumType.STRING)
    private EnrollmentState state;
}

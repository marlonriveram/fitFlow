package com.example.fitFlowApi.domain.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GymClass {
    private Long id;
    private String name;
    private LocalDate schedule;
    private Integer maximumQuota;
}

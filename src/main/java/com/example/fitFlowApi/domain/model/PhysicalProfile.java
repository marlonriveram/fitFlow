package com.example.fitFlowApi.domain.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhysicalProfile {
    private Long id;
    private Double weight;
    private Double heigth;
    private String bloodType;

}

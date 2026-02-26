package com.example.fitFlowApi.domain.model;

import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Trainer {
    private Long id;
    private String name;
    private String specialty;

}

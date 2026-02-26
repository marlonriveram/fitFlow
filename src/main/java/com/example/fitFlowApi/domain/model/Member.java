package com.example.fitFlowApi.domain.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    private Long id;
    private String name;
    private String email;
    private Trainer trainer;
    private PhysicalProfile physicalProfile;
}

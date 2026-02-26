package com.example.fitFlowApi.infrastruture.persistence.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor

@Embeddable
@EqualsAndHashCode // Genera equals() y hashCode() automáticamente
public class CompoundKey implements Serializable {
    private Long memberId;
    private Long gymClassId;

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompoundKey that = (CompoundKey) o;
        return Objects.equals(memberId, that.memberId) &&
                Objects.equals(gymClassId, that.gymClassId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, gymClassId);
    }

 */
}

package com.cyber009.sb3t0.entities;


import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@ToString
@EqualsAndHashCode(callSuper = true)
public class Office extends BaseEntity {
    @Column(columnDefinition = "varchar(4000) not null", unique = true)
    private String name;

    @Column(columnDefinition = "text")
    private String description;

    @Column(columnDefinition = "text")
    private String address;
}
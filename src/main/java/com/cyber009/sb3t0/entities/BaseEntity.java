package com.cyber009.sb3t0.entities;

import com.cyber009.sb3t0.common.utility.DateUtility;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
@ToString
@EqualsAndHashCode
public class BaseEntity {
    @Id
    private UUID id;

    @Version
    private Long version;

    @Builder.Default
    private LocalDateTime createdAt = DateUtility.getDateTimeUTC();

    @Builder.Default
    private LocalDateTime updatedAt = DateUtility.getDateTimeUTC();

}

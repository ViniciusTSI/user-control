package com.dio.usercontrol.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Movement {

    @Embeddable
    @EqualsAndHashCode
    @NoArgsConstructor
    @AllArgsConstructor
    public class MovementId implements Serializable {
        private long idMovement;
        private long idUser;
    }

    @Id
    @EmbeddedId
    private MovementId id;
    private LocalDateTime dateEntry;
    private LocalDateTime outputDate;
    private BigDecimal period;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private Calendar calendar;

}

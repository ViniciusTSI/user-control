package com.dio.usercontrol.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
public class BankHours {

    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public class BankHoursId implements Serializable {
        private long idBankHour;
        private long idMovement;
        private long idUser;
    }

    @EmbeddedId
    private BankHoursId id;
    private LocalDateTime workedDate;
    private BigDecimal numberHoursWorked;
    private BigDecimal balanceHoursWorked;
}

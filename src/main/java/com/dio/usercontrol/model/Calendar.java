package com.dio.usercontrol.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Calendar {

    @Id
    private Long id;
    @ManyToOne
    private TypeDate typeDate;
    private String description;
    private LocalDateTime especialDate;
}

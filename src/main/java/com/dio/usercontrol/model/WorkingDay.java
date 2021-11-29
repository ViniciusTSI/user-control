package com.dio.usercontrol.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Audited
public class WorkingDay {

    @Id
    @GeneratedValue
    private long id;
    private String description;
}

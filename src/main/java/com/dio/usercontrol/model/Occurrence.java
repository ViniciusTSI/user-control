package com.dio.usercontrol.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Occurrence {

    @Id
    private long id;
    private String name;
    private String description;
}

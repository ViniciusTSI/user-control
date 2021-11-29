package com.dio.usercontrol.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Locale {

    @Id
    private long id;
    @ManyToOne //   Muitas localidades para um Nivel de Acesso
    private AccessLevel accessLevel;
    private String description;
}

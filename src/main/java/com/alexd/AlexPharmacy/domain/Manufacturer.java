package com.alexd.AlexPharmacy.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "manufacturer")
@Data
@NoArgsConstructor
public class Manufacturer {

    /**
     * Identification number of manufacturer.
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * Trademark of manufacturer.
     */
    @NotNull
    @NotEmpty
    private String trademark;

    /**
     * Cities where the manufacturer's production facilities are located.
     */
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

}

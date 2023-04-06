package com.adihou.tobi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="colaborateur")
@Getter
@Setter
@NoArgsConstructor

public class Collaborateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long collaborateur_id;

    @ManyToOne
    @JoinColumn(name="entreprise_id")
    public Entreprise entreprise;
}

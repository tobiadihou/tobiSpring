package com.adihou.tobi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="entreprise")
@Getter
@Setter
@NoArgsConstructor

public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long entreprise_Id;

    @Column(name = "entrepriseNom")
    private String entrepriseNom;

    @OneToMany(mappedBy = "entreprise", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Collaborateur> collaborateurs = new ArrayList<>();
    
   

    
}

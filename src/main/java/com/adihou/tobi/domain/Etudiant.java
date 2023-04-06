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
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long EtudiantId;

    @Column(name="EtudiantNom")
        private String EtudianNom;

    @Column(name="EtudiantPrenom")
        private String EtudianPrenom;

    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
        private List<Stage> stages = new ArrayList<>();
}

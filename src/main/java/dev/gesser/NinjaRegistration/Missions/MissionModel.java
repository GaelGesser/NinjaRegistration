package dev.gesser.NinjaRegistration.Missions;

import dev.gesser.NinjaRegistration.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missions")
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String difficulty;

    @OneToMany(mappedBy = "missions")
    private List<NinjaModel> ninjas;
}

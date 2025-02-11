package dev.gesser.NinjaRegistration.Missions;

import dev.gesser.NinjaRegistration.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missions")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String difficulty;

    @OneToMany(mappedBy = "mission")
    private List<NinjaModel> ninjas;
}

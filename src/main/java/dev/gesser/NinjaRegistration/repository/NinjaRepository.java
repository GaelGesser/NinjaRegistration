package dev.gesser.NinjaRegistration.repository;
import dev.gesser.NinjaRegistration.model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {


    }


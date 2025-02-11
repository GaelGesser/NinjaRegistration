package dev.gesser.NinjaRegistration.controller;

import dev.gesser.NinjaRegistration.model.NinjaModel;
import dev.gesser.NinjaRegistration.repository.NinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    @Autowired
    private NinjaRepository ninjaRepository;

    @PostMapping
    public NinjaModel createNinja(@RequestBody NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    @GetMapping
    public List<NinjaModel> getAllNinjas() {
        return ninjaRepository.findAll();
    }

    @GetMapping("/{id}")
    public NinjaModel getNinjaById(@PathVariable Long id) {
        return ninjaRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Ninja not found"));
    }

    @PutMapping("/{id}")
    public NinjaModel updateNinja(@PathVariable Long id, @RequestBody NinjaModel ninjaDetails) {
        NinjaModel ninja = ninjaRepository.findById(id).orElseThrow(() -> new RuntimeException("Ninja not found"));
        ninja.setName(ninjaDetails.getName());
        ninja.setEmail(ninjaDetails.getEmail());
        ninja.setAge(ninjaDetails.getAge());
        return ninjaRepository.save(ninja);
    }

    @DeleteMapping("/{id}")
    public void deleteNinja(@PathVariable Long id) {
        ninjaRepository.deleteById(id);
    }

}

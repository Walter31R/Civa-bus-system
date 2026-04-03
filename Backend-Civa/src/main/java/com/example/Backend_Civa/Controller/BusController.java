package com.example.Backend_Civa.Controller;

import com.example.Backend_Civa.Model.Bus;
import com.example.Backend_Civa.Service.BusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bus")
public class BusController {
    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping
    public List<Bus> listarBuses() {
        return busService.listarBuses();
    }

    @GetMapping("/{id}")
    public Bus obtenerBusPorId(@PathVariable Long id) {
        return busService.obtenerBusPorId(id);
    }

}

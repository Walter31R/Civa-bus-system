package com.example.Backend_Civa.Controller;

import com.example.Backend_Civa.Model.Bus;
import com.example.Backend_Civa.Service.BusService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173")

@RestController
@RequestMapping("/bus")
public class BusController {
    private final BusService busService;

    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping
    public Page<Bus> listar(Pageable pageable) {
        return busService.listarBuses(pageable);
    }

    @GetMapping("/{id}")
    public Bus obtenerBusPorId(@PathVariable Long id) {
        return busService.obtenerBusPorId(id);
    }

}

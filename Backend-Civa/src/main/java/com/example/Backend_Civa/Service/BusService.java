package com.example.Backend_Civa.Service;

import com.example.Backend_Civa.Model.Bus;
import org.springframework.stereotype.Service;
import com.example.Backend_Civa.Repository.BusRepository;

import java.util.List;

@Service
public class BusService {

    private final BusRepository busRepository;
    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }
    public List<Bus> listarBuses() {
        return busRepository.findAll();
    }
    public Bus obtenerBusPorId(Long id) {
        return busRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bus no encontrado"));
    }


}

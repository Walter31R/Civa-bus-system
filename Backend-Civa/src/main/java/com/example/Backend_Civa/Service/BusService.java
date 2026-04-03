package com.example.Backend_Civa.Service;

import com.example.Backend_Civa.Model.Bus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import com.example.Backend_Civa.Repository.BusRepository;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BusService {

    private final BusRepository busRepository;
    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    public Page<Bus> listarBuses(Pageable pageable) {
        return busRepository.findAll(pageable);
    }

    public Bus obtenerBusPorId(Long id) {
        return busRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Bus no encontrado"
                ));
    }


}

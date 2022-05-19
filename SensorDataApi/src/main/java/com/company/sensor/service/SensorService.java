package com.company.sensor.service;

import com.company.sensor.model.Sensor;
import com.company.sensor.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    @Autowired
    private SensorRepository repository;

    public Sensor addData(Sensor sensor) {
        return repository.save(sensor);
    }

    public List<Sensor> findAll() {
        return repository.findAll();
    }

    public Sensor update(Sensor sensor) {
        return repository.save(sensor);
    }

    public void deleteData(Integer alertId) {
        repository.deleteById(alertId);
    }

    /*public Sensor getDataById(Integer alertId) {
        return repository.getById(alertId);
    }*/
}

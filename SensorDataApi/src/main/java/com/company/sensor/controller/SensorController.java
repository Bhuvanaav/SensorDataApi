package com.company.sensor.controller;

import com.company.sensor.model.Sensor;
import com.company.sensor.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alert")
public class SensorController {

    @Autowired
    private SensorService service;

    @PostMapping("/add")
    public Sensor addSensorData(@RequestBody Sensor sensor) {
        return service.addData(sensor);
    }

    @GetMapping("/show")
    public List<Sensor> getAllSensorData() {
        return service.findAll();
    }

    @PostMapping("/edit/{alertId}")
    public Sensor updateData(@PathVariable("alertId") Integer alertId, @RequestBody Sensor sensor) {
        return service.update(sensor);
    }

    @DeleteMapping("/delete/{alertId}")
    public ResponseEntity delete(@PathVariable Integer alertId) {
        service.deleteData(alertId);
        return new ResponseEntity("Data deleted successfully!!!", HttpStatus.OK);
    }
    /*@GetMapping("/show/{alertId}")
    public Sensor showDataById(@PathVariable Integer alertId, Model model) {
        Sensor sensor = service.getDataById(alertId);
        return sensor;
    }*/
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.lo54.service;

import com.utbm.lo54.entity.Location_course;
import com.utbm.lo54.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service de fonction pour les lieux
 * @author jnoblat
 */
@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    /**
     * La liste de tous les lieux
     * @return la liste des lieux
     */
    public Iterable<Location_course> getAllLocation(){
        return locationRepository.findAll();
    }

}
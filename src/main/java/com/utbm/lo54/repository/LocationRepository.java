/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.lo54.repository;

import com.utbm.lo54.entity.Location_course;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jnoblat
 */
public interface LocationRepository extends CrudRepository<Location_course, String> {
}
package com.apolo.springdb.repositorios;

import com.apolo.springdb.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository <Empleado, Integer> {
}


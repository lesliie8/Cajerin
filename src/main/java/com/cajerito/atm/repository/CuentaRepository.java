package com.cajerito.atm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cajerito.atm.entity.Cliente;
import com.cajerito.atm.entity.Cuenta;

public interface CuentaRepository extends JpaRepository<Cuenta , Long> {
    Optional<Cuenta> findByNumero(String numero);
    List<Cuenta> findByCliente(Cliente cliente);

}
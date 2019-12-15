package mx.com.cetech.spring.proyecto.inventario.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.cetech.spring.proyecto.inventario.model.entity.Roles;

@Repository
public interface IRoleRepository extends JpaRepository<Roles, Long> {

}

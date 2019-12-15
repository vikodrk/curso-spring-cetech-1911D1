package mx.com.cetech.spring.proyecto.inventario.data.dao;

import org.springframework.stereotype.Repository;

import mx.com.cetech.spring.proyecto.inventario.data.base.IBaseNonAdministrableDAO;
import mx.com.cetech.spring.proyecto.inventario.model.entity.Roles;

@Repository
public interface IRoleDAO extends IBaseNonAdministrableDAO<Roles, Long> {

}

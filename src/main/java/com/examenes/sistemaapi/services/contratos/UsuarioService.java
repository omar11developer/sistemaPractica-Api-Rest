package com.examenes.sistemaapi.services.contratos;

import com.examenes.sistemaapi.models.entity.Usuario;
import com.examenes.sistemaapi.models.entity.UsuarioRol;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuariosRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);




}

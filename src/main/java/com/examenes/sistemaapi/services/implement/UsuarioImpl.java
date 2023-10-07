package com.examenes.sistemaapi.services.implement;

import com.examenes.sistemaapi.models.entity.Usuario;
import com.examenes.sistemaapi.models.entity.UsuarioRol;
import com.examenes.sistemaapi.repositories.RolRepository;
import com.examenes.sistemaapi.repositories.UsuarioRepository;
import com.examenes.sistemaapi.services.contratos.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsuarioImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuariosRoles) throws Exception {
        Usuario usuarioLoca = usuarioRepository.findByUsername(usuario.getUsername());
        if(usuarioLoca != null){
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya esta presente");
        }else{
            for(UsuarioRol usuarioRol:usuariosRoles){
                rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuariosRoles);
            usuarioLoca= usuarioRepository.save(usuario);
        }
        return usuarioLoca;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }
}

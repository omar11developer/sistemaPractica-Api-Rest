package com.examenes.sistemaapi.controllers;

import com.examenes.sistemaapi.models.entity.Rol;
import com.examenes.sistemaapi.models.entity.Usuario;
import com.examenes.sistemaapi.models.entity.UsuarioRol;
import com.examenes.sistemaapi.services.contratos.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) throws Exception {
        Set<UsuarioRol> roles = new HashSet<>();
        Rol rol = new Rol();
        rol.setRolId(2L);
        rol.setNombre("NORMAL");

        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);

        return  usuarioService.guardarUsuario(usuario,roles);
        
    }
    @GetMapping("/{username}")
    public Usuario obtenerUsuario(@PathVariable("username") String username ){
        return usuarioService.obtenerUsuario(username);
    }
    @DeleteMapping("/{usuarioId}")
    public void EliminarUsuario(@PathVariable("usuarioId") Long usuarioId){
        usuarioService.eliminarUsuario(usuarioId);
    }

}

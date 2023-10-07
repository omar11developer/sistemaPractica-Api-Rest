package com.examenes.sistemaapi;

import com.examenes.sistemaapi.models.entity.Rol;
import com.examenes.sistemaapi.models.entity.Usuario;
import com.examenes.sistemaapi.models.entity.UsuarioRol;
import com.examenes.sistemaapi.services.contratos.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaApiApplication {
    @Autowired
   // private UsuarioService usuarioService;
    public static void main(String[] args) {
        SpringApplication.run(SistemaApiApplication.class, args);
    }
    /*
    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setNombre("Omar");
        usuario.setApellido("Menjivar");
        usuario.setUsername("omar");
        usuario.setPassword("pass123");
        usuario.setEmail("omar@gmail.com");
        usuario.setTelefono("23432345");
        usuario.setPerfil("foto.png");

        Rol rol = new Rol();
        rol.setRolId(1L);
        rol.setNombre("ADMIN");

        Set<UsuarioRol> usuarioRoles = new HashSet<>();
        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setRol(rol);
        usuarioRol.setUsuario(usuario);

        usuarioRoles.add(usuarioRol);

        Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
        System.out.println(usuarioGuardado.getUsername());

    }*/
}

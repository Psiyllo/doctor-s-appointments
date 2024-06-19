package com.example.demo.consultasmedicas.controller;

import com.example.demo.consultasmedicas.model.Usuario;
import com.example.demo.consultasmedicas.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public Usuario obterUsuarioPorId(@PathVariable Long id) {
        return usuarioService.obterUsuarioPorId(id);
    }

    @GetMapping
    public List<Usuario> obterTodosUsuarios() {
        return usuarioService.obterTodosUsuarios();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        return usuarioService.atualizarUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        usuarioService.deletarUsuario(id);
    }
}

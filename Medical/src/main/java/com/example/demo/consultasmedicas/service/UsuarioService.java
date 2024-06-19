package com.example.demo.consultasmedicas.service;

import com.example.demo.consultasmedicas.model.Usuario;
import com.example.demo.consultasmedicas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario) {
        // Implemente a lógica para criar um usuário
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> obterUsuarioPorId(Long id) {
        // Implemente a lógica para obter um usuário por ID
        return usuarioRepository.findById(id);
    }

    public List<Usuario> obterTodosUsuarios() {
        // Implemente a lógica para obter todos os usuários
        return usuarioRepository.findAll();
    }

    public Usuario atualizarUsuario(Long id, Usuario usuario) {
        // Implemente a lógica para atualizar um usuário por ID
        if (usuarioRepository.existsById(id)) {
            usuario.setId(id);
            return usuarioRepository.save(usuario);
        } else {
            throw new RuntimeException("Usuário não encontrado com o ID: " + id);
        }
    }

    public void deletarUsuario(Long id) {
        // Implemente a lógica para deletar um usuário por ID
        usuarioRepository.deleteById(id);
    }
}

package com.example.demo.consultasmedicas.service;

import com.example.demo.consultasmedicas.model.Usuario;
import com.example.demo.consultasmedicas.repository.UsuarioRepository;
import com.example.demo.consultasmedicas.util.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Optional<Usuario> obterUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public List<Usuario> obterTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizarUsuario(Long id, Usuario usuario) {
        Usuario usuarioExistente = usuarioRepository.findById(id)
                .orElseThrow(() -> new CustomException("Usuário não encontrado com id: " + id));
        usuarioExistente.setNome(usuario.getNome());
        usuarioExistente.setEmail(usuario.getEmail());
        usuarioExistente.setSenha(usuario.getSenha());
        return usuarioRepository.save(usuarioExistente);
    }

    public void deletarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}

package com.generation.blogPessoal.service;

    
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
	import org.springframework.stereotype.Service;

	import com.generation.blogPessoal.model.Usuario;
	import com.generation.blogPessoal.repository.UsuarioRepository;

	@Service
	public class UsuarioService {

		@Autowired
		private UsuarioRepository repository;
		
		public Usuario cadastrarUsuario(Usuario usuario) {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			return usuario;
}}

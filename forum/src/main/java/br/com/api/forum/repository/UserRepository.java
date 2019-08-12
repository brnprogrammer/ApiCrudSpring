package br.com.api.forum.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.forum.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findByEmail(String email);
	
}

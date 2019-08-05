package br.com.api.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	List<Topico> findByCursoNome(String nomeCurso);
	
	//@Query("SELECT t from Topico WHERE t.curso.nome = :nomeCurso")
	//List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso); // forma alternativa de fazer querys sem o padrao de nomenclatura da JPA

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.main.biblioteca.repository;

/**
 *
 * @author Aluno
 */
import com.main.biblioteca.model.LivroDTO;
import com.main.biblioteca.model.UsuarioDTO;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioDTO, Integer>{
    //Teste = Retirar 
    //@Query("select u from UsuarioDTO u where u.email = ?1 and u.senha = ?2")
    //UsuarioDTO findbyEmailAndSenha(String email, String senha);
    
    //Inner Join Fetch
    @Query("SELECT u FROM usuario INNER JOIN FETCH u.categoria ")
    List<LivroDTO> emprestimos(); //admin emprestims ja feitos

    @Query("SELECT l from LivroDTO where l.id = ? ")
    List<LivroDTO> empIdLogado(); // usuarioLogado
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.main.biblioteca.repository;

import com.main.biblioteca.model.EmprestimoDTO;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Aluno
 */
@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoDTO, Integer>{
    
    Optional<EmprestimoDTO> findByLivroIdAndUsuarioIdAndDataDevolucaoIsNull
    (Integer livroId, Integer usuarioId);
    
    
    
   
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Date;

/**
 *
 * @author Aluno
 */
@Entity
@Table (name = "emprestimo")
public class EmprestimoDTO {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    
    private int id;
    //Column abaico para nomes diferentes do Banco
    @Column(name = "data_retirada")
    private Date dataRetirada;
    @Column(name = "data_devolucao")
    private Date dataDevolucao;
    
    @ManyToOne
    
    @JoinColumn( name = "livro", referencedColumnName = "id", nullable = false)
    
    private LivroDTO livro;
    
    @ManyToOne
    @JoinColumn( name = "usuario", referencedColumnName = "id", nullable = false)
    private UsuarioDTO usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LivroDTO getLivro() {
        return livro;
    }

    public void setLivro(LivroDTO livro) {
        this.livro = livro;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }
    
    
}

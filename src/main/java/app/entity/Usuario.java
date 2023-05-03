
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela tb_usuario
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"tb_usuario\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Usuario")
public class Usuario implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * @generated
    */
    @Column(name = "Sobrenome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String Sobrenome;


    /**
    * @generated
    */
    @Column(name = "RG", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String RG;


    /**
    * @generated
    */
    @Column(name = "CPF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String CPF;


    /**
    * Construtor
    * @generated
    */
    public Usuario(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Usuario setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Usuario setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém Sobrenome
    * return Sobrenome
    * @generated
    */
    public java.lang.String getSobrenome() {
        return this.Sobrenome;
    }

    /**
    * Define Sobrenome
    * @param Sobrenome Sobrenome
    * @generated
    */
    public Usuario setSobrenome(java.lang.String Sobrenome) {
        this.Sobrenome = Sobrenome;
        return this;
    }
    /**
    * Obtém RG
    * return RG
    * @generated
    */
    public java.lang.String getRG() {
        return this.RG;
    }

    /**
    * Define RG
    * @param RG RG
    * @generated
    */
    public Usuario setRG(java.lang.String RG) {
        this.RG = RG;
        return this;
    }
    /**
    * Obtém CPF
    * return CPF
    * @generated
    */
    public java.lang.String getCPF() {
        return this.CPF;
    }

    /**
    * Define CPF
    * @param CPF CPF
    * @generated
    */
    public Usuario setCPF(java.lang.String CPF) {
        this.CPF = CPF;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Usuario object = (Usuario)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}
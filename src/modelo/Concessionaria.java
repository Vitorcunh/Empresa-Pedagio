package modelo;

import java.util.Set;

public class Concessionaria {
  
    private Concessionaria concessionaria;
    private String nome;
    private Set<Praca> praças;
    private Double totalRecebido;

    public Concessionaria getConcessionaria() {
    	return this.concessionaria;
    }
    public void setConcessionaria(Concessionaria concessionaria) {
    	this.concessionaria = concessionaria;
    }


    public String getNome() {
    	return this.nome;
    }
    public void setNome(String nome) {
    	this.nome = nome;
    }


    public Set<Praca> getPraças() {
    	return this.praças;
    }
    public void setPraças(Set<Praca> praças) {
    	this.praças = praças;
    }


    public Double getTotalRecebido() {
    	return this.totalRecebido;
    }
    public void setTotalRecebido(Double totalRecebido) {
    	this.totalRecebido = totalRecebido;
    }

}

package modelo;


import java.util.HashSet;
import java.util.Set;

public class Concessionaria {
  
    private String nome;
    private Set<Praca> pracas = new HashSet();
    private Double totalRecebido;
    private Concessionaria concessionaria;
   
        
            @SuppressWarnings("unused")
            public Concessionaria (int i, int j) {
                
            }
        
            public Concessionaria (String nome) {
                this.nome = nome;
                this.totalRecebido = 0.0;
                this.pracas = new HashSet();
        }
    
        public Concessionaria(Double totalRecebido) {
            this.totalRecebido = totalRecebido;
        }
    
        public Concessionaria (String nome, int totalRecebido) {
            this.nome = nome;
            this.totalRecebido = (double) totalRecebido;
        }
    
    
        public Concessionaria getConcessionaria() {
            return this.getConcessionaria();
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


    public Set<Praca> getPracas() {
    	return this.pracas;
    }


    public Double getTotalRecebido() {
    	return this.totalRecebido;
    }
    public void setTotalRecebido(Double totalRecebido) {
    	this.totalRecebido = totalRecebido;
    }

    public void adicionarPraca(Praca praca) {
        this.pracas.add(praca);
        this.totalRecebido = 0.0;
        for(Praca p : this.pracas) {
             this.totalRecebido = this.totalRecebido + p.getTotalRecebido();
        }
    }

    public void limparPracas() {
        this.pracas = new HashSet();
        
    }
}

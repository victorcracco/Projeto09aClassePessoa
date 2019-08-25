
package projeto09aclassepessoa;

/*
 @author Victor Cracco
 */
public class Pessoa {
    
    
     private int codPessoa;
     private String nome;
     private String celular;
     private String email;
     private String endereco;
    
    public Pessoa (){
    }
public Pessoa(int codPessoa, String nome, String celular, 
        String email, String endereco){
        this.codPessoa = codPessoa;
        this.nome = nome;
        this.celular= celular;
        this.email = email;
        this.endereco = endereco;    
        
       }
       
       public int getcodPessoa(){
        return this.codPessoa;
    }
    
    public void setcodPessoa(int codPessoa){
        this.codPessoa = codPessoa;
    }
    
    public String getnome(){
        return this.nome;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public String getcelular(){
        return this.celular;
    }
    
    public void setcelular(String celular){
        this.celular = celular;
    }
    
     public String getemail(){
        return this.email;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    
     public String getendereco(){
        return this.endereco;
    }
    
    public void setendereco(String endereco){
        this.endereco = endereco;
    }
}


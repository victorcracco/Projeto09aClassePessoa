package projeto09aclassepessoa;

/**
 * @author Victor Cracco
 */
public class Projeto09aClassePessoa {

    
    
    public static void main(String[] args) {
        
        //ObjetoPessoa
        System.out.println("Pessoa 1");
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setcodPessoa(1);
        pessoa1.setnome("Marcelo Yago Cauã Oliveira");
        pessoa1.setcelular("4699104-8034");
        pessoa1.setemail("marceloyagocauaoliveira_@marcofaria.com");
        pessoa1.setendereco("Avenida Pedro Amaro dos Santos 585");
        
        System.out.println("Código Pessoa: "+pessoa1.getcodPessoa());
        System.out.println("Nome Pessoa: "+pessoa1.getnome());
        System.out.println("Celular Pessoa: "+pessoa1.getcelular());
        System.out.println("Email Pessoa: "+pessoa1.getemail());
        System.out.println("Endereço Pessoa: "+pessoa1.getendereco());   

        System.out.println("-------------------------------------------------------------\n\n");      
        
        //0bjetoPessoa2
        System.out.println("Pessoa 2"); 
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setcodPessoa(2);
        pessoa2.setnome("Thales Fernando Ian Brito");
        pessoa2.setcelular("4699973-5486");
        pessoa2.setemail("thalesfernandoianbrito_@vnews.com.br");
        pessoa2.setendereco("Avenida Pedro Amaro dos Santos 585");
        
        System.out.println("Código Pessoa: "+pessoa2.getcodPessoa());
        System.out.println("Nome Pessoa: "+pessoa2.getnome());
        System.out.println("Celular Pessoa: "+pessoa2.getcelular());
        System.out.println("Email Pessoa: "+pessoa2.getemail());
        System.out.println("Endereço Pessoa: "+pessoa2.getendereco());         
    
        
        System.out.println("-------------------------------------------------------------\n\n");   
        
        //ObjetoPessoa 3
        System.out.println("Pessoa 3"); 
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setcodPessoa(3);
        pessoa3.setnome("Iago Miguel César Bernardes");
        pessoa3.setcelular("4698875-1336");
        pessoa3.setemail("iagomiguelcesarbernardes@outlook.com");
        pessoa3.setendereco("Avenida Pedro Amaro dos Santos 585");
        
        System.out.println("Código Pessoa: "+pessoa3.getcodPessoa());
        System.out.println("Nome Pessoa: "+pessoa3.getnome());
        System.out.println("Celular Pessoa: "+pessoa3.getcelular());
        System.out.println("Email Pessoa: "+pessoa3.getemail());
        System.out.println("Endereço Pessoa: "+pessoa3.getendereco());   
        
        System.out.println("-------------------------------------------------------------\n\n");         
        
        //ObjetoPessoa 4
        System.out.println("Pessoa 4");      
        Pessoa pessoa4 = new Pessoa();
        pessoa4.setcodPessoa(4);
        pessoa4.setnome("Oliver Ryan Drumond");
        pessoa4.setcelular("462656-9319");
        pessoa4.setemail("oliverryandrumond@csa.edu.br");
        pessoa4.setendereco("Avenida Pedro Amaro dos Santos 585");
        
        System.out.println("Código Pessoa: "+pessoa4.getcodPessoa());
        System.out.println("Nome Pessoa: "+pessoa4.getnome());
        System.out.println("Celular Pessoa: "+pessoa4.getcelular());
        System.out.println("Email Pessoa: "+pessoa4.getemail());
        System.out.println("Endereço Pessoa: "+pessoa4.getendereco()); 
        
        System.out.println("-------------------------------------------------------------\n\n"); 
    }
    
}

package televisao;

public class Ator {
   // Nome, data de nascimento, quantidade de novelas que trabalhou, email, nome artístico, Salário mensal, cachê por participação em evento, nome 
     //       artístico, cidade, endereço, bairro e estado.
    private String nome;
    private String data;
    private String nomeArtistico;
    private String email;
    private String cidade;
    private String estado;
    private String endereco;
    private String bairro;
    private int qtdNvoelas;
    private double salarioMensal;
    private double cache;
    
    public String getNome ()
    {
        return this.nome;
    }
    
    public void setNome (String nome)
    {
        this.nome = nome;
    }
    
   public void setData (String data)
    {
        this.data = data;
    }
   
   public String geData ()
    {
        return this.data;
    }
   
   public void setNomeArtistico (String nomeArtistico)
    {
        this.nomeArtistico = nomeArtistico;
    }
    
    public String getNomeArtistico ()
    {
        return this.nomeArtistico;
    }
    
    public void setEmail (String email)
    {
        this.email = email;
    }
    
    public String getEmail ()
    {
        return this.email;
    }
    
     public void setCidade (String cidade)
    {
        this.cidade = cidade;
    }
    
    public String getCidade ()
    {
        return this.cidade;
    }
    
    public void setEstado (String estado)
    {
        this.estado = estado;
    }
    
    public String getEstado ()
    {
        return this.estado;
    }
    
    public void setEndereco (String endereco)
    {
        this.endereco = endereco;
    }
    
    public String getEndereco ()
    {
        return this.endereco;
    }
   
    public void setBairro (String bairro)
    {
        this.bairro = bairro;
    }
    
    public String getBairro ()
    {
        return this.bairro;
    }
   
    public void setQtdNovelas (int qtdNovelas)
    {
        this.qtdNvoelas = qtdNovelas;
    }
    
    public int getQtdNovelas ()
    {
        return this.qtdNvoelas;
    }
    
    public void setSalarioMensal (double salarioMensal)
    {
        this.salarioMensal = salarioMensal;
    }
    
    public double getSalarioMensal ()
    {
        return this.salarioMensal;
    }
    public void setCache (double cache)
    {
        this.cache = cache;
    }
    public double getCache ()
    {
        return this.cache;
    }
    
    public String obterStatus(int novelas, double salario)
    {
        if (novelas  < 4 && salario < 5000.0)
        {
            return "Calouro";
        }
        
        if (novelas < 7)
        {
            return "Revelacao";
        }
        
        if (novelas < 7 && salario > 30000.0 )
        {
            return "Joias";
        }
        
        if (novelas > 9 && salario < 30000.0)
        {
            return "Elenco de apoio";
        }
        
        if (salario >= 30000.0 && salario < 10000.1 )
        {
            return "Elenco principal";
        }
        
        if (salario > 100000)
        {
            return "Estrela";
        }
        
        else
        {
            return "Elenco regular";
        }
        
       
    }
    //  Criar um método para calcular os ganhos mensais do ator. Para isso devemos receber a quantidade de eventos que o ator participou no mês e 
    // retornar os ganhos totais daquele ator considerando o salario e cachê por evento.
    
    public Double calcularGanhos(Integer numeroEventos)
    {
        double total;
        total = this.salarioMensal + (this.cache * numeroEventos);
        return total;    
    }
    
    
	


    

    
}


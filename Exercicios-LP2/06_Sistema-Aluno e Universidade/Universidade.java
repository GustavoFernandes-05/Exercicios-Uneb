public class Universidade
{
    private String nome, cnpj, telefone;
    public Universidade(String nome, String cnpj, String telefone)
    {
       this.nome=nome;
       this.cnpj=cnpj;
       this.telefone=telefone;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    public String getCnpj(String cnpj)
    {
        return cnpj;
    }
    
    public String getTelefone(String telefone)
    {
        return telefone;
    }
    public void setTelefone()
    {
        this.telefone=telefone;
    }
}


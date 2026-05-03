public class Aluno
{
    private String nome, matricula, departamento, turno;
    private float renda;
    private Universidade universidade;

    public Aluno(String nome, String matricula, String departamento, String turno,float renda, Universidade universidade)
    {
        this.nome=nome;
        this.matricula=matricula;
        this.departamento=departamento;
        this.turno=turno;
        this.renda=renda;
        this.universidade=universidade;
        
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    public String getMatricula()
    {
        return matricula;
    }
    public void setMatricula(String matricula)
    {
        this.matricula=matricula;
    }
    public String getDepartamento()
    {
        return departamento;
    }
    public void setSala(String Departamento)
    {
        this.departamento=departamento;
    }public String getTurno()
    {
        return turno;
    }
    public void setTurno(String turno)
    {
        this.turno=turno;
    }
    public float getRenda()
    {
        return renda;
    }
    public void setRenda(float renda)
    {
        this.renda=renda;
    }
   public void imprimir()
   {
     System.out.println(" --Dados do aluno-- " + this.getNome());
     System.out.println("Instituto de ensino-->" + this.universidade.getNome());
     System.out.println("Departamento do Aluno-->" + this.getDepartamento());
     System.out.println("Turno do Aluno-->" + this.getTurno());
     System.out.println("Matricula do Aluno-->" + this.getMatricula());
      if(this.renda>1420)
    {
     System.out.println("Renda não permitida para bolsa");
    }
    else
    {
        System.out.println("Aluno tem direito a bolsa");
    }
     
    }
}
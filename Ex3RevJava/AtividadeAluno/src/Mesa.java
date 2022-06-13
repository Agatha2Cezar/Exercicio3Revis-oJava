package AtividadeAluno;

public class Mesa{
  private String nomeGarcom;
  private boolean aberta;
  private Conta conta;

  public Mesa(){
    
  }
    public boolean getAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getGarcom() {
        return nomeGarcom;
    }

    public void setGarcom(String garcom) {
        this.nomeGarcom = garcom;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

  }
}
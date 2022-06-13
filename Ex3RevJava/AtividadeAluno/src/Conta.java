package AtividadeAluno;
import java.util.ArrayList;
import java.util.Iterator;

public class Conta {
    private ArrayList<String>pratos;
    private double valor;
    private int quantidade;

    public Conta(){
      pratos = new ArrayList<>();
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Conta(String pratos) {
        this.pratos = new ArrayList<>();
        this.valor = valor;
    }
    
    public void atualizarValor(double valor){
          this.valor += valor;
    }
  
    public void adicionarPedido(String prato, double valor, int quantidade) {
        pratos.add(prato);
        pratos.add(quantidade);
     atualizarValor(valor*quantidade);
    } 
  
    public void atualizaValor(double valor, int quantidade){
      this.valor += valor;
  }
    public void mostrarPratos(){
      Iterator<String> it = pratos.iterator();
      while(it.hasNext()){
        System.out.println(it.next());
      }
      
    }
}
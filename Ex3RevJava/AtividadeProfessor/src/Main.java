public class Main {
    public static void main(String[] args) throws Exception {
       // Criando um Membro

    Membro membro1 =  new Membro("Luiz", "BP", 458765);
    System.out.println(membro1);

    Membro membro2 =  new Membro("Luciano", "BP", 654215);
    System.out.println(membro1);

    Membro membro3 =  new Membro("Talita", "BP", 878954);
    System.out.println(membro1);

      //Criando uma nova Comissão
      Comissao comissaoCEIC =  new Comissao("Portaria nº 8081 de 23 de Maio de 2020");

      //Adicionando Membros na comissão
      comissaoCEIC.adicionarMembro(membro1);
      comissaoCEIC.adicionarMembro(membro2);
      comissaoCEIC.adicionarMembro(membro3);

     //Busca um membro pelo nome
     System.out.println(comissaoCEIC.buscarMembroPeloNome("Talita"));

     //Listar todos os membros da CEIC
     comissaoCEIC.listarTodosMembros();
    }
}

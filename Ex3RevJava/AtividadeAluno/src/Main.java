public class Main {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);

       int opcao = 0;

       Restaurante restaurante1 = restaurante();
       Mesa mesa1 = new Mesa();
       Conta conta1 = new Conta();


       restaurante1.adicionarPrato("Macarronada", 15);
       restaurante1.adicionarPrato("Feijoada", 20);
       restaurante1.adicionarPrato("Arroz Carreteiro", 20);

       mesa1.setGarcom("joão");
       mesa1.setConta(conta1);
       mesa1.setAberta(true);
       restaurante.adicionarMesa(mesa1);

       conta1.adicionarPedido("Feijoada", 20, 2);
       
       do {
        System.out.println(
                "1 - Fazer pedido;\n2 - verificar mesas abertas;\n3 - pedir conta;\n4 - Sair.");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
            restaurante1.pesquisarPrato("Prato 1");
                break;
            case 2:
            restaurante1.mesaIsDisponivel(mesa1);
                
                break;
            case 3:
            restaurante1.solicitarConta(conta1);
                break;
        }
        
    } while (opcao != 4);
    if(opcao==4){
        System.out.println("\nObrigada pela Preferência!");
    }
    entrada.close();
}
}
    }
}

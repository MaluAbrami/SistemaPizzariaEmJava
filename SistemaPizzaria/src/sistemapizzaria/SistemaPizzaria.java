package sistemapizzaria;

import Dao.DaoPizza;
import Dao.DaoPedido;
import Dao.DaoDiaTrabalho;
import java.util.List;

public class SistemaPizzaria {

    public static void main(String[] args) {
        DaoPizza daoPizza = new DaoPizza();
        DaoPedido daoPedido = new DaoPedido();
        DaoDiaTrabalho daoDiaTrabalho = new DaoDiaTrabalho();
        
        Pizza calabresa = new Calabresa(1, "Calabresa", 35.0, List.of("Calabresa", "Cebola", "Mussarela", "Catupiry"));
        Pizza caipira = new Caipira(2, "Caipira", 40.0, List.of("Frango", "Catupiry", "Milho", "Mussarela"));
        Pizza quatroQueijos = new QuatroQueijos(3, "Quatro Queijos", 42.0, List.of("Mussarela", "Parmesao", "Provolone", "Gorgonzola"));
        
        daoPizza.adicionarPizza(calabresa);
        daoPizza.adicionarPizza(caipira);
        daoPizza.adicionarPizza(quatroQueijos);
        System.out.println(daoPizza.listAll());
        
        Endereco enderecoC1 = new Endereco("rua A", 10, "bairro A", "18205-123");
        Cliente c1 = new Cliente(1, "Maria", "18-993475860", List.of(enderecoC1));
        
        Pedido p1 = new Pedido(1, c1, List.of(calabresa, caipira), enderecoC1, "Nada");
        daoPedido.adicionarPedido(p1);
        System.out.println(daoPedido.listAll());
        Pedido p2 = new Pedido(2, c1, List.of(quatroQueijos), enderecoC1, "Pegar leve na gorgonzola");
        daoPedido.adicionarPedido(p2);
        System.out.println(daoPedido.listAll());
        
        Pizza novaCalabresa = new Calabresa(1, "Calabresa", 30.0, List.of("Calabresa", "Cebola", "Mussarela", "Catupiry"));
        daoPizza.atualizarPizza(novaCalabresa);
        System.out.println(daoPizza.listAll());
        
        DiaTrabalho dia1 = new DiaTrabalho(1, "01/01/2024", List.of(p1, p2));
        daoDiaTrabalho.adicionarDiaTrabalho(dia1);
        System.out.println(daoDiaTrabalho.listAll());
        
        daoPizza.delete(caipira);
        System.out.println(daoPizza.listAll());
        
        daoPedido.delete(p1);
        System.out.println(daoPedido.listAll());
        
        daoDiaTrabalho.delete(dia1);
        System.out.println(daoDiaTrabalho.listAll());
    }
    
}

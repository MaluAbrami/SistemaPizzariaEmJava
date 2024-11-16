package Dao;

import java.util.ArrayList;
import java.util.List;
import sistemapizzaria.Pizza;

public class DaoPizza {
    private List<Pizza> pizzas = new ArrayList();
    
    public void adicionarPizza(Pizza p){
        pizzas.add(p);
    }
    
    public Pizza procurarPorId(int id){
        for(Pizza p: pizzas){
            if(p.getId() == id)
                return p;
        }
        return null;
    }
    
    public boolean atualizarPizza(Pizza novaPizza){
        for (int i = 0; i < pizzas.size(); i++) {
            if (pizzas.get(i).getId() == novaPizza.getId()) {
                pizzas.set(i, novaPizza);
                System.out.println("Pizza atualizada: " + novaPizza.getClass().getSimpleName());
                return true;
            }
        }
        System.out.println("Pizza não encontrada para atualização com o ID: " + novaPizza.getId());
        return false;
    }
    
    public boolean delete(Pizza p){
        Pizza p_aux = procurarPorId(p.getId());
        
        if(p_aux != null){
            pizzas.remove(p_aux);
            return true;
        }
        return false;
    }
    
    public String listAll(){
        StringBuilder report = new StringBuilder();
        
        if (pizzas.isEmpty()) {
            return "Nenhuma pizza cadastrada.";
        }
        
        for (Pizza p : pizzas) {
            report.append("ID: ").append(p.getId())
                  .append("; Nome: ").append(p.getNome())
                  .append("; Ingredientes: ").append(p.getIngredientes())
                  .append("; Valor: R$").append(p.getValor())
                  .append("\n");
        }
        
        return report.toString();

    }
}

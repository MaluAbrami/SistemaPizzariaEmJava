package Dao;

import java.util.ArrayList;
import java.util.List;
import sistemapizzaria.DiaTrabalho;
import sistemapizzaria.Pedido;

public class DaoDiaTrabalho {
    private List<DiaTrabalho> diasDeTrabalho = new ArrayList();
    
    public void adicionarDiaTrabalho(DiaTrabalho d){
        diasDeTrabalho.add(d);
    }
    
    public DiaTrabalho procurarPorId(int id){
        for(DiaTrabalho d: diasDeTrabalho){
            if(d.getId() == id)
                return d;
        }
        return null;
    }
    
    public void atualizarDiaTrabalho(){
        
    }
    
    public boolean delete(DiaTrabalho d){
        DiaTrabalho d_aux = procurarPorId(d.getId());
        
        if(d_aux != null){
            diasDeTrabalho.remove(d_aux);
            return true;
        }
        return false;
    }
    
    public String listAll(){
    StringBuilder report = new StringBuilder();
    
    // Verifica se a lista está vazia
    if (diasDeTrabalho.isEmpty()) {
        return "Nenhum dia de trabalho cadastrado.";
    }
    
    for (DiaTrabalho d : diasDeTrabalho) {
        report.append("ID: ").append(d.getId())
              .append(", Data: ").append(d.getData())
              .append(", Pedidos: ").append(d.getPedidos().size())
              .append(", Faturamento: R$").append(d.getFaturamento())
              .append("\n");
    }
    
    // Retorna o relatório formatado
    return report.toString();
    }
}

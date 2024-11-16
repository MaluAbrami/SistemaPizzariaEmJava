package sistemapizzaria;

import java.util.List;

public class DiaTrabalho {
    private int id;
    private String data;
    private List<Pedido> pedidos;
    private double faturamento;

    public DiaTrabalho(int id, String data, List<Pedido> pedidos) {
        this.id = id;
        this.data = data;
        this.pedidos = pedidos;
        this.faturamento = calcularFaturamentoDoDia(pedidos);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }
    
    private double calcularFaturamentoDoDia(List<Pedido> pedidos){
        double faturamentoTotal = 0;
        
        for(Pedido p: pedidos){
            faturamentoTotal += p.getValorPedido();
        }
        
        return faturamentoTotal;
    }
}

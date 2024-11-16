package sistemapizzaria;

import java.util.List;

public class Pedido {
    private int id;
    private Cliente cliente;
    private List<Pizza> pizzas;
    private double valorPedido;
    private Endereco enderecoEntrega;
    private String observacao;

    public Pedido(int id, Cliente cliente, List<Pizza> pizzas, Endereco enderecoEntrega, String observacao) {
        this.id = id;
        this.cliente = cliente;
        this.pizzas = pizzas;
        this.valorPedido = calcularValorPedido(pizzas);
        this.enderecoEntrega = enderecoEntrega;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valor) {
        this.valorPedido = valor;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    private double calcularValorPedido(List<Pizza> pizzas){
        double valorTotal = 0;
        
        for(Pizza p: pizzas){
            valorTotal += p.getValor();
        }
        
        return valorTotal;
    }
}

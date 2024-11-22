package sistemapizzaria;

import java.util.List;

public abstract class Pizza {
    private int id;
    private String nome;
    private double valor;
    private List<String> ingredientes;

    public Pizza(int id, String nome, double valor, List<String> ingredientes) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
}

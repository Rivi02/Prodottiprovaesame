package org.example;
public class Product {
    int id;
    String nome;
    Double prezzo;
    int quantità;
    public Product(int id, String name, Double prezzo, int quantità) {
        this.id = id;
        this.nome = name;
        this.prezzo = prezzo;
        this.quantità = quantità;
    }
    public String toString() {
        return "\nProdotto{ \n" +
                "id=" + id +'\n'+
                "Nome=" + nome + '\n' +
                "Prezzo=" + prezzo + '\n' +
                "Quantità="+ quantità + '\n' +
                "}" ;
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

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantità() {
        return quantità;
    }

    public void setQuantità(int quantità) {
        this.quantità = quantità;
    }
}

package com.example.listing;

public class Item {

    String name;
    String sinopse, editora, ano;
    int image;

    public Item(String name, String sinopse, String editora, String ano, int image) {
        this.name = name;
        this.sinopse = sinopse;
        this.editora = editora;
        this.ano = ano;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
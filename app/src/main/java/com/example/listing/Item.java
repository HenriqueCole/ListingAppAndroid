package com.example.listing;

import android.net.Uri;

public class Item {

    String name;
    String sinopse, editora, ano;
    Uri image;
    int imagePreview;

    public Item(String name, String sinopse, String editora, String ano, Uri image) {
        this.name = name;
        this.sinopse = sinopse;
        this.editora = editora;
        this.ano = ano;
        this.image = image;
    }


    public Item(String name, String sinopse, String editora, String ano, int imagePreview) {
        this.name = name;
        this.sinopse = sinopse;
        this.editora = editora;
        this.ano = ano;
        this.imagePreview = imagePreview;
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

    public Uri getImage() {
        return image;
    }

    public void setImage(Uri image) {
        this.image = image;
    }

    public int getImagePreview() {
        return imagePreview;
    }

    public void setImagePreview(int imagePreview) {
        this.imagePreview = imagePreview;
    }

}
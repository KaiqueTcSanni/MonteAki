package com.br.monteaki.model;
 
public class Produto {
 
    private Long id;
    private String nomeProduto;
    private int qntProduto;
    private float valorProduto;
    private String descProduto;
 
    public Produto() {
    }
 
    public Produto(Long id, String nomeProduto, int qntProduto, float valorProduto, String descProduto) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.qntProduto = qntProduto;
        this.valorProduto = valorProduto;
        this.descProduto = descProduto;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getNomeProduto() {
        return nomeProduto;
    }
 
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
 
    public int getQntProduto() {
        return qntProduto;
    }
 
    public void setQntProduto(int qntProduto) {
        this.qntProduto = qntProduto;
    }
 
    public float getValorProdtuo() {
        return valorProduto;
    }
 
    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }
 
    public String getDescProduto() {
        return descProduto;
    }
 
    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }
}
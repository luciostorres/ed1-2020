package app.linked_list;

import app.FaixaIp;


public class ItemLista {
    
    private FaixaIp dado;
    private ItemLista prox;

    public FaixaIp getDado() {
        return dado;
    }
    
    public ItemLista moveNext() {
        return prox;
    }
    
    void addItem(ItemLista item) {
        if (prox != null){
            prox.addItem(item);
        }
        else {
            prox = item;
        }
    }
    
    ItemLista(FaixaIp dado){
       this.dado = dado;
    }
}

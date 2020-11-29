package app.linked_list;

import app.FaixaIp;
import app.linked_list.ItemLista;

public class ListaFaixa {
    
    private ItemLista head;  
    
    public void add(FaixaIp item){
        ItemLista itemLista = new ItemLista(item);
        if (head == null){
            head = itemLista;
        }
        else {
            head.addItem(itemLista);
        }
    }

    public ItemLista getFirst() {
        return head;
    }
    
    public boolean isEmpty(){
        return head==null;
    }

}

package br.fastfood.facade;

import br.fastfood.model.Bebida;
import br.fastfood.model.Burger;
import br.fastfood.model.Combo;
import br.fastfood.model.Sobremesa;

public class ComboFacade {
    private Combo combo;

    public Combo criarCombo(int num){
        switch (num){
            case 1:
                Burger burger1 = new Burger("X-Burger", 19.90);
                Bebida bebida1 = new Bebida("Coca-cola", 7.0);
                Sobremesa sobremesa1 = new Sobremesa("Petit Gateou", 14.90);
                combo = new Combo(burger1, bebida1, sobremesa1);
                break;
            case 2:
                Burger burger2 = new Burger("X-Calabresa", 17.90);
                Bebida bebida2 = new Bebida("Coca-cola Zero", 7.0);
                Sobremesa sobremesa2 = new Sobremesa("Pudim", 11.90);
                combo = new Combo(burger2, bebida2, sobremesa2);
                break;
            case 3:
                Burger burger3 = new Burger("X-Salada", 21.90);
                Bebida bebida3 = new Bebida("Guaraná Antarctica", 6.0);
                Sobremesa sobremesa3 = new Sobremesa("Mousse de Chocolate", 10.90);
                combo = new Combo(burger3, bebida3, sobremesa3);
                break;
            default:
                System.out.println("Código de combo inválido, digite um código existente.");
                return null;
        }
        return combo;
    }

    public void exibirItens(){
        if(combo != null){
            System.out.println("=".repeat(15));
            System.out.println("Combo selecionado: ");
            combo.getItens();
        } else {
            System.out.println("Nenhum combo foi criado.");
        }
    }

    public double getPrecoTotal(){
        if(combo != null){
            return combo.getPrecoTotal();
        } else {
            return 0;
        }
    }
}

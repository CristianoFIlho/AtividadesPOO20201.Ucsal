package Views;

import Model.Estabelecimento;
import Controller.Estabelecimento_Controller;

public class Principal {
    public static void main(String[] args) {
        Estabelecimento e1 = new Estabelecimento("Salvador", "Segunda a Sexta", Boolean.TRUE,Boolean.TRUE, 11,"@deliveryburguer", "71988646601",60,LANCHONETE );
        Estabelecimento e2 = new Estabelecimento("Cativis", "Segunda a Sabádo", Boolean.TRUE,Boolean.TRUE, 1-,"@deliverypao", "71988646601",60,PADARIA );
        Estabelecimento e3 = new Estabelecimento("São Paulo", "Segunda a Quinta", Boolean.TRUE,Boolean.TRUE, 12,"@deliverysfarma", "71988646601",60,FARMACIA );
        Estabelecimento e4 = new Estabelecimento("Amargosa", "Segunda a Quarta", Boolean.TRUE,Boolean.TRUE, 13,"@deliverypet", "71988646601",60, PET);


        Lista  Estabelecimento_Controller Estabelecimento  = new Lista();
        ListaEstabelecimentos.getEstabeleciomento().add(t1);
        ListaEstabelecimentos.getEstabeleciomento().add(t2);
        ListaEstabelecimentos.getEstabeleciomento().add(t3);
        ListaEstabelecimentos.getEstabeleciomento().add(t4);

        for (Estabelecimento estabelecimento: ListaEstabelecimentos.getEstabelecimento()) {
            System.out.println(estabelecimento);
        }






    }
}

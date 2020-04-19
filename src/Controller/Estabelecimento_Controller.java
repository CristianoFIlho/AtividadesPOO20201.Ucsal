package Controller;

import Model.Estabelecimento;

import java.util.ArrayList;
import java.util.List;

public class Estabelecimento_Controller {

   private List Estabelecimento = new ArrayList<Estabelecimento>();

    public List getEstabelecimento() {
        return Estabelecimento;
    }

    public adicionarEstabelecimentoPrincipal(String cidade, Integer diasFuncionamento, Boolean retirada, Boolean delivery, Date horarioFuncionamento, String instagram, String whatsapp, Integer tempo_Medio_minutos, EnumCategoria categorias){
        Estabelecimento estabelecimento= new Estabelecimento(cidade,diasFuncionamento,retirada,delivery,horarioFuncionamento,instagram,whatsapp,tempo_Medio_minutos,categorias);
    }

    public void adicionarEstabelecimento(Estabelecimento estabelecimento){
        this.adicionarEstabelecimento.add(estabelecimento);
    }
    public void RemoverEstabelecimento(Estabelecimento estabelecimento){
        this.adicionarEstabelecimento.remove(estabelecimento);
    }

}

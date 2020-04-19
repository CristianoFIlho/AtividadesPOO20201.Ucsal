package Model;

public class Estabelecimento {

    private String Cidade ;
    private Integer DiasFuncionamento;
    private Boolean Retirada;
    private Boolean Delivery;
    private Date HorarioFuncionamento;
    private String Instagram;
    private String Whatsapp;
    private Integer Tempo_Medio_minutos;
    private EnumCategoria categorias;

    public Estabelecimento(String cidade, Integer diasFuncionamento, Boolean retirada, Boolean delivery, Date horarioFuncionamento, String instagram, String whatsapp, Integer tempo_Medio_minutos, EnumCategoria categorias) {
        Cidade = cidade;
        DiasFuncionamento = diasFuncionamento;
        Retirada = retirada;
        Delivery = delivery;
        HorarioFuncionamento = horarioFuncionamento;
        Instagram = instagram;
        Whatsapp = whatsapp;
        Tempo_Medio_minutos = tempo_Medio_minutos;
        this.categorias = categorias;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public Integer getDiasFuncionamento() {
        return DiasFuncionamento;
    }

    public void setDiasFuncionamento(Integer diasFuncionamento) {
        DiasFuncionamento = diasFuncionamento;
    }

    public Boolean getRetirada() {
        return Retirada;
    }

    public void setRetirada(Boolean retirada) {
        Retirada = retirada;
    }

    public Boolean getDelivery() {
        return Delivery;
    }

    public void setDelivery(Boolean delivery) {
        Delivery = delivery;
    }

    public Date getHorarioFuncionamento() {
        return HorarioFuncionamento;
    }

    public void setHorarioFuncionamento(Date horarioFuncionamento) {
        HorarioFuncionamento = horarioFuncionamento;
    }

    public String getInstagram() {
        return Instagram;
    }

    public void setInstagram(String instagram) {
        Instagram = instagram;
    }

    public String getWhatsapp() {
        return Whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        Whatsapp = whatsapp;
    }

    public Integer getTempo_Medio_minutos() {
        return Tempo_Medio_minutos;
    }

    public void setTempo_Medio_minutos(Integer tempo_Medio_minutos) {
        Tempo_Medio_minutos = tempo_Medio_minutos;
    }

    public EnumCategoria getCategorias() {
        return categorias;
    }

    public void setCategorias(EnumCategoria categorias) {
        this.categorias = categorias;
    }

    @Override
    public String toString() {
        return "Estabelecimento{" +
                "Cidade='" + Cidade + '\'' +
                ", DiasFuncionamento=" + DiasFuncionamento +
                ", Retirada=" + Retirada +
                ", Delivery=" + Delivery +
                ", HorarioFuncionamento=" + HorarioFuncionamento +
                ", Instagram='" + Instagram + '\'' +
                ", Whatsapp='" + Whatsapp + '\'' +
                ", Tempo_Medio_minutos='" + Tempo_Medio_minutos + '\'' +
                ", categorias=" + categorias +
                '}';
    }
}

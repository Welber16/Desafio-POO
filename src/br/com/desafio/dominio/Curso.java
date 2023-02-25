package br.com.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public int getCargoHoraria() {
        return cargaHoraria;
     }

    public void setCargoHoraria(int cargoHoraria) {
        this.cargaHoraria = cargoHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargoHoraria=" + cargaHoraria +
                '}';
    }
}

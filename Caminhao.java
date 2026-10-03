// Veículo de grande porte, com quantidade de eixos.
public class Caminhao extends Veiculo {

    private int quantidadeEixos;

    // Cria um caminhão.
    public Caminhao(String placa, double capacidadeKg, int quantidadeEixos) {
        super(placa, capacidadeKg);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }
}
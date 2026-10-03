// Classe base para os veículos de entrega.
public abstract class Veiculo {

    private String placa;
    private double capacidadeKg;

    // Cria um veículo com placa e capacidade.
    protected Veiculo(String placa, double capacidadeKg) {
        this.placa = placa;
        setCapacidadeKg(capacidadeKg);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadeKg() {
        return capacidadeKg;
    }

    // Bloqueia capacidade negativa ou zero.
    public void setCapacidadeKg(double capacidadeKg) {
        if (capacidadeKg <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero.");
        }
        this.capacidadeKg = capacidadeKg;
    }
}
// Veículo de pequeno porte, que pode ter baú.
public class Moto extends Veiculo {

    private boolean possuiBau;

    // Cria uma moto.
    public Moto(String placa, double capacidadeKg, boolean possuiBau) {
        super(placa, capacidadeKg);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }

    public void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }
}
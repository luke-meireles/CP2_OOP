// Liga um pacote a um veículo para fazer a entrega.
public class Rota {

    private Pacote pacote;
    private Veiculo veiculo; // aceita qualquer Veiculo

    // Cria uma rota com um pacote e um veículo.
    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    // Mostra no console o pacote e o veículo da entrega.
    public void executar() {
        System.out.println("Levando pacote " + pacote.getCodigo()
                + " no veiculo " + veiculo.getPlaca());
    }
}
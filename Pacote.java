// Pacote que será entregue.
public class Pacote {

    private String codigo;
    private double pesoKg;
    private String status;

    // Cria um pacote com código e peso.
    public Pacote(String codigo, double pesoKg) {
        this.codigo = codigo;
        this.pesoKg = pesoKg;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public String getStatus() {
        return status;
    }

    // Atualiza o status do pacote.
    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }
}
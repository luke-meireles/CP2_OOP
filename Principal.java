public class Principal {

    public static void main(String[] args) {

        // Capacidade válida
        Veiculo caminhao = new Caminhao("ABC1234", 500.0, 3);
        Veiculo moto = new Moto("XYZ9876", 20.0, true);

        Pacote pacote = new Pacote("BR999", 10.5);
        pacote.atualizarStatus("Pendente");

        // Anteriormente a Rota só aceitava Caminhao. Agora aceita qualquer Veiculo
        new Rota(pacote, caminhao).executar();
        new Rota(pacote, moto).executar();
    }
}
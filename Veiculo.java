public class Veiculo {

    private String nome;
    private String modelo;
    private int quantidadeDePneus;
    private int potencia;
    private boolean ligado;
    private int velocidade;

    public Veiculo(String nome, String modelo, int quantidadeDePneus, int potencia) {
        this.nome = nome;
        this.modelo = modelo;
        this.quantidadeDePneus = quantidadeDePneus;
        this.potencia = potencia;
        this.ligado = false;
        this.velocidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadeDePneus() {
        return quantidadeDePneus;
    }

    public void setQuantidadeDePneus(int quantidadeDePneus) {
        this.quantidadeDePneus = quantidadeDePneus;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(nome + " está ligado.");
        } else {
            System.out.println(nome + " já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            velocidade = 0;
            System.out.println(nome + " está desligado.");
        } else {
            System.out.println(nome + " já está desligado.");
        }
    }

    public void acelerar(int incremento) {
        if (ligado) {
            velocidade += incremento;
            System.out.println(nome + " acelerou para " + velocidade + " km/h.");
        } else {
            System.out.println("Não pode acelerar. " + nome + " está desligado.");
        }
    }

    public void frear(int decremento) {
        if (ligado && velocidade > 0) {
            velocidade -= decremento;
            if (velocidade < 0) {
                velocidade = 0;
            }
            System.out.println(nome + " desacelerou para " + velocidade + " km/h.");
        } else {
            System.out.println(nome + " já está parado ou desligado.");
        }
    }

    public void parar() {
        if (ligado && velocidade > 0) {
            velocidade = 0;
            System.out.println(nome + " parou.");
        } else {
            System.out.println(nome + " já está parado ou desligado.");
        }
    }

    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Carro", "Fiat Uno", 4, 150);

        System.out.println("Dados do Veículo:");
        System.out.println("Nome: " + carro.getNome());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Quantidade de Pneus: " + carro.getQuantidadeDePneus());
        System.out.println("Potência: " + carro.getPotencia() + " hp");

        carro.ligar();
        carro.acelerar(60);
        carro.frear(20);
        carro.parar();
        carro.desligar();
    }
}

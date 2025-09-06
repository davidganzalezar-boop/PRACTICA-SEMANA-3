public class CuentaBancaria {
    private double saldo;
    public CuentaBancaria(double saldo) {

    }
    //fue una sugerencia que me dio para que el main funcionara
    public CuentaBancaria() {
    }
//

    //faltaba el saldo
    public void CuentaBancaria(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            this.saldo = 0.0;
        }
    }
    public void imprimir (double saldo) {
        this.saldo = 0.0;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else{
            System.out.println("Fondos insuficientes.");
        }
    }
    public double getSaldo() {
        return saldo;
    }
}

public class main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Cristian", 1000);

        cuenta1.mostrarSaldo();
        cuenta1.depositar(500);
        cuenta1.retirar(200);
        cuenta1.retirar(2000); // prueba error
    }
}
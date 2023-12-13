public class Deposito {

    private Contenido contenido;

    private int capacidad;
    private int capMax;

    private String otroDeposito;

    public Deposito(int capMax, int capacidad, Contenido contenido) {
        this.capMax = capMax;
        this.capacidad = capacidad;
        this.contenido = contenido;
    }

    public int estaVacio(int capacidad){

        if (capacidad == 0){
            System.out.println("El deposito esta vacío");
        }
        return capacidad;
    }

    public double llenar(int capacidad, Contenido contenido) throws Exception {

        int capacidadSumada = 0;

        double capacidadTotal = capacidad + capacidadSumada;

        if (capacidadTotal == capMax){
            System.out.println("El deposito esta lleno");
        }else{
            return capacidadTotal;
        }

        if (contenido != null){
            throw new Exception("El contenido no coincide con el deposito");
        }

        return capacidadTotal;
    }

    public double extraer (int capacidad) throws Exception {

        int retiroLitros = 0;

        double litrosRestantes = capacidad - retiroLitros;

        if (retiroLitros > capacidad){
            throw new Exception("No hay cantidad suficiente.");
        }else {
            System.out.println("La capacidad que queda es: " +litrosRestantes);
        }

        return litrosRestantes;
    }

    public void transvasar(String otroDeposito){



    }

    @Override
    public String toString() {
        return "Deposito{" +
                "contenido=" + contenido +
                ", capMax=" + capacidad +
                ", capacidad=" + capMax +
                '}';
    }
}

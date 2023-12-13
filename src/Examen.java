public class Examen {

    private String asignatura;
    private String titulo;

    private double calificacion;

    public Examen(String asignatura, String titulo, float calificacion) {
        this.asignatura = asignatura;
        this.titulo = titulo;
        this.calificacion = calificacion;
    }

    public Examen(float calificacion) {
        this.calificacion = calificacion;
    }

    public Examen() {
    }

    public static String setTitulo(String titulo) throws Exception {
        if (titulo == null){
            throw new Exception("El título no puede estar vacío.");
        }else {
            return titulo;
        }
    }

    public void setCalificacion(float calificacion){
        if (calificacion < 0 || calificacion > 10){
            System.out.println("Calficación no válida");
        }else{
            this.calificacion = calificacion;
        }
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void redondear(float calificacion){

        Math.round(calificacion);

        double redondeo = calificacion;

        System.out.println(calificacion);

    }

    public void estaAprobado(float calificacion) {

        if (calificacion >= 5.00){
            System.out.println("El examen esta aprobado!");
        }else {
            System.out.println("El examen esta suspenso...");
        }

    }

    @Override
    public String toString() {
        return "Examen{" +
                "asignatura='" + asignatura + '\'' +
                ", titulo='" + titulo + '\'' +
                ", calificacion=" + calificacion +
                '}';
    }
}

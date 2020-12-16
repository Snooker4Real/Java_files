public class SimuLoiNormale {
    static double alea() {
        double s = 0;
        for (int i = 0; i < 12; i++) {
            s = s + Math.random();
        }
        return s - 6;
    }
    static int nombre = 100;

    public static void main(String[] args) {
        double somme, somcar;
        somme = somcar = 0;
        for (int i = 0; i < nombre; i++) {
            double x = alea();
            somme = somme + x;
            somcar = somcar + x * x;
        }
        double moy = somme / nombre;
        double var = somcar / nombre - moy * moy;
        System.out.println("moyenne " + moy);
        System.out.println("variance " + var);
    }
}

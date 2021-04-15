package creacionales.factoryMethod;

public class Main {
    public static void main(String[] args) {
        FabricaPlanes fabrica = new FabricaPlanes();
        String nombrePlan = "Comercial";
        int unidades = 230;
        
        Plan plan = fabrica.getPlan(nombrePlan);
        
        System.out.println("La cuenta para el plan: "+nombrePlan+" con "+
                unidades+" unidades es: ");
        plan.getTasa();
        plan.calcularCuenta(unidades);
    }
}
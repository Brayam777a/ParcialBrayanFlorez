import java.util.Scanner;
public class punto8 {
    private  String nombre;
    private double peso;
    private double precio;
    private String categoria;
    public punto8(String nombre, double peso, double precio, String categoria) {
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
        this.categoria = categoria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCateoria(String cateoria) {
        this.categoria = cateoria;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        System.out.println("ingrese la cantidad de productos: ");
        cantidad= sc.nextInt();
        punto8[] productos=new punto8[cantidad];
        sc.nextLine();

        for (int i = 0; i < productos.length; i++) {
            System.out.println("\n producto:  #"+(i+1));
            String nombre;
            System.out.println("ingrese el nombre del producto: ");
            nombre=sc.nextLine();
            double peso;
            System.out.println("Ingrese el peso: ");
            peso=sc.nextDouble();
            double precio;
             System.out.println("Ingrese el precio: ");
            precio=sc.nextDouble();

            sc.nextLine();

            String categoria;
            System.out.println("ingrese la categoria:");
            categoria=sc.nextLine();

            productos[i]=new punto8(nombre, peso, precio, categoria);

            
        }
        System.out.println("\n=====Informe por categoria==========");
        String[]categoriasUnicas=new String[cantidad];
        int totalCategorias=0;

        for (int i = 0; i < cantidad; i++) {
            String categAct = productos[i].getCategoria();
            boolean yaMostrada=false;

            for (int j = 0; j < totalCategorias; j++) {
                if(categoriasUnicas[j].equalsIgnoreCase(categAct)){
                    yaMostrada =true;
                    break;

                }
                
            }
            
            if( !yaMostrada){
                int contador=0;
                for (int j = 0; j < categoriasUnicas.length; j++) {
                    if (productos[j].getCategoria().equalsIgnoreCase(categAct)){
                        contador++;
                    }
                }
                System.out.println("categoria: " + categAct + "-> total:  "  + contador );
            }

        }

       
        sc.close();

    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parcial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexis Z y Steban Imbachi
 */
public class Principal {
private static ArrayList<Contacto>lscontactos=new ArrayList<>();
static Scanner scan =new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int opcion=0;
        do{
            System.out.println("******Zona Virtual S.A******");
            System.out.println("1. Agregar un nuevo contactos");
            System.out.println("2. Mostrar lista de contacto");
            System.out.println("3. Buscar contacto por nombre");
            System.out.println("4. Ordenar por burbuja apartir de los nombres");
            System.out.println("5. Ordenar por insercion apartir de los numeros de telefono");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opcion");
            opcion = scan.nextInt();
            scan.nextLine();
            
            switch(opcion){
                
                case 1:
                    System.out.println("Ingrese el nombre del contacto: ");
                    String Nombre=scan.nextLine();
                    System.out.println("Ingrese el numero de telefono del contacto: ");
                    int Numero_Telefono=scan.nextInt(); 
                    lscontactos.add(new Contacto(Nombre, Numero_Telefono));
                    break;
                    
                case 2:
                    System.out.println("\n Lista de contactos");
                    Mostrar_Contacto();
                        
                    break;
                    
                case 3:
                    System.out.println("\n Nombre Buscado");
                    Buscar_Por_Nombre();
                    
                    break;
                    
                case 4:
                    System.out.println("\n Lista de nombres ordenados por burbuja");
                    Ordenar_por_Burbuja();
                    Mostrar_Contacto();

                    break;
                case 5:
                    System.out.println("\n Lista de numeros ordenada por insercion");
                    Ordenar_por_Inserccion();
                     Mostrar_Contacto();

                    break;
                
                case 6:
                     System.exit(0);
                    break;
                    default:
                        System.out.println("Opcion no valida");
                        
                        break;
            }
            
        }while(opcion !=6);
    }
    
    public static void Registrar_Nombres(String Nombre){
        Contacto nuevocontacto=new Contacto(Nombre, 0);
        lscontactos.add(nuevocontacto);
    }
    public static void Mostrar_Contacto(){
        for (Contacto a : lscontactos){
            System.out.println(a.getNombre() + " : " + a.getNumero_Telefono());
        }
   
        
    }
    public static void Ordenar_por_Burbuja() {
         int n = lscontactos.size();
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            Contacto uno = lscontactos.get(j);
            Contacto dos = lscontactos.get(j + 1);
            if (uno.getNombre().compareTo(dos.getNombre()) > 0) {
                lscontactos.set(j, dos);
                lscontactos.set(j + 1, uno);
            }
        }            
        }
        
    }
    public static void Ordenar_por_Inserccion() {
        boolean agregado = false;
        for(int j = 1; j>0&& !agregado;j--){
            Contacto uno = lscontactos.get(j);
            Contacto dos = lscontactos.get(j-1);
            if (uno.getNumero_Telefono()< dos.getNumero_Telefono()){
                lscontactos.set(j, dos);
                lscontactos.set(j-1, uno);
            }else {
                agregado=true;
            }
        }
    }
    public static void Buscar_Por_Nombre() {
        System.out.println("Digite el nombre del contacto a buscar");
       String nombreBuscado = scan.nextLine();
       
        boolean encontrado = false;
                    for (int i = 0; i < lscontactos.size(); i++) {
                        Contacto contacto = lscontactos.get(i);
                        if (contacto.getNombre().equalsIgnoreCase(nombreBuscado)){
                            System.out.println("Contacto encontrado en la posición " + (i + 1) + ":");
                            System.out.println("Nombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getNumero_Telefono());
                            encontrado = true;
                        }
    }
}
}
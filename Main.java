package org.SQLiteDemo.ActividadExtra7;
import org.SQLiteDemo.Libro;
import org.SQLiteDemo.LibroDAO;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        org.SQLiteDemo.LibroDAO ldao=new LibroDAO();

        Libro libro=new Libro(1,"EL PERFUME"," Patrik ");
        try {
            if (ldao.update(libro)){
                System.out.println("SE INSERTO CORRECTAMENTE");
            }else {
                System.out.println("NO SE PUDO INSERTAR ");
            }
        }catch (SQLException sqle){
            System.out.println("ERROR AL INSERTAR");
        }
        try {
            if (ldao.delete("11")){
                System.out.println("ELIMINACION EXITOSA");
        }else {
                System.out.println("NO SE PUDO ELIMINAR ");
            }
    }catch (SQLException sql){
            System.out.println("ERROR AL ELIMINAR");
            System.out.println(sql.getMessage());
        }
}
}

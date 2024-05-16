/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class UniversidadEjemplo {

    public static void main(String[] args) {
        try {
            //ESTABLECIENDO CONEXIÓN
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/universidad";
            String usuario = "root";
            String password = "";
            Connection conexion = DriverManager.getConnection(url, usuario, password);

//            //***Insertando Alumnos ***    

//            String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado) "
//                    + " VALUES (33001002 , ' Segura ' , ' Luis ' , '1993-03-03', 1),"
//                    + "(55001002, 'Carrillo ', ' Tomas', '2010-07-27', 1),"
//                    + " (39001002, 'Godoy', ' Candela', '1996-11-13', 1)";
//            PreparedStatement ps = conexion.prepareStatement(sql);
//            int filas = ps.executeUpdate();
//            if (filas > 0) {
//                JOptionPane.showMessageDialog(null, "Alumno agregado correctamente");
//            }


            //***Insertando Materias   ***
            
//            String sql = "INSERT INTO materias( nombre, año, estado) "
//                    + "VALUES ('EDA', 2024, 1),"
//                    + "('Laboratorio 1', 2024, 1),"
//                    + "('Web 1', 2024, 1),"
//                    + "('Matematica 1', 2024 , 1)";
//            PreparedStatement ps = conexion.prepareStatement(sql);
//            int filas = ps.executeUpdate();
//            if (filas > 0) {
//                JOptionPane.showMessageDialog(null, "Materia agregada correctamente");
//            }


            //***Inscribiendo Alumnos a Materias ***
            
//        String sql = "INSERT INTO inscripcion(nota ,id_Alumno, id_Materia) "
//                + "VALUES (9, 1, 1),"
//                + "(9,1,2),"
//                + "(10,2,2),"
//                + "(10,2,1),"
//                + "(9,3,3),"
//                + "(9,3,1)" ; 
//        PreparedStatement ps = conexion.prepareStatement(sql);
//        int filas = ps.executeUpdate ();
//        if (filas > 0){
//            JOptionPane.showMessageDialog(null, "Inscripcion Correcta "); }


            //***Listar Los Alumnos con calificaciones superiores a 8 ***
            
//            String sql = "SELECT a.* FROM alumno a join inscripcion i on ( a.id_Alumno = i.id_Alumno ) WHERE nota > 8 ";
//            PreparedStatement ps = conexion.prepareStatement(sql);
//            ResultSet resultado = ps.executeQuery();
//            while (resultado.next()) {
//                System.out.print(" id alumno: " + resultado.getInt("id_Alumno"));
//                System.out.print(" dni: " + resultado.getInt("dni"));
//                System.out.print(" apellido: " + resultado.getString("apellido"));
//                System.out.print(" nombre: " + resultado.getString("nombre"));
//                System.out.print(" fecha nacimiento: " + resultado.getDate("fechaNacimiento"));
//                System.out.print(" estado: " + resultado.getBoolean("estado") + "\n");
//            }
            
             //*** Desinscribir un alumno***
              
//               String sql = "DELETE FROM inscripcion WHERE id_Alumno = 2 and id_Materia = 2 " ;
//               PreparedStatement ps= conexion.prepareStatement (sql);
//               int filas = ps.executeUpdate();
//               if(filas > 0){
//                   JOptionPane.showMessageDialog(null, "Alumno desinscripto correctamente");
//               }
               


        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error al cargar el driver");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error SQL");
        }
    }
}

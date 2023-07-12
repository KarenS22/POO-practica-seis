/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.practica.seis.controlador;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author ACER
 */
public class ControladorDirectorio {

    public boolean validarRuta(String r) {
        try {
            File ruta = new File(r);
            return ruta.exists();
        } catch (Exception e) {
            System.out.println("Excepcion" + e);
            throw e;
        }
    }

    public void listarComponentes(DefaultMutableTreeNode nodoPadre, File file, int opcion) {
        try {
            File[] files = file.listFiles();
            if (files != null) {
                for (File subFile : files) {
                    if (opcion == 1) {
                        DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(subFile.getName());
                        nodoPadre.add(nodo);
                        if (subFile.isDirectory()) {

                            listarComponentes(nodo, subFile, 1);
                        }
                    } else if (opcion == 2) {
                        if (subFile.isFile()) {
                            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(subFile.getName());
                            nodoPadre.add(nodo);
                            if (subFile.isDirectory()) {

                                listarComponentes(nodo, subFile, 2);
                            }
                        }
                    } else if (opcion == 3) {
                        if (subFile.isDirectory()) {
                            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(subFile.getName());
                            nodoPadre.add(nodo);
                            if (subFile.isDirectory()) {

                                listarComponentes(nodo, subFile, 3);
                            }
                        }
                    } else if (opcion == 4) {
                        if (subFile.isFile() && subFile.isHidden()) {
                            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(subFile.getName());
                            nodoPadre.add(nodo);
                            if (subFile.isDirectory()) {

                                listarComponentes(nodo, subFile, 4);
                            }
                        }
                    } else if (opcion == 5) {
                        if (subFile.isDirectory() && subFile.isHidden()) {
                            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(subFile.getName());
                            nodoPadre.add(nodo);
                            if (subFile.isDirectory()) {

                                listarComponentes(nodo, subFile, 5);
                            }
                        }
                    }

                }
            }
        } catch (Exception e) {
            System.out.println("Excepcion" + e);
            throw e;
        }

    }

    private String calcularTamano(long size) {
        long b = 1024;
        double bd = 1024.0;
        if (size < b) {
            return size + " B";
        } else if (size < (b * b)) {
            double tamanoKB = size / bd;
            return decimal(tamanoKB) + " KB";
        } else if (size < (b * b * b)) {
            double tamanoMB = size / (bd * bd);
            return decimal(tamanoMB) + " MB";
        } else {
            double tamanoGB = size / (bd * bd * bd);
            return decimal(tamanoGB) + " GB";
        }
    }

    private String SimplificarFecha(long date) {
        Date fecha = new Date(date);
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(fecha);
    }

    private String decimal(double size) {
        DecimalFormat f = new DecimalFormat("#.##");
        return f.format(size);
    }

    public String obtenerinformacion(String ruta) {
        File file = new File(ruta);
        String path = file.getAbsolutePath();
        long size = file.length();
        String tamano = calcularTamano(size);
        String leer = "";
        if (file.canRead()) {
            leer = "Tiene permiso de lectura";
        } else {
            leer = "No tiene permiso de lectura";
        }
        String escribir = "";
        if (file.canWrite()) {
            escribir = "Tiene permiso de escritura";
        } else {
            escribir = "No tiene permiso de escritura";
        }
        long date = file.lastModified();
        String fecha = SimplificarFecha(date);

        String info = "Informacion: \n" + "  Path absoluto: " + path + "\n" + "  Tamaño del archivo: " + tamano
                + "\n" + "  Permiso de lectura: " + leer + "\n" + "  Permiso de escritura: " + escribir + "\n"
                + "  Fecha ultima modificacion: " + fecha;

        return info;
    }

    public boolean crearArchivo(File file) {
        try {
            return file.createNewFile();
        } catch (IOException e) {
            return false;
        }
    }
    
    public boolean crearCarpeta(File file){
        try {
            return file.mkdir();
        } catch (Exception e){
            return false;
        }
    }
    
    public boolean eliminarFile(String ruta){
        File file = new File(ruta);
        if (file.exists()){
            if (file.isDirectory()){
                File[] files = file.listFiles();
                if (files != null){
                    for (File file1 : files) {
                        eliminarFile(file1.getAbsolutePath());
                        
                    }
                }
                
            }
            file.delete();
            return true;
        }
        return false;
    }
    
    public boolean renombrarFile(String rutaAntigua, String nuevoNombre ){
        File file = new File(rutaAntigua);
        if (file.exists()){
            File newFile = new File(nuevoNombre);
             return file.renameTo(newFile);
        } else{
            return false;
        }
    }
    
}

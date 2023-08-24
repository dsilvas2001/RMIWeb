/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mb;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import com.rmiServer.RemoteInterface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author Cristhian
 */
@ManagedBean
@ViewScoped
public class Operacion implements Serializable {

    /**
     * Creates a new instance of Operacion
     */
<<<<<<< HEAD
    
    
=======
>>>>>>> c03f08c47b39773f94a724a1b2265f67eb3ff22f
    private RemoteInterface stub;
    private double operandoUno, operandoDos, resultado;
    private String usuario;
    private String clave;
    private String email;
    private String telmovil;
    private List<Usuario> registros;
<<<<<<< HEAD
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    private String telefono;
    private String direccion;
    
    
    
=======

>>>>>>> c03f08c47b39773f94a724a1b2265f67eb3ff22f
    public Operacion() {
        stub = null;
        Registry registry;
        try {
            registry = LocateRegistry.getRegistry("localhost", 8888);
            try {
                // Looking up the registry for the remote object
                stub = (RemoteInterface) registry.lookup("metodosRmi");
            } catch (RemoteException | NotBoundException ex) {
                Logger.getLogger(Operacion.class.getName()).log(Level.SEVERE, null, ex);
                stub = null;
            }
        } catch (RemoteException ex) {
            Logger.getLogger(Operacion.class.getName()).log(Level.SEVERE, null, ex);
            stub = null;
        }
    }

    public String sumar() throws RemoteException {
        resultado = stub.suma(operandoUno, operandoDos);
        return "#";
    }

    public String restar() throws RemoteException {
        resultado = stub.resta(operandoUno, operandoDos);
        return "#";
    }

    public String multiplicar() throws RemoteException {
        resultado = stub.multiplicacion(operandoUno, operandoDos);
        return "#";
    }

    public String dividir() throws RemoteException {
        resultado = stub.division(operandoUno, operandoDos);
        return "#";
    }

    public void insertar() throws Exception {
        try {
            stub.insertar(usuario, clave, email, telmovil);

        } catch (RemoteException ex) {
            Logger.getLogger(Operacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getRegistros(ActionEvent actionEvent) throws RemoteException {
        try {
            registros = (ArrayList) stub.getUsuarios();
        } catch (Exception ex) {
            Logger.getLogger(Operacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList getRegistros() throws RemoteException {
        try {
            List<Usuario> listaUsuarios = stub.getUsuarios();
            return (ArrayList) listaUsuarios;
        } catch (Exception e) {
            return null;
        }
    }

    public double getOperandoUno() {
        return operandoUno;
    }

    public void setOperandoUno(double operandoUno) {
        this.operandoUno = operandoUno;
    }

    public double getOperandoDos() {
        return operandoDos;
    }

    public void setOperandoDos(double operandoDos) {
        this.operandoDos = operandoDos;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import acciones.Activo.onResultActivo;

/**
 *
 * @author RigoBono
 */
public class Pasivo implements onResultActivo {
    
    public Pasivo(){
        Activo activo=new Activo(this);
    }

    @Override
    public void onResultActivo(double resultado) {
        System.out.println("El valor es "+resultado);
    }

    
    public interface onPasivoHabla{
        public void habla(String data);
    }
    
    
}

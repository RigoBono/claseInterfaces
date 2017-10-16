/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;



/**
 *
 * @author RigoBono
 */
public class Activo{
    
    private double resultado;
    onResultActivo escuchador;
    
    public Activo(onResultActivo escuchador){
        this.escuchador=escuchador;
        this.resultado=Math.pow(2, 8)-1;
        escuchador.onResultActivo(resultado);
    }
    
    public interface onResultActivo{
        public void onResultActivo(double resultado);
    }
}

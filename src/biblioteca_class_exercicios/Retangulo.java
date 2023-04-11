/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca_class_exercicios;

/**
 *
 * @author ACER
 */

/// =======================================================

/// ARQUIVO - 2
/// CLASSE RETABGULO - METODOS DE DETERMINAR A AREA E O PERIMETRO DE UM RETANGULO
public class Retangulo {
    
    /// ATRIBUTOS DA CLASSE
    private float largura;
    private float altura;
    
    /// CONSTRUTOR DE INICIALIZACAO
    public Retangulo(){
        largura = 0;
        altura = 0;
    }
    
    /// METEDO PARA DETERMINAR A AREA
    public float determinaArea(Retangulo _obj_retangulo){
        
        float areaObject = 0;
        return areaObject = (_obj_retangulo.getLargura() * _obj_retangulo.getAltura());
    }
    
    /// METEDO PARA DETERMINAR O PERIMETRO
    public float perimetro(Retangulo _obj_retangulo){
        
        float perimetroObject = 0;
        return perimetroObject = ((_obj_retangulo.getLargura() + _obj_retangulo.getAltura()) * 2);
    }
    
    /// SET E GET =======================================
    public void setLargura(float Xlargura){
        this.largura = Xlargura;
    }
    
    public void serAltura(float XAltura){
        this.altura = XAltura;
    }
    
    public float getLargura(){
        return this.largura;
    }
    
    public float getAltura(){
        return this.altura;
    }
    
}

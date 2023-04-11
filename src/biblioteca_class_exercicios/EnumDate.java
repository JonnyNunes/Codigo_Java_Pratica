/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package biblioteca_class_exercicios;

/**
 *
 * @author ACER
 */

/// ARQUIVO - 3
/// CLASSE ENUM PARA DEFINIR AS CONSTANTES DOS MESES
/// DEFININDO TODOS OS 12 MESES COM SEU DIA MAXIMO
public enum EnumDate {
   
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30), 
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    
    /// ATRIBUTOS
    private int constValue;

    /// CONSTRUTOR PRIVADO
    EnumDate(int constValue) {
        this.constValue = constValue;
    }

    /// GET PARA PEGAR O VALOR DA CONSTANTE
    public int getConstValue() {
        return constValue;
    }   
}

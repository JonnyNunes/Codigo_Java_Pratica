/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca_class_exercicios;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ACER
 */

/// ARQUIVO - 2
/// CLASSE PARA DETERMINAR A SUBSEQUENCIA DE UMA SEQUENCIA NUMERICA
public class Programa_Dinamica {

    public Programa_Dinamica() {
    }
    
    /// METODO PARA DETERMINA A SUBSEQUENCIA
    public void findLIS(int[] arr)
    {
        // caso base
        if (arr == null || arr.length == 0) {
            return;
        }
 
        // LIS[i] armazena a subsequência crescente mais longa do subarray
        // `arr[0…i]` que termina com `arr[i]`
        List<List<Integer>> LIS = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            LIS.add(new ArrayList<>());
        }
 
        // LIS[0] denota a subsequência crescente mais longa terminando em `arr[0]`
        LIS.get(0).add(arr[0]);
 
        // inicia a partir do segundo elemento do array
        for (int i = 1; i < arr.length; i++)
        {
            // faz para cada elemento no subarray `arr[0…i-1]`
            for (int j = 0; j < i; j++)
            {
                // encontra a subsequência crescente mais longa que termina com `arr[j]`
                // onde `arr[j]` é menor que o elemento atual `arr[i]`
 
                if (arr[j] < arr[i] && LIS.get(j).size() > LIS.get(i).size()) {
                    LIS.set(i, new ArrayList<>(LIS.get(j)));
                }
            }
 
            // inclui `arr[i]` em `LIS[i]`
            LIS.get(i).add(arr[i]);
        }
 
        // descomente o código a seguir para imprimir o conteúdo de `LIS`
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println("LIS[" + i + "] — " + LIS.get(i));
        }*/
 
        // `j` irá armazenar um índice de LIS
        int j = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (LIS.get(j).size() < LIS.get(i).size()) {
                j = i;
            }
        }
 
        // imprime LIS
        System.out.print(LIS.get(j));
    }
}

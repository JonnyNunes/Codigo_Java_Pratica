/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca_class_exercicios;

/**
 *
 * @author ACER
 */

/// ARQUIVO - 2
/// CLASSE PARA MANIPULACAO DE MATRIZES
public class Matriz {
    
    int linha;
    int coluna;
    int bidimendionalArray[][];

    /// CONSTRUTOR DE INICIALIZACAO
    public Matriz() {
        this.linha = 0;
        this.coluna = 0;
    }
    
    /// GET E SET
    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public int[][] getBidimendionalArray() {
        return bidimendionalArray;
    }
    
    public void setBidimendionalArray(int[][] bidimendionalArray) {
        this.bidimendionalArray = bidimendionalArray;
        
        this.linha = bidimendionalArray.length;
        this.coluna = bidimendionalArray[0].length;
    }
    
    /// METODOS =========================================================
    
    /// REDIFININDO OP TAMANHO E ZERANDO O VALOR DA MATRIZ DA CLASSE
    public void scaleArray(int line, int columm){
        /// ATRIBUINDO A LINHA E COLUNA PARA OS ATRIBUTOS DA CLASSE
        this.linha = line;
        this.coluna = columm;
        
        /// INSTACIANDO UMA MATRIZ PARA DEFINIR SEU TAMANHO
        int bidimendionalArrayNew[][] = new int[linha][coluna];
        bidimendionalArray = bidimendionalArrayNew; /// REPASSANDO PARA A MATRIZ DA CLASSE COM SEU TAMANHO DEFINIDO
    }
    
    /// PASSAR O VALOR INTEIRO PARA A MATRIZ DA CLASSE EM UMA POSICAO ESPECIFICA
    public void addValueArray(int value, int indexLine, int indexColumm){
        bidimendionalArray[indexLine][indexColumm] = value;
    }
    
    /// DETERMINAR SE A MATRIZ E SIMETRICA, AO PASSAR COMO ENTRADA UMA MATRIZ
    public String symmetrical(int bindimensional_headquarters[][]){
        
        /// CASO A MATRIZ NAO FOR QUADRADA, ENTAO ELA NAO PODE SER SIMETRICA
        if(bindimensional_headquarters.length != bindimensional_headquarters[0].length){
            return "not_square_matrix ";
        }
        
        /// CRIANDO A MATRIZ TRANSPOSTA
        int bindimensional_headquarters_transports[][] = new int[linha][coluna];
        
        /// ATRIBUINDO OS VALORES DA MATRIZ PROPRIA A UMA MATRIZ TRANSPOSTA
        for(var i = 0; i < linha; i++){
            for(var j = 0; j < coluna; j++){
                /// A TRANSPOSTA RECEBER OS VALORES DA LINHA DA PROPRIA COMO EM SUA COLUNA (SEQUENCIALMENTE)
                bindimensional_headquarters_transports[j][i] = bindimensional_headquarters[i][j]; 
            }
        }
        
        /// DETERMINANDO SE A MATRIZ DE ENTRADA E NAO SIMETRICA EM COMPARACAO COM A MATRIZ TARNSPOSTA
        for(var i = 0; i < linha; i++){
            for(var j = 0; j < coluna; j++){
                if(bindimensional_headquarters[i][j] != bindimensional_headquarters_transports[i][j]){
                    return "is_not_symmetrical";
                }
            }
        }
        
        /// CASO FOR SIMETRICA RETORNA A STRING AFIRMANDO QUE E SIMETRICA
        return "is_symmetrical";
    }
}

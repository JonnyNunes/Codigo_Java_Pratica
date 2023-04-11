/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca_class_exercicios;

/**
 *
 * @author ACER
 */

/// ==============================================================================
/// ARQUIVO - 2

/// CLASSE AGENDA - DEFININDO METODOS DE REMOCAO (FORMA DISTINTAS), INSERCAO, IMPRIMIR CONTATOS E FAZER AGENDAMENTO TELEFONICO 
public class Agenda {
    
    /// ATRIBUTOS
    private int tamanho;
    private int chaveContato;
    
    /// DOIS OBJETOS, UM PARA ARMAZENAR OS CONTATOS ADICIONADOS E OUTRO PARA LISTA O AGENDAMENTO TELEFONICO
    private Contatos individuoContato[];
    private Contatos listAgenda[];
    
    /// CONSTRUTOR DE INICIALIZACAO
    public Agenda(){
        
        tamanho = 20; /// TAMANHO MAXIMO DA MINHA AGENDA DE CONTATOS 
        chaveContato = 0;
        individuoContato = new Contatos[tamanho];
    }
    
    /// CONSTRUTOR PARA AGENDAR ME UMA LISTA E INSTANCIAR OBJETOS
    public Agenda(Agenda _obj_Agenda, String _x_nome_person[], int[] _y_numb_person, String _z_email_person[]){
        
        /// OBJETO TEMPORARIO PARA RECEBER AS INFORMACOES DOS QUE O USER QUER AGENDAR
        Contatos agendador;
        listAgenda = new Contatos[_y_numb_person.length]; /// DEFININDO O TAMANHO CONRRESPONDETES AOS QUE O USER QUER AGENDAR
        
        /// FOR PARA PERCORRER TODA A MINHA LISTA DE CONTATO
        for(var i = 0; i < _obj_Agenda.chaveContato; i++){
            
            /// SE POR ACASO O INCREMENTO FOR IGUAL AO TAMANHO DOS AGENDADOS
            if(i >= _y_numb_person.length){
                break;
            }
            
            /// FOR PARA PERCORRER CADA UM DOS AGENDADOS
            for(var j = 0; j < _y_numb_person.length; j++){
                
                /// VERIFICAR SE AS INFORMACOES DA MINHA LISTA DE CONTATO CORRESPONDE AO AGENDADOS
                if( _x_nome_person[j] == _obj_Agenda.individuoContato[i].getNome() &&
                    _y_numb_person[j] == _obj_Agenda.individuoContato[i].getNumero() &&
                    _z_email_person[j] == _obj_Agenda.individuoContato[i].getEmail()){
                    
                    /// INSTANCIANDO O NOVO AGENDADO PARA O OBJETO AGENDADOR
                    agendador = new Contatos(
                            _obj_Agenda.individuoContato[i].getNome(),
                            _obj_Agenda.individuoContato[i].getNumero(),
                            _obj_Agenda.individuoContato[i].getEmail());
                    
                    setAgendaTelefonica(agendador, i); /// PASSANDO O NOVO AGENDADO PARA ATRIBUTIR A LISTA DE AGENDAMENTO TELEFONICO
                 
                }
                
            }
            
        }
        
    }
    
    /// METODOS DA CLASSE
    /// ==========================================================================
    
    /// METODO PARA ADICIONAR UM CONTATO REGISTRADO PELO OBJETO DE ENTRADA
    public void addContatos(Contatos _registra_contato){
        /// SE POR ACASO O TAMANHO DA LISTA DE CONTATO CHEGOU AO SEU LIMITE
        if(chaveContato > tamanho){
            return;
        }
        
        individuoContato[chaveContato] = _registra_contato; /// PASSANDO O CONTATO REGISTRADO PARA A LISTA
        chaveContato++;
    }
    
    /// FILTRANDO O NOME CONSTANTE E REMOVENDO TODOS AQUELES QUE TEM ESSE NOME
    public void removeContatos(String _x_nome_const){
        
        for(var i = 0; i < chaveContato; i++){
            /// VERIFICANDO SE O NOME E IGUAL AO BUSCADO
            if(_x_nome_const.equalsIgnoreCase(individuoContato[i].getNome())){
                chaveContato--;
            }
        }   
    }
    
    /// DETALHE DAS FUNCOES DE REMOVE: SERA DECREMENTANDO A CHAVE DE ACESSO DA INFORMACAO DO CONTATO A SER EXCLUIDO
    /// REMOVENDO O NOME ESPECIFICO COM O NUMERO ASSOCIADO AO NOME
    public void removeContatos(String _x_nome_especific, int _y_numb_contato){
        
        for(var i = 0; i < chaveContato; i++){
            /// VERIFIACANDO SE O NOME E NUMERO E IGUAL AO BUSCADOS
            if(_x_nome_especific.equalsIgnoreCase(individuoContato[i].getNome()) && _y_numb_contato == individuoContato[i].getNumero()){
                chaveContato--;
                break;
            }
        }   
    }
    
    /// IMPRIMIR A LISTA DE CONTATO
    public void displayContatos(){
        
        for(var i = 0; i < chaveContato; i++){
            /// IMFORMACAO: NOME, NUMERO E EMAIL
            System.out.println(individuoContato[i].getNome() + "   " + individuoContato[i].getNumero() + "   " + individuoContato[i].getEmail());
        }
    }
    
    /// METODO PARA MOSTRAR A LISTA DE AGENDAMENTO
    public void displayAgentaTell(){
        
        /// SE A LISTA DE AGENDAMENTO FOR VAZIO, ENTAO NAO REALIZE A OPERACAO DE IMPRESAO
        if(listAgenda != null){
            
            /// PERCORRER TODOS OS MEUS AGENDADOS
            for(var i = 0; i < listAgenda.length; i++){
           
                /// SE O AGENDADO FOR VAZIO, RETORNA AO LOOP
                if(listAgenda[i] == null){
                    continue;
                }
                System.out.println(listAgenda[i].getNome() + "   " + listAgenda[i].getNumero() + "   " + listAgenda[i].getEmail());
            }
        }
    }
    
    /// SET PARA INSERIR O NOVO AGENDADO
    private void setAgendaTelefonica(Contatos _x_contatos_agedados, int _numb_Tam){
        
       listAgenda[_numb_Tam] = _x_contatos_agedados;
    }
    
}

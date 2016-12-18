/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila;

/**
 *
 * @author otavio
 */
public class FilaSimplesmenteEncadeada implements FuncoesFila{
    private No inicio_fila;
    private No final_fila;
    private int qtd;
    private int valor;
    
    public FilaSimplesmenteEncadeada(){
       
        qtd = 0;
        inicio_fila = null;
        final_fila = null;
        valor = 0;
    }
    
    @Override
    public boolean filaVazia() {
        if(getQtd() == 0)
            return true;
        else
            return false;
    }

    @Override
    public void inserir() {
        valor++;        
        No novo = new No(getValor());
        if(filaVazia()){
            inicio_fila = novo;
            final_fila = novo;
            
        }else{
        final_fila.setProximo(novo);
        final_fila = novo;     
        }
        qtd++;
    }

    @Override
    public void remover() {
       if(filaVazia())
           System.out.println("Fila Vazia");      
           else if(inicio_fila == final_fila){
                   inicio_fila = null;
                   qtd--;
                   }
           else{
               No aux = inicio_fila;
               aux = inicio_fila.getProximo();
               inicio_fila = aux;
               qtd--;
           
           }
       
       
       }           
    @Override
    public void imprimir() {
        No aux = inicio_fila;
        if (filaVazia())
            System.out.println("Fila Vazia");
        else{
            for (int i=0; i<getQtd(); i++){
                System.out.println("Valor: " + aux.getValor());
                aux = aux.getProximo();
            }
        }
    }

    @Override
    public void tamanho() {
        System.out.println("A fila tem" + getQtd() + "Valores");
    }

    public int getQtd() {
        return qtd;
    }

    public int getValor() {
        return valor;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }    
    
}

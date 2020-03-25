package primeiraAulaDigital;

import java.util.ArrayList;
import java.util.List;

public class Cofre{
    private boolean aberto = true;
    private int senha;
    private List<CofreListener> listeners = new ArrayList<>();


    public Cofre (int senha){
        this.senha = senha;
    }

    boolean isAberto(){
        return this.aberto;
    }

    void fechar(){
        this.aberto = false;
        this.listeners.forEach(l -> l.situaçãoDoCofre());
    }

    void abrir(int senha){
        if (this.senha == senha){
            this.aberto = true;
            this.listeners.forEach(l -> l.situaçãoDoCofre());

        }
    }

    void addListener (CofreListener listener){
        this.listeners.add(listener);

    }
}
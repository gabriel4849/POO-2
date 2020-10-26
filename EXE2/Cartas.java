package meubaralho;
public class Cartas {
    
    private String numero;
    private String naipe;
    
    public Cartas(String numero, String naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public String toString() {
        return numero + " de " + naipe;
    }
}
    
    


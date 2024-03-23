package array;
public class Lista {
    
    private No primeiro;
    //Construtor padrão

    public No getPrimeiro() {

        return primeiro;
    }
    
    //era sem setter para seguir o princípio de menor responsabilidade (não vai modificar)

    public void setPrimeiro(No primeiro) {

        this.primeiro = primeiro;
    }

    public boolean estaVazia(){

        return primeiro == null;
    }

    public void insereInicio(int i){

        No novo = new No(i);
        if (!estaVazia()) {
            novo.setProximo(primeiro); //delegando funções
            primeiro = novo;
        } 
        primeiro = novo;
    }

    @Override
    public String toString(){
        String s = "lista: ";
        if(estaVazia()) {
            s += "esta vazia";
        } else {
            No aux = primeiro;
            while(aux != null) { //percorre até o final da lista
                s += aux;
                aux = aux.getProximo();
            }
            s += "\\\\"; // '\' inicia uma sequencia de escape
        }
        return s;
    }

    public void insereFim(int i) {
        No novo = new No(i);
        if(estaVazia()) {
            primeiro = novo;
        } else {
            No aux = primeiro;
            while (aux.getProximo() != null) { //percorre até o o último
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }

    public int removeInicio() {

        int info = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        return info;
    }

    public int removeFim() {

        int temp;
        if (primeiro.getProximo() == null){ // só tem um
            temp = primeiro.getInfo();
            primeiro = null; // esvaziou a lista
        } else {
            No aux = primeiro;
            while(aux.getProximo().getProximo() != null) { // percorre até o último
                aux = aux.getProximo();
            }
            temp = aux.getProximo().getInfo();
            aux.setProximo(null);
        }

        return temp;
    }
}

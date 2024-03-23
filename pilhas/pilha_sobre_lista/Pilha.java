package pilhas.pilha_sobre_lista;

public class Pilha {

    private No topo;

    public boolean estaVazia() {

        return topo == null;
    }

    public void empilha(int info) {

        No novo = new No(info);
        if(!estaVazia()) {

            novo.setProximo(topo);
        }
        topo = novo;
    }

    public int desempilha() {

        int temp = topo.getInfo();
        topo = topo.getProximo();
        return temp;
    }

    public int consultaTopo() {

        return topo.getInfo();
    }

    @Override
    public String toString(){
        
        String s = "";
        if(estaVazia()) {

            s += "pilha vazia";
        } else {
            No aux = topo;
            while (aux != null) {

                s += "\n";
                aux = aux.getProximo();
            }
        }

        return s;
    }
    
}

class No {
    private int info;
    private No proximo;
    public No (int info) {
        setInfo(info);
        setProximo(null);
    }

    public int getInfo() {

        return info;
    }

    public No getProximo() {

        return proximo;
    }

    public void setInfo(int info) {

        this.info = info;
    }
 
    public void setProximo(No proximo) {

        this.proximo = proximo;
    }

    @Override
    public String toString() {

        return "|" + info + "|";
    }

}
package array;
public class ListaComUltimo extends Lista {

    private No ultimo;
    //construtor padrão
    
    public No getUltimo(){

        return ultimo;
    }

    @Override 
    public void insereInicio(int i) {

        No novo = new No(i);
        if (estaVazia()) {
            ultimo = novo;
        } else {
            novo.setProximo(super.getPrimeiro());
        }
        super.setPrimeiro(novo);
    }

    //Fazer insereFim
    @Override
    public void insereFim(int i) {
        
        No novo = new No(i);

        if(!estaVazia()) 
            ultimo.setProximo(novo); // Atualiza o ponteiro próximo do último nó para apontar para o novo nó

        ultimo = novo; //// Atualiza a referência 'ultimo' para apontar para o novo nó
    }

    @Override
    public int removeInicio() {

        int temp = super.getPrimeiro().getInfo();
        super.setPrimeiro(super.getPrimeiro().getProximo());
        if (estaVazia()) //esvaziou a lista
            ultimo = null;
        return temp;
    }
}

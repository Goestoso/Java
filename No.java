public class No {
    private int info;
    private No proximo;

    public No(int info) {

        setInfo(info);; //concentra as regras de negócio no set
        setProximo(null);;; //clareza
    }
    //getters
    public int getInfo(){

        return info;
    }

    public No getProximo(){

        return proximo;
    }

    //setters
    public void setInfo(int info){

        this.info = info;
    }

    public void setProximo(No proximo) {

        this.proximo = proximo;
    }

    @Override //Não posso alterar a assinatura do método, mas posso modificar o comportamento
    public String toString(){ //representação textual do objeto (não recebe parâmetros)

        return "|" + info + "|->";
    }
}

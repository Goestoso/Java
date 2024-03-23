package array;
public class TesteLista {
    
    public static void main(String[] args) {
        
        ListaComUltimo lista = new ListaComUltimo();
        System.out.println(lista);

        System.out.println("Lista:");
        for (int i = 1; i < 6; i++) {
            lista.insereInicio(i*10);
            System.out.println(lista);
        }

        for (int i = 1; i < 6; i++) {
            lista.insereFim(i*10 + 5);
            System.out.println(lista);
        }

        if (lista.estaVazia()) {

            System.out.println("Lista vazia, não ha o que remover");
        } else {

            System.out.println(lista.removeInicio() + " foi removido do inicio");
            System.out.println(lista);
        }

        if (lista.estaVazia()) {

            System.out.println("Lista vazia, não ha o que remover");
        } else {

            System.out.println(lista.removeFim() + " foi removido do fim");
            System.out.println(lista);
        }
    }
}

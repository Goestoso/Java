public class TesteLista {
    
    public static void main(String[] args) {
        
        ListaComUltimo lista = new ListaComUltimo();
        System.out.println(lista);

        System.out.println("Classe ListaComUltimo:");
        for (int i = 1; i < 6; i++) {
            lista.insereInicio(i*10);
            System.out.println(lista);
        }

        for (int i = 1; i < 6; i++) {
            lista.insereFim(i*10 + 5);
            System.out.println(lista);
        }


    }
}

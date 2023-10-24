//Considere a necessidade de implementar classes para um sistema de vendas.
//Implemente as classes:
//◦ Clientes (codCli (int), nomeCli (String), enderecoCli (String), telefoneCli (String));
//◦ Pedidos (numeroPed (int), dataPed (String), valorPed (double); e
//◦ Produtos (codProd (int), Descrição (String), Preço (double)).

public class Pedidos {

    private int numeroPed;
    private String dataPed;
    private double valorPed;
    private boolean copia;

    
    public Pedidos(int numeroPed, String dataPed, double valorPed) {

        this.numeroPed = numeroPed;
        this.dataPed = dataPed;
        this.valorPed = valorPed;
    }

    public Pedidos () {

        numeroPed = 0;
        dataPed = null;
        valorPed = 0.0;

    }

    public Pedidos (Pedidos pedido) {

        this.numeroPed = pedido.numeroPed;
        this.dataPed = pedido.dataPed;
        this.valorPed = pedido.valorPed;

        copia = true;


    }

    public boolean validaPedidoCopia() {

        boolean valido;

        if (copia) 

            valido = true;
        
        else 

            valido = false;

        return valido;

    }

    public double getValorPed() {

        return valorPed;

    }

    public void setValorPed(double valorPed) {

        this.valorPed = valorPed;

    }

    public int getNumeroPed() {

        return numeroPed;

    }

    public void setNumeroPed(int numeroPed) {

        this.numeroPed = numeroPed;

    }

    public String getDataPed() {

        return dataPed;

    }

    public void setDataPed(String dataPed) {

        this.dataPed = dataPed;
        
    }    
    
}

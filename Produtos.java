//Considere a necessidade de implementar classes para um sistema de vendas.
//Implemente as classes:
//◦ Clientes (codCli (int), nomeCli (String), enderecoCli (String), telefoneCli (String));
//◦ Pedidos (numeroPed (int), dataPed (String), valorPed (double); e
//◦ Produtos (codProd (int), Descrição (String), Preço (double)).

public class Produtos {
    
    private int codProd;

    public int getCodProd() {

        return codProd;

    }
    public void setCodProd(int codProd) {

        this.codProd = codProd;

    }

    private String descriProd;
    
    public String getDescriProd() {

        return descriProd;

    }
    public void setDescriProd(String descriProd) {

        this.descriProd = descriProd;

    }

    private double precoProd;

    public double getPrecoProd() {

        return precoProd;

    }

    public void setPrecoProd(double precoProd) {

        this.precoProd = precoProd;

    }

    public Produtos(int codProd, String descriProd, double precoProd) {

        this.codProd = codProd;
        this.descriProd = descriProd;
        this.precoProd = precoProd;

    }

    public Produtos(Produtos produto) {

        this.codProd = produto.codProd;
        this.descriProd = produto.descriProd;
        this.precoProd = produto.precoProd;

        mostraProduto();
        
    }

    private void mostraProduto() {


        System.out.println("\nVocê acessou um construtor de cópia!");

    }

    public Produtos() {

        codProd = 0;
        descriProd = null;
        precoProd = 0.0;

    }

    public boolean validaProduto() {

        boolean valido;

        if (codProd == 0)

            valido = false;

        else 

            valido = true;

        return valido;
    }

    

}

//Considere a necessidade de implementar classes para um sistema de vendas.
//Implemente as classes:
//◦ Clientes (codCli (int), nomeCli (String), enderecoCli (String), telefoneCli (String));
//◦ Pedidos (numeroPed (int), dataPed (String), valorPed (double); e
//◦ Produtos (codProd (int), Descrição (String), Preço (double)). 


public class Clientes {

    private int codCli;
    private String nomeCli; 
    private String enderecoCli;
    private String telefoneCli;

    public int getCodCli() {

        return codCli;

    }

    public void setCodCli(int codigo) {

        codCli = codigo;
    }

    public String getNomeCli() {

        return nomeCli;

    }

    public void setNomeCli(String nome) {

        nomeCli = nome;
    }

    public String getEnderecoCli() {

        return enderecoCli;

    }

    public void setEnderecoCli(String endereco) {

        enderecoCli = endereco;
    }

     public String getTelefoneCLi() {

        return telefoneCli;

    }

    public void setTelefoneCli(String telefone) {

        telefoneCli = telefone;
    }

    public  Clientes () {

        codCli = 0;
        nomeCli = null;
        enderecoCli = null;
        telefoneCli = null;
        
    }

    public Clientes (int codigo, String nome, String endereco, String telefone) {

        codCli = codigo;
        nomeCli = nome;
        enderecoCli= endereco;
        telefoneCli = telefone;

    }

    public Clientes (Clientes cliente) {

        this.codCli = cliente.codCli;
        this.nomeCli = cliente.nomeCli;
        this.enderecoCli = cliente.enderecoCli;
        this.telefoneCli = cliente.telefoneCli;    
        

    }

    public boolean validaCliente () {

        boolean validado;

        if (codCli == 0) {

            validado = false;

        } else {

            validado = true;

        }

        return validado;
    }

    @Override

    public String toString() {

        return ("Código do Cliente: " + codCli
        + "\nNome do Cliente: " + nomeCli + "\nEndereço do Cliente: " + enderecoCli + "\nTelefone do Cliente: " + telefoneCli);

    }
    
}

package Proxy;

public class Pasta implements MettiSale{

    private PastaConSale pasta;

    @Override
    public void saleInserito(){
        if (pasta == null){
            pasta = new PastaConSale();
        }
        pasta.saleInserito();
    }

}

package aparelho.chamadas;

public class Chamando implements Chamadas {

    @Override
    public void atender() {
        System.out.println("ATENDENDO CHAMADA");
    }

    @Override
    public void chamar() {
        System.out.println("CHAMANDO");
        
    }

    @Override
    public void correioDeVoz() {
        System.out.println("DISCANDO CORREIO DE VOZ");
        
    }
    
}

package aparelho.reprodutor;

public class Player implements ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("TOCANDO A MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("MUSICA PAUSADA");        
    }

    @Override
    public void trocar() {
        System.out.println("TROCANDO DE FAIXA MUSICAL");        
    }
    
}

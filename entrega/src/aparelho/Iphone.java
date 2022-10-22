package aparelho;

import aparelho.chamadas.Chamadas;
import aparelho.navegador.Navegador;
import aparelho.reprodutor.ReprodutorMusical;

public class Iphone implements Chamadas, Navegador, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("iphone tocando musica");
        
    }

    @Override
    public void pausar() {
        System.out.println("iphone pausando musica");
        
    }

    @Override
    public void trocar() {
        System.out.println("iphone trocando de faixa musical");
        
    }

    @Override
    public void novaAba() {
        System.out.println("Ichrome nova aba");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Ichrome atualizando pagina");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Ichrome exibindo pagina");
        
    }

    @Override
    public void atender() {
        System.out.println("iphone atendendo chamada");
        
    }

    @Override
    public void chamar() {
        System.out.println("iphone ligando");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("iphone ligando correio de voz");
        
    }
    
}

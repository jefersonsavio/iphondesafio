package aparelho;


import aparelho.chamadas.Chamando;
import aparelho.navegador.Chrome;
import aparelho.reprodutor.Player;

public class Execucao { 
    public static void main(String[] args) {
        
        Chamando ch = new Chamando();
        ch.atender();
        ch.chamar();
        ch.correioDeVoz();

        Chrome chrome = new Chrome();
        chrome.atualizarPagina();
        chrome.exibirPagina();
        chrome.novaAba();

        Player player = new Player();
        player.tocar();
        player.trocar();
        player.pausar();
        
        Iphone ip = new Iphone();

       ip.atender();
       ip.chamar();
       ip.correioDeVoz();
       ip.atualizarPagina();
       ip.exibirPagina();
       ip.novaAba();
       ip.tocar();
       ip.pausar();
       ip.trocar();

    }
    
}

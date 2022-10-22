package aparelho.navegador;

public class Chrome implements Navegador {

    @Override
    public void novaAba() {
        System.out.println("NOVA ABA ABERTA");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PPAGINA");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA");
    }
    
}

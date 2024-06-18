public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone(ReprodutorMusical reprodutorMusical,
                    AparelhoTelefonico aparelhoTelefonico,
                    NavegadorInternet navegadorInternet) {
        this.reprodutorMusical = reprodutorMusical;
        this.aparelhoTelefonico = aparelhoTelefonico;
        this.navegadorInternet = navegadorInternet;
    }

    public void tocarMusica() {
        reprodutorMusical.tocar();
    }

    public void ligarPara(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    public void abrirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }

    public static void main(String[] args) {

        ReprodutorMusical reprodutor = new ReprodutorMusical() {
            @Override
            public void tocar() { System.out.println("Tocando música..."); }
            @Override
            public void pausar() { System.out.println("Música pausada."); }
            @Override
            public void selecionarMusica(String musica) { System.out.println("Selecionando música: " + musica); }
        };

        AparelhoTelefonico telefone = new AparelhoTelefonico() {
            @Override
            public void ligar(String numero) { System.out.println("Ligando para " + numero + "..."); }
            @Override
            public void atender() { System.out.println("Atendendo chamada..."); }
            @Override
            public void iniciarCorreioVoz() { System.out.println("Iniciando correio de voz..."); }
        };

        NavegadorInternet navegador = new NavegadorInternet() {
            @Override
            public void exibirPagina(String url) { System.out.println("Exibindo página: " + url); }
            @Override
            public void adicionarNovaAba() { System.out.println("Adicionando nova aba..."); }
            @Override
            public void atualizarPagina() { System.out.println("Atualizando página..."); }
        };

        iPhone meuIPhone = new iPhone(reprodutor, telefone, navegador);

        meuIPhone.tocarMusica();
        meuIPhone.ligarPara("123456789");
        meuIPhone.abrirPagina("https://www.example.com");
    }
}

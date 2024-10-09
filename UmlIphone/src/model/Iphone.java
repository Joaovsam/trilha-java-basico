package model;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " selecionada para tocar.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina " + url + " iniciada");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba Adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("pagina atualizada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ligando para escutar correios de voz");
    }

}

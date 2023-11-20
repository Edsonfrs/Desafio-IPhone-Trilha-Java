package iphone;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String currentSong;

    // Implementação dos métodos para o Reprodutor Musical
    @Override
    public void reproduzirMusica() {
        String currentSong = null;
        boolean isPlaying = false;

        if (currentSong != null && !isPlaying) {
            System.out.println("Reproduzindo música: " + currentSong);
            isPlaying = true;
        } else {
            System.out.println("Nenhuma música selecionada ou já está reproduzindo.");
        }
    }

    @Override
    public void pausarMusica() {
        String currentSong = null;
        boolean isPlaying = false;
        if (isPlaying) {
            System.out.println("Música pausada: " + currentSong);
            isPlaying = false;
        } else {
            System.out.println("Nenhuma música está sendo reproduzida.");
        }
    }


    @Override
    public void selecionarMusica(String musica) {
        this.currentSong = musica;
        System.out.println("Música selecionada: " + musica);
    }


    // Implementação dos métodos para o Aparelho Telefônico
    private boolean isCalling;
    private String currentCallNumber;

    // Implementação dos métodos para o Aparelho Telefônico
    @Override
    public void fazerLigacao(String numero) {
        if (!isCalling) {
            System.out.println("Chamando " + numero);
            isCalling = true;
            currentCallNumber = numero;
        } else {
            System.out.println("Já está em uma ligação.");
        }
    }

    @Override
    public void receberLigacao(String numero) {
        if (!isCalling) {
            System.out.println("Recebendo ligação de " + numero);
            isCalling = true;
            currentCallNumber = numero;
        } else {
            System.out.println("Já está em uma ligação.");
        }
    }

    @Override
    public void desligarLigacao() {
        if (isCalling) {
            System.out.println("Desligando ligação com " + currentCallNumber);
            isCalling = false;
            currentCallNumber = null;
        } else {
            System.out.println("Não há nenhuma ligação ativa.");
        }
    }

    // Método para iniciar correio de voz
    public void iniciarCorreioVoz() {
        if (!isCalling) {
            System.out.println("Iniciando correio de voz.");
            // Lógica para iniciar o correio de voz
        } else {
            System.out.println("Não é possível iniciar o correio de voz durante uma chamada.");
        }
    }


    // Implementação dos métodos para o Navegador na Internet
    private boolean isBrowserOpen;
    private String currentURL;

    // Implementação dos métodos para o Navegador na Internet
    @Override
    public void abrirURL(String url) {
        if (!isBrowserOpen) {
            System.out.println("Abrindo URL: " + url);
            isBrowserOpen = true;
            currentURL = url;
        } else {
            System.out.println("Já há uma URL aberta. Feche-a antes de abrir outra.");
        }
    }

    @Override
    public void fecharURL() {
        if (isBrowserOpen) {
            System.out.println("Fechando URL: " + currentURL);
            isBrowserOpen = false;
            currentURL = null;
        } else {
            System.out.println("Não há nenhuma URL aberta.");
        }
    }

    @Override
    public void navegarPagina(String pagina) {
        if (isBrowserOpen) {
            System.out.println("Navegando para: " + pagina);
            // Lógica para navegar para a página especificada
            currentURL = pagina; // Atualiza a URL atual
        } else {
            System.out.println("Não há nenhuma URL aberta para navegar.");
        }
    }


}

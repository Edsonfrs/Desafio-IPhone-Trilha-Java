package iphone;

public interface AparelhoTelefonico {
    void fazerLigacao(String numero);
    void receberLigacao(String numero);

    void desligarLigacao();

    void iniciarCorreioVoz();
}

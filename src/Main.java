import iphone.IPhone;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.reproduzirMusica();
        iphone.pausarMusica();
        iphone.fazerLigacao("123456");
        iphone.desligarLigacao();
        iphone.abrirURL("https://www.site.com");
    }
}
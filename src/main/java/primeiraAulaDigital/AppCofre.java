package primeiraAulaDigital;
public class AppCofre{
    public static void main(String[] args) {
        Cofre daSala = new Cofre(123456);

        daSala.addListener(new CofreListenerFechar());
        System.out.println(daSala.isAberto());
        daSala.fechar();
        daSala.abrir(123455);



    }
}

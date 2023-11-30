public class App {
    public static void main(String[] args) throws Exception {
        
        String primeiroNome = "Rafael";
        String segundoNome = "Fortunato Dametto";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        int anoFabricacao = 2018;
        boolean verdadeFalso = true;

        System.out.println(primeiroNome +" " + anoFabricacao +" "+ verdadeFalso);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

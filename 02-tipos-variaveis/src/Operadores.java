public class Operadores {
    public static void main(String[] args) {
        

        String nomeUm = "RODRIGO";
        String nomeDois = new String("RODRIGO");
        
        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

        //OPERADORES RELACIONAIS
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior a numeroDois? " + simNao);

        //OPERADORES LOGICOS
        boolean condicao1=false;

        boolean condicao2=true;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

            System.out.println("fim");
    }
    
}

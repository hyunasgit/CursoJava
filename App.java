public class App {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");

        //int inteiro = 1;
        //double decimal = 1;
        //float f = 1.0f;
        //char unico = "a";
        //String texto = "texto longo"
        //boolean VouF = false;
        //byte meuByte = 00110
        //long numeroGrande = 999999999;
         
        int primeiro = 4;
        int segundo = 54;
        double terceiro = 45;
        double resultado ;
        resultado = primeiro * (segundo + terceiro);

       //System.out.println(resultado);
       //System.out.printf("%.4f\n", resultado);

       String nome = "Juliana";
       String sobreNome = "Maia";
        
       //System.out.printf("%s Esse eh meu nome \n", nome);

       int idade = 25;

       if (idade == 18) {

       //System.out.println ( "Voce é maior de idade");
       }
       else if (idade < 18) {
       //System.out.println("voce tem mais de 18 anos");
       }
       //System.out.println("Voce tem mais que 18 anos ");

       // vereficação de resultado, multipliquem dois numero e o resultado sera comparado entre positivo e negativo

       int pri = - 25;
       int seg = 10;
       double resp;
       resp = pri * seg ;
       if (resp > 0) { 
       System.out.printf ("o numero %d positivo. \n\n", resp);}
       else if (resp < 0 ) {
       System.out.printf("a resposta sera negativa");
       }
       



       

     }  
}

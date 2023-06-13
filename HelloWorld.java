public class HelloWorld{
    
    public static void main(String[] args){
        String ambiente = args[0];

        if(ambiente.equalsIgnoreCase("Dev")){ //equalsIgnoreCase reconhece maiusculo ou minusculo
            System.out.print("Ambiente de Desenvolvimento");
        }
        else if(ambiente.equalsIgnoreCase("Teste")){
            System.out.print("Ambiente de teste");
        }
        else{
            System.out.print(ambiente);
        }
        

    }
}
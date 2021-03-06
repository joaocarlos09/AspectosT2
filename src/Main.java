public class Main {
    public static void main(String[] args) {
        String cadeia = "0xAB12j";
        String hexa = "0123456789ABCDEFabcdef";
        int estado = 0;

        for(int i = 0; i<cadeia.length(); i++){
            switch (estado){
                case 0:
                    if(cadeia.charAt(i) == '0') {
                        estado = 1;
                        break;
                    }
                    else{
                        estado = 4;
                        break;
                    }
                case 1:
                    if(cadeia.charAt(i) == 'x' || cadeia.charAt(i) == 'X'){
                        estado = 2;
                        break;
                    }
                    else{
                        estado = 4;
                        break;
                    }
                case 2:
                    if(hexa.contains(String.valueOf(cadeia.charAt(i)))){
                        estado = 3;
                        break;
                    }
                    else{
                        estado = 4;
                        break;
                    }
                case 3:
                    if(hexa.contains(String.valueOf(cadeia.charAt(i)))){
                        estado = 3;
                        break;
                    }
                    else{
                        estado = 4;
                        break;
                    }
                default:
                    System.out.println(" Erro Lexico! ");
                    System.exit(0);
            }
        }

        if (estado == 3){
            System.out.println(" Cadeia reconhecida pelo automato! ");
        }
        if(estado == 4){
            System.out.println(" Erro Lexico! ");
        }
        else{
            System.out.println(" Cadeia não reconhecida pelo automato! ");
        }
    }
}

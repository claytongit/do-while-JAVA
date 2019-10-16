package app;

public class doWhile {
    public static void main(String[] args) throws Exception {
        
        int i = 1;
        int max = 10;

        System.out.println("Contando até : " + max);

        while (i <= max){
            System.out.println("Valor de i: " + i);
            i++;
        }
        System.out.println("Ultimo valor do While: " + i);
        System.out.println("Continuando a contagem com do while");
        do{
            i++;
            System.out.println("Valor de i: " + i);
        } while(i < 20);
    }
}
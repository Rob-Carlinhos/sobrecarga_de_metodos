public class CalculadoraV3 {
    public int somar (int [] elementos) {
        var res = 0;
        //enhanced for (vem do JAVA 5)
        //for each
        int i = 0;
        for (int elemento : elementos) { 
            i++;
            if (i % 2 == 0)
            res += elemento;
        }
        for (i = 0; i<elementos.length; i++) {
            res += elementos[i];
        }
        return res;
    }
}

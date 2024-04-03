package triangleClassifier;
public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String isTriangle(){
        if (a < b + c && b < a + c && c < a + b) {
            return "Os valores informados podem forma um triângulo";
        }
    
        else{
            return "Os valores informados não podem forma um triângulo";
        }
    }

    public String sumIsEqual(){
        if (a == b + c || b == a + c || c == a + b) {
            return "A soma de dois dos lados é igual ao terceiro.";
        }

        else {
            return "A soma de dois dos lados é diferente ao terceiro.";
        }
    }

    public String sideZero(){
        if (a == 0 || b == 0 || c == 0) {
            return "Um dos valores é zero";
        }
    
        else {
            return "Todos os valores são diferentes de zero";
        }
    }

    public String sideNegative(){
        if (a < 0 || b < 0 || c < 0) {
            return "Um dos valores é negativo";
        }
    
        else {
            return "Todos os valores são positivos";
        }
    }

    public String allSideZero(){
        if (a == 0 && b == 0 && c == 0) {
            return "Todos os lados são iguais a zero";
        }

        else{
            return "Todos os lados são diferentes de zero";
        }
    }

    public String valuesNotInt(Integer n1, Integer n2, Integer n3){
        if (n1 instanceof Integer && n2 instanceof Integer && n3 instanceof Integer) {
            return "Todos os valores são números inteiros";
        }

        else {
            return "Um dos valores não é um número inteiro";
        }
    }

    public String paramsQuantity(int... arguments){
        if (arguments.length == 3) {
            return "Número de entradas correto";
        }

        else {
            return "Número de entradas incorreto.";
        }
    }

    public String isScaleneTriangle(){
        if (isTriangle() == "Os valores informados podem forma um triângulo") {
            if (a != b && b != c && a != c) {
                return "Esse é um triângulo escaleno.";
            }
    
            else {
                return "Esse não é um triângulo escaleno.";
            }
        }

        else{
            return "Esse não é um triângulo escaleno.";
        }
    }

    public String isEquilateralTriangle(){
        if (isTriangle() == "Os valores informados podem forma um triângulo") {
            
            if (a == b && b == c) {
                return "Esse é um triângulo equilátero.";
            }
    
            else {
                return "Esse não é um triângulo equilátero.";
            }
        }

        else {
            return "Esse não é um triângulo equilátero.";
        }
    }

    public String isIsoscelesTriangle(){
        if (isTriangle() == "Os valores informados podem forma um triângulo") {
            
            if (this.isEquilateralTriangle() == "Esse não é um triângulo equilátero." && this.isScaleneTriangle() == "Esse não é um triângulo escaleno.") {
                return "Esse é um triângulo isósceles.";
            }
    
            else {
                return "Esse não é um triângulo isósceles.";
            }
        }

        else {
            return "Esse não é um triângulo isósceles.";
        }
    }
}

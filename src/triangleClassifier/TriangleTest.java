package triangleClassifier;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {

    // Você tem um teste que representa um triângulo escaleno válido?
    @Test
    public void isScaleneTriangle(){
        Triangle triangle = new Triangle(4, 5, 6);
        assertEquals("Esse é um triângulo escaleno.", triangle.isScaleneTriangle());
    }

    // Você tem um teste que representa um triângulo equilátero válido?
    @Test
    public void isEquilateralTriangle(){
        Triangle triangle = new Triangle(4, 4, 4);
        assertEquals("Esse é um triângulo equilátero.", triangle.isEquilateralTriangle());
    }

    //Você tem um teste que representa um triângulo isósceles válido?
    @Test
    public void isIsoscelesTriangle(){
        Triangle triangle = new Triangle(4, 4, 2);
        assertEquals("Esse é um triângulo isósceles.", triangle.isIsoscelesTriangle());
    }

    //Você tem um teste que representa um triângulo isósceles válido em que você tenha testado as três Permutações dos dois valores iguais ?
    @Test
    public void isoscelesVariant(){
        Triangle triangle = new Triangle(3, 3, 4);
        Triangle triangle2 = new Triangle(3, 4, 3);
        Triangle triangle3 = new Triangle(4, 3, 3);

        assertEquals("Esse é um triângulo isósceles.", triangle.isIsoscelesTriangle());
        assertEquals("Esse é um triângulo isósceles.", triangle2.isIsoscelesTriangle());
        assertEquals("Esse é um triângulo isósceles.", triangle3.isIsoscelesTriangle());
    }

    //Você tem um teste que no qual um dos lados tem valor zero?
    @Test
    public void sideZero(){
        Triangle triangle = new Triangle(1, 2, 0);
        assertEquals("Um dos valores é zero", triangle.sideZero());
    }

    //Você tem um teste que no qual um dos lados tem valor negativo?
    @Test
    public void sideNegative(){
        Triangle triangle = new Triangle(1, 2, -2);
        assertEquals("Um dos valores é negativo", triangle.sideNegative());
    }

    //Você tem um teste com três inteiros maiores que zero no qual a soma de dois dos lados é igual ao terceiro?
    @Test
    public void sumIsEqual(){
        Triangle triangle = new Triangle(1, 2, 3);
        assertEquals("A soma de dois dos lados é igual ao terceiro.", triangle.sumIsEqual());
    }

    //Você tem um teste como o anterior no qual você fez a permutação dos três valores ?
    @Test
    public void sumIsEqualVariant(){
        Triangle triangle = new Triangle(1, 2, 3);
        Triangle triangle2 = new Triangle(3, 2, 1);
        Triangle triangle3 = new Triangle(3, 1, 2);

        assertEquals("A soma de dois dos lados é igual ao terceiro.", triangle.sumIsEqual());

        assertEquals("A soma de dois dos lados é igual ao terceiro.", triangle2.sumIsEqual());

        assertEquals("A soma de dois dos lados é igual ao terceiro.", triangle3.sumIsEqual());
    }

    //Você tem um teste com três inteiros maiores que zero no qual a soma de dois dos lados é menor que o terceiro?
    @Test
    public void isTriangle(){
        Triangle triangle = new Triangle(5, 4, 6);
        assertEquals("Os valores informados podem forma um triângulo", triangle.isTriangle());
    }

    //Você tem um teste como o anterior no qual você fez a permutação dos três valores ?
    @Test
    public void isTriangleVariant(){
        Triangle triangle = new Triangle(2,4,4);
        Triangle triangle2 = new Triangle(4,5,6);
        Triangle triangle3 = new Triangle(8,9,10);

        assertEquals("Os valores informados podem forma um triângulo", triangle.isTriangle());
        assertEquals("Os valores informados podem forma um triângulo", triangle2.isTriangle());
        assertEquals("Os valores informados podem forma um triângulo", triangle3.isTriangle());
    }

    //Você tem um teste que no qual todos os lados são iguais a zero?
    @Test
    public void allSideZero(){
        Triangle triangle = new Triangle(0, 0, 0);
        assertEquals("Todos os lados são iguais a zero", triangle.allSideZero());
    }
    
    //Você tem pelo menos um teste especificando valores não inteiros?
    @Test
    public void valuesNotInt(){
        Triangle triangle = new Triangle(0, 0, 0);
        assertEquals("Todos os valores são números inteiros", triangle.valuesNotInt(2,2,2));
    }

    //Você tem um teste especificando um número errado de entradas 
    @Test
    public void paramsQuantity(){
        Triangle triangle = new Triangle(0, 0, 0);
        assertEquals("Número de entradas correto", triangle.paramsQuantity(2,2,2));
    }
}

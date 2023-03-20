import model.Quadrado;
import model.Triangulo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.CalculadoraService;
import service.QuadradoService;
import service.TrianguloService;


public class CalculadoraServiceTest {
    CalculadoraService calculadoraService;
    TrianguloService trianguloService;
    QuadradoService quadradoService;
    int a;
    int b;

    @Before
    public void beforeCalcularoraService(){
        calculadoraService = new CalculadoraService();
        a = 2;
        b = 2;
        trianguloService = new TrianguloService();
        quadradoService = new QuadradoService();
    }

    @Test
    public void calculaSomaCorretamente(){
        //given:
            //before
        //When:
        int somaEsperada = calculadoraService.somar(a, b);

        //Then:
        Assert.assertEquals(4, somaEsperada);

    }

    @Test
    public void calculaSubtrairCorretamente(){
        //given:
        //before
        //When:
        int subtrairEsperado = calculadoraService.subtrair(a, b);
        //Then:
        Assert.assertTrue(subtrairEsperado == 0);
    }

    @Test
    public void calculaDividirCorretamente(){
        //given:
        //before
        //When:
        int divisaoEsperada = calculadoraService.dividir(a, b);
        //Then:
        Assert.assertFalse(divisaoEsperada != 1);
    }

    @Test
    public void calculaMultiplicarCorretamente(){
        //given:
        //before
        //When:
        int multiplicacaoEsperada = calculadoraService.multiplicar(a, b);
        //Then:
        Assert.assertTrue(multiplicacaoEsperada == 4);
    }


    @Test
    public void calculaMenorAreaDoTrianguloCorretamente () {
        //given
        Triangulo triangulo1 = new Triangulo(10,3);
        Triangulo triangulo2 = new Triangulo(10,20);

        //when
        Triangulo menorAreaTriangulo = trianguloService.trianguloDeMenorArea(triangulo1, triangulo2);

        //Then
        Assert.assertFalse(menorAreaTriangulo == triangulo2);

    }

    @Test
    public void retornaNullTriangulosDeAreasIguais () {
        //given
        Triangulo triangulo1 = new Triangulo(10,3);
        Triangulo triangulo2 = new Triangulo(10,3);

        //when
        Triangulo menorAreaTriangulo = trianguloService.trianguloDeMenorArea(triangulo1, triangulo2);

        //Then
        Assert.assertTrue(menorAreaTriangulo == null);

    }


    @Test
    public void calculaMenorAreaDoQuadradoCorretamente () {
        //given
        Quadrado quadrado1 = new Quadrado(2);
        Quadrado quadrado2 = new Quadrado(3);

        //when
        Quadrado menorAreaQuadrado = quadradoService.quadradoDeMenorArea(quadrado1, quadrado2);

        //Then
        Assert.assertTrue(menorAreaQuadrado == quadrado1);
        Assert.assertEquals(menorAreaQuadrado, quadrado1);

    }

    @Test
    public void retornaNullQuadradosDeAreasIguais () {
        //given
        Quadrado quadrado1 = new Quadrado(a);
        Quadrado quadrado2 = new Quadrado(b);

        //when
        Quadrado menorAreaQuadrado = quadradoService.quadradoDeMenorArea(quadrado1, quadrado2);

        //Then
        Assert.assertTrue(menorAreaQuadrado == null);
        Assert.assertEquals(menorAreaQuadrado, null);
        Assert.assertFalse(menorAreaQuadrado == quadrado2);
        Assert.assertNull(menorAreaQuadrado);

    }

}

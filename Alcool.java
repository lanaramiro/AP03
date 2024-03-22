public class Alcool{
  double valorLitro, quantidadeCombustivel;

  public void abastecerPorValor(){
    double porValor = valorLitro/3.90;
    System.out.println("Você abasteceu " + porValor + " litros");
  } 
  public void abastecerPorLitro(){
    double porLitro = quantidadeCombustivel * 3.90;
    System.out.println("Você deve pagar " + porLitro + " reais");
  }
}
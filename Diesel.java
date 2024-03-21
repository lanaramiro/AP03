public class Diesel{
  double valorLitro, quantidadeCombustivel;

  public void abastecerPorValor(){
    double porValor = valorLitro/4.30;
    System.out.println("Você abasteceu " + porValor + " litros");
  } 
  public void abastecerPorLitro(){
    double porLitro = quantidadeCombustivel * 4.30;
    System.out.println("Você deve pagar " + porLitro + " reais");
  }
}
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Comum comumvalor = new Comum();
    comumvalor.valorLitro = 75;
    comumvalor.abastecerPorValor();

    Comum comumqtd = new Comum();
    comumqtd.quantidadeCombustivel = 30;
    comumqtd.abastecerPorLitro();

    Aditivada aditivadavalor = new Aditivada();
    aditivadavalor.valorLitro = 75;
    aditivadavalor.abastecerPorValor();

    Aditivada aditivadaqtd = new Aditivada();
    aditivadaqtd.quantidadeCombustivel = 30;
    aditivadaqtd.abastecerPorLitro();

    Diesel dieselvalor = new Diesel();
    dieselvalor.valorLitro = 75;
    dieselvalor.abastecerPorValor();

    Diesel dieselqtd = new Diesel();
    dieselqtd.quantidadeCombustivel = 30;
    dieselqtd.abastecerPorLitro();
  }

}
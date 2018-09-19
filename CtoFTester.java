public class CtoFTester {
  public static double CtoF(double Cels) {
    return (1.8 * Cels) + 32.0;
  }
  public static double FtoC(double Fahr) {
    return (5.0/9) * (Fahr - 32);
  }
  public static void main(String[] args){
    System.out.println(FtoC(100));
    System.out.println(CtoF(100));
}
}

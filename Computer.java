import java.util.Random;

public class Computer {
  public static int decidesComputerHand() {
    // 課題User-2 Computerの手の決定とその表示
    // Randomメソッドを使って1~3の数値を返す
    Random random = new Random();
    int rnd = random.nextInt(3) + 1;
    return rnd;
  }
}

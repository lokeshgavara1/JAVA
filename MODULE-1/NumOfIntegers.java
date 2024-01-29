//Count Number of Digits in an Integer using while loop
public class NumOfIntegers {

  public static void main(String[] args) {

    int count = 0, num = 0003452;

    while (num != 0) {
      // num = num/10
      num /= 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  }
}

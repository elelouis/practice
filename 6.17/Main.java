public class Main {
  static void main() {
    for(int f=1;f<10;f++){
      for (int s=1;s<=f;s++){
        System.out.print(s+"x"+f+"="+(s * f)+"    ");
      }
      System.out.println();
    }
  }
}
// Surya Pratap Singh 

class Rstr {
  public static String rev(String s) {
      char[] c = s.toCharArray();
      int i = 0, j = c.length - 1;
      while (i < j) {
          char t = c[i];
          c[i++] = c[j];
          c[j--] = t;
      }
      return new String(c);
  }
  public static void main(String[] args) {
      System.out.println(rev("HelloWorld"));
  }
}
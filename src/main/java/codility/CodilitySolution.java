package codility;

class CodilitySolution {
  public static void main(String[] args) {
    /*Send a number and until that number print the output where
     * you replace the number with following string
     * if divisible by 2 - Codility
     * if divisble by 3 - Test
     * if divisible by 5 - Coders
     * otherwise if not divisible by 2,3 or 5 then print the number itself*/
    new A().solution(6);

    /*Check if the number exist in directory if yes return name stored
    otherwise return the phone number itself*/
    String[] phone_numbers = {"111-111-112"};
    String[] phone_owners = {"Sahil"};
    String output = new B().solution(phone_numbers, phone_owners, "111-111-111");
    System.out.println("output = " + output);
  }
}

class B {
  public String solution(String[] phone_numbers, String[] phone_owners, String number) {
    String output = "";
    for (int i = 0; i < phone_numbers.length; i++) {
      if (phone_numbers[i].equals(number)) {
        return phone_owners[i];
      }
    }
    return number;
  }
}

class A {
  public void solution(int N) {
    String output = "";
    for (int i = 1; i <= N; i++) {
      output = concatIfDivisible(output, i, 2, "Codility");
      output = concatIfDivisible(output, i, 3, "Test");
      output = concatIfDivisible(output, i, 5, "Coders");
      if (output.equals("")) output = String.valueOf(i);
      System.out.println(output);
      output = "";
    }
  }

  private String concatIfDivisible(String output, int number, int baseNumber, String label) {
    if (number % baseNumber == 0) return output.concat(label);
    return output;
  }
}

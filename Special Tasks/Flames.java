public class Flames {
    public static void main(String[] args) {
        String s1 = "SAMRITH";
        String s2 = "SANJAY";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        for (int i = 0; i < sb1.length(); i++) {
            for (int j = 0; j < sb2.length(); j++) {
                if (sb1.charAt(i) == sb2.charAt(j)) {
                    sb1.deleteCharAt(i);
                    sb2.deleteCharAt(j);
                    i--;
                    break;

                }
            }
        }
        int count = sb1.length() + sb2.length();
        StringBuilder str = new StringBuilder("FLAMES");
        int index = 0;
        while (str.length() > 1) {
            index = (index + count - 1) % str.length();
            str.deleteCharAt(index);
        }
        char result = str.charAt(0);

        System.out.print("FLAMES Result: ");
        switch (result) {
            case 'F':
                System.out.println("Friends");
                break;
            case 'L':
                System.out.println("Love");
                break;
            case 'A':
                System.out.println("Affection");
                break;
            case 'M':
                System.out.println("Marriage");
                break;
            case 'E':
                System.out.println("Enemies");
                break;
            case 'S':
                System.out.println("Siblings");
                break;
        }
    }
}
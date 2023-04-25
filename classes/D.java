public class converte
{
    public static void main(String args[]) {
        String r = converte("Abc $12d");
        System.out.println(r);
    }

    public static String converte (String str){
        String r = " ";
        int i = 0;
        do {
            char x = str.charAt(i);
            if (Character.isLowerCase(x))
                r = r.concat(Character.toString(Character.toUpperCase(x)));
            else
                r = r.concat(Character.toString(x));
            i++;
        } while (i < str.length());
        return r;
    }
}

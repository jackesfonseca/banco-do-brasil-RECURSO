public class Converte
{
    public static void main(String args[]) {
        String r = converte("Abc $12d");
        System.out.println(r);
    }

    public static String converte(String str) {
	String r=" ";
	for(char x : str)
		if(Character.isLowerCase(x))
			r=r.concat(Character.toString(Character.toUpperCase(x)));
		else
			r=r.concat(Character.toString(x));
	return r;
    }
}

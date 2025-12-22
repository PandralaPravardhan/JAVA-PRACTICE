public class sbuilding {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("MADAM");
        sb.append(" MADAM");
        System.out.println(sb);
        //System.out.println(sb.insert(11, " Iam Chitti Speed 1Tera hertz memory 1 gigabyte"));
        System.out.println(sb.length());
        System.out.println(sb.delete(0, 5));
        char[] c=sb.toString().toCharArray();
        System.out.println(c);
        System.out.println(sb.reverse());

    }
}

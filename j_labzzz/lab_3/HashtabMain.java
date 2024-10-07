
public class HashtabMain {
    public static void main(String[] args) {
        HashTab<Integer,String> newtab = new HashTab<Integer,String>();
        newtab.put(1,"subj1");
        newtab.put(2,"subj2");
        newtab.put(3,"subj3");
        newtab.remove(2);

        System.out.println(newtab.get(1));
        System.out.println(newtab.get(3));
        System.out.println(newtab.sizeCon());
        System.out.println(newtab.isEmpty());

    }
}

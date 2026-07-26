public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, " Java");
        System.out.println(sb);

        sb.replace(6, 10, "C");
        System.out.println(sb);

        sb.delete(5, 7);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}

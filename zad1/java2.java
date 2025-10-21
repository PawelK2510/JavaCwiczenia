class liczby{
    public static void main(String[] args) {
        int a = prompt(parseint());
        int b = prompt(parseint());
        int c = prompt(parseint());
        max = Math.max(a, Math.max(b, c));
        min = Math.min(a, Math.min(b, c));
        System.out.println(max);
        System.out.println(min);
    }
}
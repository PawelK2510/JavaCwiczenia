class BMI {
    public static void main(String[] args) {
        int waga = 60;
        int wzrost = 178;
        int wzrost2 = wzrost * wzrost;
        int wynik = waga / wzrost2;
        if (wynik < 18.5){
            System.out.println("Niedowaga");
        } else if (wynik > 24.9) {
            System.out.println("Nadwaga");
        }else {
            System.out.println("Waga prawidłowa");
        }
    }
}
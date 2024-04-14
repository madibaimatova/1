public class Main {
    public static void main(String[] args) {
        ageAndTemperature(45, -5);
        ageAndTemperature(11, 1);
        ageAndTemperature(26,  -3);
        ageAndTemperature(50, 31);
        ageAndTemperature(12, -13);

    }
    public static String ageAndTemperature(int age, double temperature) {

        if (age > 18 && age < 48) {
            if (temperature > -15 && temperature < 28) {
                System.out.println("Можно идти гулять");

            }
        } else if (age <= 22) {
            if (temperature > 1 && temperature < 24) {
                System.out.println("Можно идти гулять");
            }
        } else if (age >= 46) {
            if (temperature > -12 && temperature < 25) {
                System.out.println("Можно идти гулять");
            } else {
                System.out.println("Оставайтесь дома!");
            }
        }
        return "Возраст человека = " + age + " Температура на улице = " + temperature;
    }
}
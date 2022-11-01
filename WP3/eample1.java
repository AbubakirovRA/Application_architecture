class Praktikum {
    public static void main(String[] args) {

        double moneyBeforeSalary = 16000.0; // Количество денег до зарплаты
        int daysBeforeSalary = 18;

        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 10000) {
            // Здесь нужное условие уже добавили
            if (daysBeforeSalary < 10) {
                System.out.println("Окей, пора в Макдак!");
            } else {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            }
            
        } else if (moneyBeforeSalary < 15000) {
			// Допишите условие
            if (daysBeforeSalary < 17) {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
            } else {
                System.out.println("Окей, пора в Макдак!");
            }

        } else {
			// Если до зарплаты меньше 10 дней, то едим крабов
            if (daysBeforeSalary < 10) {
            System.out.println("Класс! Заказывайте крабов!");
            // Иначе — доллары и ужин в хорошем ресторане
            } else {
            System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
            }
        }
    }
}
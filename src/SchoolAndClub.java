public class SchoolAndClub {

    public static void main(String[] args) {
        // Создаем анонимный класс для School
        interface Club {
            String getName();
            String getActivityType();
            int getNumberOfKids();
            double getCost();
        }

        interface School {
            String getName();
            String getDirector();
            String getAddress();
            String getPhone();
        }

        School school = new School() {
            @Override
            public String getName() {
                return "Средняя школа №1";
            }

            @Override
            public String getDirector() {
                return "Иванов Иван Иванович";
            }

            @Override
            public String getAddress() {
                return "г. Москва, ул. Пушкина, д. 10";
            }

            @Override
            public String getPhone() {
                return "8 (888) 555-35-35";
            }
        };

        // Создаем анонимный класс для Club
        Club club = new Club() {
            @Override
            public String getName() {
                return "Театральный кружок";
            }

            @Override
            public String getActivityType() {
                return "Театр";
            }

            @Override
            public int getNumberOfKids() {
                return 15;
            }

            @Override
            public double getCost() {
                return 500.00;
            }
        };

        // Печатаем информацию о школе и кружке
        System.out.println("Информация о школе:");
        System.out.println("Название: " + school.getName());
        System.out.println("Директор: " + school.getDirector());
        System.out.println("Адрес: " + school.getAddress());
        System.out.println("Телефон: " + school.getPhone());

        System.out.println("\nИнформация о кружке:");
        System.out.println("Название: " + club.getName());
        System.out.println("Вид деятельности: " + club.getActivityType());
        System.out.println("Количество детей: " + club.getNumberOfKids());
        System.out.println("Стоимость: " + club.getCost() + " руб.");
    }
}
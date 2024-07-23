import java.awt.*;
import java.util.*;
import java.util.List;

public class LaptopMain {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop(2, 512, "Windows8", "Black");
        Laptop laptop2 = new Laptop(2, 1024, "Windows10", "White");
        Laptop laptop3 = new Laptop(4, 1024, "Windows8", "Black");
        Laptop laptop4 = new Laptop(4, 2048, "Windows10", "White");
        Laptop laptop5 = new Laptop(8, 1024, "Windows10", "Black");
        Laptop laptop6 = new Laptop(8, 2048, "Windows11", "White");
        Laptop laptop7 = new Laptop(16, 1024, "Windows11", "Black");
        Laptop laptop8 = new Laptop(16, 2048, "Windows11", "Gold");
        Laptop laptop9 = new Laptop(32, 1024, "Windows11", "Black");
        Laptop laptop10 = new Laptop(32, 2048, "Windows11", "Gold");

        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8, laptop9, laptop10));

        Map<Integer, String> mapForCriteria = new HashMap<>();
        mapForCriteria.put(1, "ram");
        mapForCriteria.put(2, "hdd");
        mapForCriteria.put(3, "os");
        mapForCriteria.put(4, "color");

        Map<String, Integer> mapForFilter = new HashMap<>();
        Map<String, String> mapForFilterStr = new HashMap<>();

        while (true) {
            System.out.println("\n* LAPTOP Store *");
            System.out.println("Показать весь список               (введите \"1\")");
            System.out.println("Поиск по объему Оперативной памяти (введите \"2\")");
            System.out.println("Поиск по объему Жесткого диска     (введите \"3\")");
            System.out.println("Поиск по виду Операционной системы (введите \"4\")");
            System.out.println("Поиск по цвету                     (введите \"5\")");
            System.out.println("Поиск по минимальным критериям     (введите \"6\")");
            System.out.println("Показать отфильтрованный список    (введите \"7\")");
            System.out.println("Завершить работу!                  (введите \"q\")");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("q")) {
                System.out.println("\nРабота успешно завершена!");
                break;
            }

            if (input.equals("1")) {
                for (Laptop laptop : laptops) {
                    System.out.println(laptop + "\n");
                }
            }

            if (input.equals("2")) {
                System.out.println("Введите желаемый объем Оперативной памяти!");
                System.out.println("Возможные варианты: 2 ГБ, 4 ГБ, 8 ГБ, 16 ГБ, 32 ГБ (введите число без букв)");
                int ram = scanner.nextInt();
                if (ram == 2) {
                    for (Laptop laptop : laptops) {
                        String str = laptop.toString();
                        if (str.contains("Оперативная память: 2 ГБ")) {
                            System.out.println(laptop);
                        }
                    }
                }
                if (ram == 4) {
                    for (Laptop laptop : laptops) {
                        String str = laptop.toString();
                        if (str.contains("Оперативная память: 4 ГБ")) {
                            System.out.println(laptop);
                        }
                    }
                }
                if (ram == 8) {
                    for (Laptop laptop : laptops) {
                        String str = laptop.toString();
                        if (str.contains("Оперативная память: 8 ГБ")) {
                            System.out.println(laptop);
                        }
                    }
                }
                if (ram == 16) {
                    for (Laptop laptop : laptops) {
                        String str = laptop.toString();
                        if (str.contains("Оперативная память: 16 ГБ")) {
                            System.out.println(laptop);
                        }
                    }
                }
                if (ram == 32) {
                    for (Laptop laptop : laptops) {
                        String str = laptop.toString();
                        if (str.contains("Оперативная память: 32 ГБ")) {
                            System.out.println(laptop);
                        }
                    }
                }
            }

            if (input.equals("3")) {
                System.out.println("Введите желаемый объем Жесткого диска!");
                System.out.println("Возможные варианты: 512 ГБ, 1024 ГБ, 2048 ГБ (введите число без букв)");
                int ram = scanner.nextInt();
                if (ram == 512) {
                    for (Laptop laptop : laptops) {
                        String str = laptop.toString();
                        if (str.contains("Объем жесткого диска: 512 ГБ")) {
                            System.out.println(laptop);
                        }
                    }
                }
                if (ram == 1024) {
                    for (Laptop laptop : laptops) {
                        String str = laptop.toString();
                        if (str.contains("Объем жесткого диска: 1024 ГБ")) {
                            System.out.println(laptop);
                        }
                    }
                }
                if (ram == 2048) {
                    for (Laptop laptop : laptops) {
                        String str = laptop.toString();
                        if (str.contains("Объем жесткого диска: 2048 ГБ")) {
                            System.out.println(laptop);
                        }
                    }
                }
            }

            if (input.equals("4")) {
                System.out.println("Выбирете желаемую Операционную систему!");
                System.out.println("Возможные варианты: Windows8, Windows10, Windows11 (введите число 8, 10 или 11, без букв)");
                int ram = scanner.nextInt();

                if (ram == 8) {
                    for (Laptop laptop : laptops) {
                        String str = laptop.toString();
                        if (str.contains("Windows8")) {
                            System.out.println(laptop);
                        }
                    }
                }
                if (ram == 10) {
                    for (Laptop laptop : laptops) {
                        String str = laptop.toString();
                        if (str.contains("Windows10")) {
                            System.out.println(laptop);
                        }
                    }
                }
                if (ram == 11) {
                    for (Laptop laptop : laptops) {
                        String str = laptop.toString();
                        if (str.contains("Windows11")) {
                            System.out.println(laptop);
                        }
                    }
                }
            }
            if (input.equals("5")) {
                System.out.println("Выбирете желаемый цвет!");
                System.out.println("Возможные варианты: 1. Black, 2. White, 3. Gold (введите цифру соответствующую цвету, без букв)");
                int ram = scanner.nextInt();
                if (ram == 1) {
                    for (Laptop laptop : laptops) {
                        String str = laptop.toString();
                        if (str.contains("Black")) {
                            System.out.println(laptop);
                        }
                    }
                }
                if (ram == 2) {
                    for (Laptop laptop : laptops) {
                        String str = laptop.toString();
                        if (str.contains("White")) {
                            System.out.println(laptop);
                        }
                    }
                }
                if (ram == 3) {
                    for (Laptop laptop : laptops) {
                        String str = laptop.toString();
                        if (str.contains("Gold")) {
                            System.out.println(laptop);
                        }
                    }
                }
            }

            if (input.equals("6")) {
                System.out.println("\n* Поиск по критериям *");
                System.out.println("1 - Объем оперативной памяти");
                System.out.println("2 - Объем жесткого диска");
                System.out.println("3 - Операционная система");
                System.out.println("4 - Цвет");

                System.out.println("Выбирите один из критериев поиска (введите соответствующую цифру)");
                Scanner scanner1 = new Scanner(System.in);
                int input1 = scanner1.nextInt();

                if (mapForCriteria.containsKey(input1)) {

                    if (mapForCriteria.get(input1).equals("ram")) {
                        System.out.println("Введите желаемый объем Оперативной памяти!");
                        System.out.println("Возможные варианты: 2 ГБ, 4 ГБ, 8 ГБ, 16 ГБ, 32 ГБ (введите число без букв)");
                        int inputRam = scanner.nextInt();
                        mapForFilter.put(mapForCriteria.get(input1), inputRam);

                        List<Object> filteredList = listSearchLaptops(laptops, mapForFilter);
                        if (filteredList.isEmpty()) {
                            System.out.println("Нет соответствующих ноубуков!");
                        }
                        for (Object el : filteredList) {
                            System.out.println(el);
                        }
                        filteredList.clear();
                    }
                    if (mapForCriteria.get(input1).equals("hdd")) {
                        System.out.println("Введите желаемый объем Жесткого диска!");
                        System.out.println("Возможные варианты: 512 ГБ, 1024 ГБ, 2048 ГБ (введите число без букв)");
                        Integer inputHdd = scanner.nextInt();
                        mapForFilter.put(mapForCriteria.get(input1), inputHdd);

                        List<Object> filteredList = listSearchLaptops(laptops, mapForFilter);
                        if (filteredList.isEmpty()) {
                            System.out.println("Нет соответствующих ноубуков!");
                        }
                        for (Object el : filteredList) {
                            System.out.println(el);
                        }
                        filteredList.clear();
                    }
                    if (mapForCriteria.get(input1).equals("os")){
                        System.out.println("Выбирете желаемую Операционную систему!");
                        System.out.println("Возможные варианты: Windows8, Windows10, Windows11 (введите нужную)");
                        String inputOs = scanner.nextLine();
                        String input1strOs = Integer.toString(input1);
                        mapForFilterStr.put(mapForCriteria.get(input1), inputOs);

                        List<Object> filteredList2 = listSearchLaptopsStr(laptops, mapForFilterStr);
                        if (filteredList2.isEmpty()) {
                            System.out.println("Нет соответствующих ноубуков!");
                        }
                        for (Object el : filteredList2) {
                            System.out.println(el);
                        }
                        filteredList2.clear();
                    }
                    if (mapForCriteria.get(input1).equals("color")){
                        System.out.println("Выбирете желаемый цвет!");
                        System.out.println("Возможные варианты: 1. Black, 2. White, 3. Gold (введите нужный)");
                        String inputColor = scanner.nextLine();
                        String input1strColor = Integer.toString(input1);
                        mapForFilterStr.put(mapForCriteria.get(input1), inputColor);

                        List<Object> filteredList2 = listSearchLaptopsStr(laptops, mapForFilterStr);
                        if (filteredList2.isEmpty()) {
                            System.out.println("Нет соответствующих ноубуков!");
                        }
                        for (Object el : filteredList2) {
                            System.out.println(el);
                        }
                        filteredList2.clear();
                    }


                } else {
                    System.out.println("ОШИБКА: некорректный ввод");
                }

            }



        }



    }
    public static List<Object> listSearchLaptops(Set <Laptop> laptops, Map <String, Integer> filterIn){
        List<Object> list = new ArrayList<>();

        for (Map.Entry<String, Integer> map : filterIn.entrySet()) {
            String key = map.getKey();
            int val = map.getValue();

            if (key.equals("ram")) {
                for (Laptop el : laptops) {
                    int ram = el.getRandomAccessMemory();
                    if (ram >= val) {
                        list.add(el);
                    }

                }
            }
            if (key.equals("hdd")){
                for (Laptop el : laptops){
                    int hdd = el.getHardDiscCapacity();
                    if (hdd >= val){
                        list.add(el);
                    }

                }
            }


        }

        return list;
    }

    public static List<Object> listSearchLaptopsStr(Set <Laptop> laptops, Map <String, String> filterIn) {
        List<Object> list = new ArrayList<>();

        for (Map.Entry<String, String> map : filterIn.entrySet()) {
            String key = map.getKey();
            String val = map.getValue();

            if (key.equals("os")) {
                for (Laptop el : laptops) {
                    String os = el.getOperationSystem();
                    if (val.equals(os)) {
                        list.add(el);
                    }

                }
            }

            if (key.equals("color")) {
                for (Laptop el : laptops) {
                    String color = el.getColor();
                    if (val.equals(color)) {
                        list.add(el);
                    }

                }
            }

        }

        return list;
    }
}

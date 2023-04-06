import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<CoffeeShops> shops = new ArrayList<>();
        ArrayList<Coffee> coffees = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Мир Кофе\n1. Кофейни\n2. Кофе\n3. Сотрудники");
            int CategoryNumber = scanner.nextInt();
            if (CategoryNumber == 1) {
                System.out.println("1. Добавить Кофейню\n2. Показать Кофейни\n3. Изменить Кофейню\n4. Удалить Кофейню ");
                int CofeeShopPicker = scanner.nextInt();
                if (CofeeShopPicker == 1) {
                    System.out.println("Введите название кофейни: ");
                    String NewName = scanner.next();
                    System.out.println("Введите адрес кофейни: ");
                    String NewAddress = scanner.next();
                    shops.add(new CoffeeShops(NewName, NewAddress));
                } else if (CofeeShopPicker == 2) {
                    int i = 1;
                    if (shops != null) {
                        for (var item : shops
                        ) {
                            System.out.println("Номер: " + i + " Название: " + item.GetName() + " Адрес: " + item.GetAddress() + "\n");
                        }
                    }
                } else if (CofeeShopPicker == 3) {
                    System.out.println("Введите номер кофейни, которую хотите изменить: ");
                    int number = scanner.nextInt();
                    if (shops != null) {
                        for (int i = 0; i < shops.size(); i++) {
                            if (i == number - 1) {
                                System.out.println("Введите название кофейни: ");
                                String NewName = scanner.next();
                                System.out.println("Введите адрес кофейни: ");
                                String NewAddress = scanner.next();
                                shops.remove(i);
                                shops.add(new CoffeeShops(NewName, NewAddress));
                            }
                        }
                    }
                } else if (CofeeShopPicker == 4) {
                    System.out.println("Введите номер кофейни, которую хотите удалить: ");
                    int number = scanner.nextInt();
                    if (shops != null) {
                        for (int i = 0; i < shops.size(); i++) {
                            if (i == number - 1) {
                                shops.remove(i);
                            }
                        }
                    }
                }
            }else if (CategoryNumber == 2) {
                    System.out.println("1. Добавить Кофе\n2. Показать Кофе\n3. Изменить Кофе\n4. Удалить Кофе ");
                    int CoffeePicker = scanner.nextInt();
                    if (CoffeePicker == 1) {
                        System.out.println("Введите название: ");
                        String NewName = scanner.next();
                        System.out.println("Введите адрес: ");
                        Float NewSize = scanner.nextFloat();
                        coffees.add(new Coffee(NewName, NewSize));
                    }
                    else if (CoffeePicker == 2){
                        int i = 1;
                        if (shops != null) {
                            for (var item : coffees
                            ) {
                                System.out.println("Номер: " + i + " Название: " + item.GetName() + " Размер: " + item.GetSize() + "\n");
                            }
                        }
                    }
                    else if (CoffeePicker == 3){
                        System.out.println("Введите номер кофе, которое хотите изменить: ");
                        int number = scanner.nextInt();
                        if (shops != null) {
                            for (int i = 0; i < coffees.size(); i++) {
                                if (i == number - 1) {
                                    System.out.println("Введите название кофе: ");
                                    String NewName = scanner.next();
                                    System.out.println("Введите размер кофе: ");
                                    Float NewSize = scanner.nextFloat();
                                    coffees.remove(i);
                                    coffees.add(new Coffee(NewName, NewSize));
                                }
                            }
                        }
                    }
                    else if (CoffeePicker == 4){
                        System.out.println("Введите номер кофейни, которую хотите удалить: ");
                        int number = scanner.nextInt();
                        if (shops != null) {
                            for (int i = 0; i < coffees.size(); i++) {
                                if (i == number - 1) {
                                    coffees.remove(i);
                                }
                            }
                        }
                    }
                    }

                else if (CategoryNumber == 3) {
                System.out.println("1. Добавить Сотрудника\n2. Показать Сотрудников\n3. Изменить Сотрудника\n4. Удалить Сотрудника ");
                int EmployeePicker = scanner.nextInt();
                if (EmployeePicker == 1) {
                    System.out.println("Введите имя сотрудника: ");
                    String NewName = scanner.next();
                    System.out.println("Введите фамилию сотрудника: ");
                    String NewSurname = scanner.next();
                    System.out.println("Введите отчество сотрудника: ");
                    String NewLastname = scanner.next();
                    System.out.println("Введите зарплату сотрудника: ");
                    int NewSalary = scanner.nextInt();
                    System.out.println("Введите должность сотрудника: ");
                    String NewJobTitle = scanner.next();
                    employees.add(new Employee(NewName, NewSurname, NewLastname, NewSalary, NewJobTitle));
                }
                else if (EmployeePicker == 2){
                    int i = 1;
                    if (employees != null) {
                        for (var item : employees
                        ) {
                            System.out.println("Номер: " + i + " Имя: " + item.GetName() + " Фамилия: " + item.GetSurname() +
                                    " Отчество: " + item.GetLastname()  + " Зарплата: " + item.GetSalary() + " Должность: " + item.GetJobtitle());
                        }
                    }
                }
                else if (EmployeePicker == 3){
                    System.out.println("Введите номер сотрудника, которого хотите изменить: ");
                    int number = scanner.nextInt();
                    if (employees != null) {
                        for (int i = 0; i < employees.size(); i++) {
                            if (i == number - 1) {
                                System.out.println("Введите имя сотрудника: ");
                                String NewName = scanner.next();
                                System.out.println("Введите фамилию сотрудника: ");
                                String NewSurname = scanner.next();
                                System.out.println("Введите отчество сотрудника: ");
                                String NewLastname = scanner.next();
                                System.out.println("Введите зарплату сотрудника: ");
                                int NewSalary = scanner.nextInt();
                                System.out.println("Введите должность сотрудника: ");
                                String NewJobTitle = scanner.next();
                                employees.remove(i);
                                employees.add(new Employee(NewName, NewSurname, NewLastname, NewSalary, NewJobTitle));
                            }
                        }
                    }
                }
                else if (EmployeePicker == 4){
                    System.out.println("Введите номер сотрудника, которого хотите удалить: ");
                    int number = scanner.nextInt();
                    if (employees != null) {
                    for (int i = 0; i < employees.size(); i++) {
                        if (i == number - 1) {
                            employees.remove(i);
                        }
                    }
                    }
                }
                }
            }
        }
    }

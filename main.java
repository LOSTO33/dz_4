import java.util.ArrayList;
import java.util.List;
// Шаг 3: Наполнение коробки фруктами

// Создайте статический метод getFruitBox(), который будет создавать коробку Box<Fruit> и наполнять ее несколькими фруктами разных типов.
// Например, вы можете поместить в коробку одно яблоко (Apple) и один апельсин (Orange).
// Шаг 4: Вывод содержимого коробки

// Создайте статический метод printBox(Box<?> box), который принимает коробку с фруктами и выводит на консоль содержимое коробки, вызывая toString() для каждого фрукта в коробке.
// Используйте символ ? для указания, что метод может работать с коробками любого типа фруктов.
// Шаг 5: Ограничение типа в классе Box

// Сделайте класс Box<T> обобщенным с ограничением так, чтобы он мог хранить только фрукты (и их подклассы). Например, Box<T extends Fruit>.

// Измените метод printBox, чтобы он принимал только коробки с фруктами. Используйте Box<? extends Fruit> как тип аргумента метода.

// Шаг 6: Тестирование

// В методе main, создайте коробку с фруктами, наполните ее разными фруктами разных типов с помощью метода getFruitBox,
// и вызовите метод printBox для этой коробки, чтобы вывести содержимое на консоль.
// Это задание позволит вам попрактиковаться в создании обобщенных классов, использовании ограничений типа и работе с обобщенными методами/






public class main {
    public class testmain{
        public static Box<Fruit> getFruitBox(String [] a) {
            return  ;
        }

    }

}

package pl.sdacademy.reflection;

import pl.sdacademy.exception.CustomRuntimeException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Cat cat = new Cat(6, "Ragdoll");

        // Mechanizm refleksji to mechanizm, dzięki któremu możemy w czasie życia aplikacji (w runtime'ie)
        // odwoływać się do definicji typów.

        // Obiekty typu Class reprezentują konkretny typ. Każdy typ (nawet typy prymitywne oraz void) będzie miał
        // utworzony odpowiednik w postaci jednego obiektu typu Class.

        // Każdy obiekt oferuje metodę getClass, która zwróci obiekt reprezentujący jego typ.
//        Class<?> catClass = cat.getClass();
        // Do obiektu tego typu możemy odwołać się odwołać za pomocą odwołania statycznego class,
        // które oferują wszystkie typy.
//        Class<?> catClass = cat.getClass();
        Class<?> catClass = Cat.class;

        // Przykłady użycia obiektu reprezentującego klasę:
        System.out.println("Pełna nazwa klasy: " + catClass.getName());
        System.out.println("Skrócona nazwa klasy (bez pakietu): " + catClass.getSimpleName());

        System.out.println("\nPola klasy Cat:");
        Field[] declaredFields = catClass.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("Nazwa pola: " + field.getName() + ", typ pola: " + field.getType().getSimpleName());
        }

        System.out.println("\nMetody klasy Cat:");
        Method[] declaredMethods = catClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println("Nazwa metody: " + method.getName()
                    + ", metoda zwraca wartość typu: " + method.getReturnType().getSimpleName());
            System.out.println("Czy ma adnotację MyAnnotation: " + method.isAnnotationPresent(MyAnnotation.class));
        }

        Field ageField = catClass.getDeclaredField("age");
        ageField.setAccessible(true);
        System.out.println("\nWartość pola age kota przypisanego do zmiennej cat: " + ageField.get(cat));
        ageField.setInt(cat, 10);
        System.out.println("Nowa wartość pola age kota: " + cat.getAge());

        Method setBreedMethod = catClass.getDeclaredMethod("setBreed", String.class);
        System.out.println("\nWywołanie metody setBreed");
        setBreedMethod.invoke(cat, "Neva Masquerade");
        System.out.println("Nowa wartość pola breed kota: " + cat.getBreed());
    }
}

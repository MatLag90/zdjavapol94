package pl.sdacademy;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        // Zwróćmy uwagę na to, że korzystamy z klasy StringUtils z pakietu org.apache.commons.lang3
        // jest to pakiet znajdujący się w dołączonej zależności.
        System.out.println(StringUtils.isAlphanumeric("Aba22arge99345"));
    }
}

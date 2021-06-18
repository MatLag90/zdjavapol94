package classes.methods;

public class Car {
    // Jeśli będziemy tworzyć pola w klasie, to najczęściej będą to pola prywatne. Wynika to z faktu, że chcemy
    // odwoływać się do istniejącego obiektu przy użyciu udostępnionych metod. Takie postępowanie nazywamy
    // hermetyzacją lub enkapsulacją. Szerszy opis, dlaczego moglibyśmy
    // chcieć działać w taki sposób pojawi się później.
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    // Pole String jest prywatne. Jeśli chcemy upublicznić możliwość pobrania jego wartości. Utworzymy więc metodę
    // o nazwie zaczynającej się od słowa get, po czym mamy nazwę pola. Metoda zwróci wartość pola.
    // Metody takie nazywamy getterami.
    // W sygnaturze metody nie zapisujemy słówka "static" (więcej o nim niebawem).
    public String getModel() {
        // Metoda będzie wywoływana w kontekście konkretnego obiektu. Możemy więc odwołać się do jego pól.
        return model; // inaczej: return this.model;
    }

    // W pełni analogiczny getter pola speed.
    public int getSpeed() {
        return speed;
    }

    // Metoda służąca do ustawienia wartości pola nazywana jest setterem. Nie zwraca wartości, przyjmuje argument,
    // który przypisze do aktualizowanego pola. Nazwa metody rozpoczyna się od słówka set, po którym następuje nazwa
    // pola.
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Przykładowa metoda niebędąca getterem ani setterem.
    public void accelerate() {
        // Metoda zwiększa wartość przypisaną do pola speed o 10.
        speed += 10;
    }
}

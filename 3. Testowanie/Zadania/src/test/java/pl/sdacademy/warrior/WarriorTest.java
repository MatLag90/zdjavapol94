package pl.sdacademy.warrior;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WarriorTest {
//  1. Stwórz test sprawdzający, czy wojownik zada drugiemu wojownikowi cios równy sile jego ataku.
    @Test
    void shouldDoDamage() {
        // given
        Warrior superman = new Warrior("Superman", 50, 900);
        Warrior witcher = new Warrior("Witcher", 20, 120);
        // when
        superman.hit(witcher);
        // then
        assertThat(witcher.getHealthPoints())
                .isEqualTo(70);
    }

//    2.a Stwórz test sprawdzający, czy konstruktor jednoparametrowy
//    z klasy Warrior utworzy wojownika o stu punktach życia.
    @Test
    void shouldCreateWarriorWith100HealthPoints() {
        // given
        // when
        Warrior thorgal = new Warrior("Thorgal");
        // then
        assertThat(thorgal.getHealthPoints())
                .isEqualTo(Warrior.DEFAULT_HEALTH_POINTS);
    }

}

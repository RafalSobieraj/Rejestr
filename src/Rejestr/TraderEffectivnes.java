package ProgramowanieObiektowe.Zadanie5Pracownicy;

import java.util.Arrays;
import java.util.List;

public enum TraderEffectivnes {

    NISKA(60),
    ŚREDNIA(90),
    WYSOKA(120);

    int value;
    public int getValue() {
        return value;
    }

    TraderEffectivnes(int value) {
        this.value = value;
    }

    public static List<TraderEffectivnes> getAllEffectivnes() {
        return Arrays.asList(NISKA, ŚREDNIA, WYSOKA);
    }
}

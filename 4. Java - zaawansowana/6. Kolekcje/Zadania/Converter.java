package pl.sdacademy.collections.exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 11. Tworzymy klasę Converter, która będzie typem generycznym,
// która będzie miała w generyczny sposób napisane metody z zadań 7 oraz 8
// (nazwijmy je toSet oraz toList).
public class Converter<E> {
    public Set<E> toSet(List<E> list) {
        return new HashSet<>(list);
    }

    public List<E> toList(Set<E> set) {
        return new ArrayList<>(set);
    }
}

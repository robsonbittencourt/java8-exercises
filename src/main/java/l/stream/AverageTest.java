package l.stream;

import java.util.ArrayList;
import java.util.List;

public class AverageTest {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.stream()
				.mapToInt(Curso::getAlunos)
				.average()
				.ifPresent(System.out::println);
	}

}

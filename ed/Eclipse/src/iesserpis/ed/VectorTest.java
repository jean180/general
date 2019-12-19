package ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void max() {
		assertEquals(21, Vector.max((new int[] { 14, 21, 12, 9, 7 })));

		// Caso de vector vacio
		Assertions.assertThrows(IllegalArgumentException.class, () -> Vector.max(new int[] {}));

	}

	@Test
	void selectionSort() {
		int[] v1 = { 13, 18, 13, 13 };
		Vector.selectionSort(v1);
		assertArrayEquals(new int[] { 13, 13, 13, 18 }, v1);
	}

	@Test
	void Min() {
		assertEquals(7, Vector.Min((new int[] { 14, 21, 12, 9, 7 })));
	}

}

package com.bitwiseglobal.gpqa.assignment1;

import org.junit.Test;

public class FieldGeneratorTest {

	@Test
	public void itShouldTestNonTransposedRow() {
		FieldGenerator generator = new FieldGenerator(3, 9);
		System.out.println("ROW "+generator.populateNonTransposedRow(30));
	}

	@Test
	public void itShouldTestTransposedRow() {
		FieldGenerator generator = new FieldGenerator(3, 15);
		generator.populateField();
		generator.displayField(generator.getField());


	}
}

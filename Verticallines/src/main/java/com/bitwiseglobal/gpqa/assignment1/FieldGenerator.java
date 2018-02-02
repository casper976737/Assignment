package com.bitwiseglobal.gpqa.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FieldGenerator {
	private Integer fieldHeight = 0;
	private Integer fieldBreadth = 0;
	List<List<Integer>> field = new ArrayList<>();

	public FieldGenerator(Integer fieldHeight, Integer fieldBreadth) {
		super();
		this.fieldHeight = fieldHeight;
		this.fieldBreadth = fieldBreadth;
	}

	public void populateField() {
		List<List<Integer>> nonTransposedField = new ArrayList<>();
		for (int i = 0; i < fieldHeight; i++) {
			List<Integer> nonTransposedRow = populateNonTransposedRow(fieldBreadth);
			nonTransposedField.add(nonTransposedRow);
		}
		field = MathFunctions.transposeList(nonTransposedField);
	}

	public List<List<Integer>> getField() {
		return field;
	}

	public void displayField(List<List<Integer>> field) {
	      String result = "";
	      for(int i = 0; i < field.size(); i++){
	          for(int j = 0; j < field.get(i).size(); j++){
	              if(field.get(i).get(j)==null)
	            	  result +=" ";
	              else
	        	  result += field.get(i).get(j);
	          }
	          result += "\n";
	      }
	      System.out.println(result);
	}

	public List<Integer> populateNonTransposedRow(Integer fieldHeight2) {

		List<Integer> listtoreturn = new ArrayList<>();
		Integer sizetocompare = 0;
		Random random = new Random();
		while (sizetocompare < fieldHeight2) {
			int timesnum = random.nextInt(9);
			if (timesnum == 0) {
				while (timesnum == 0) {
					timesnum = random.nextInt(9);
				}
			}
			int num = random.nextInt(9);
			if (sizetocompare + timesnum > fieldHeight2) {
				timesnum = fieldHeight2 - sizetocompare;
			}
			for (int i = 0; i < timesnum; i++) {
				listtoreturn.add(num);
			}
			sizetocompare += timesnum;
			int timesspace = random.nextInt(9);
			if (timesspace == 0) {
				while (timesspace == 0) {
					timesspace = random.nextInt(9);
				}
			}
			if (sizetocompare + timesspace > fieldHeight2) {
				timesspace = fieldHeight2 - sizetocompare;
			}
			for (int i = 0; i < timesspace; i++) {
				listtoreturn.add(null);
			}
			sizetocompare += timesspace;
		}

		return listtoreturn;
	}

}

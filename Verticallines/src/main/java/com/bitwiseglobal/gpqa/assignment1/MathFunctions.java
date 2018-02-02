package com.bitwiseglobal.gpqa.assignment1;

import java.util.ArrayList;
import java.util.List;

public class MathFunctions {

	public static <T> List<List<T>> transposeList(List<List<T>> twoDimentionalList) {
		List<List<T>> returnList = new ArrayList<>();
        final int N = twoDimentionalList.get(0).size();
        for (int i = 0; i < N; i++) {
            List<T> col = new ArrayList<>();
            for (List<T> row : twoDimentionalList) {
                col.add(row.get(i));
            }
            returnList.add(col);
        }
		return returnList;
	}
}

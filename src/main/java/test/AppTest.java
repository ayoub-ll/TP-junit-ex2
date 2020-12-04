package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import org.junit.jupiter.api.Test;

import src.App;

public class AppTest {

	@Test
	public void UnionSetTest() {
		Vector<Object> listOne = new Vector<Object>(3);
		listOne.add("1");
		listOne.add(2);
		listOne.add("3");
		
		Vector<Object> listTwo = new Vector<Object>(3);
		double chiffre = 2;
		listOne.add("1");
		listOne.add(chiffre);

		Vector<Object> expected = new Vector<Object>(6);
		expected.add("1");
		expected.add(2);
		expected.add("3");
		
        assertEquals(expected, App.unionSet(listOne, listTwo));
	}
}

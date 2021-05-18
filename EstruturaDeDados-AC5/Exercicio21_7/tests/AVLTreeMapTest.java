package tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import Exercicio21_7.AVLTreeMap;


public class AVLTreeMapTest {
	@Test
	void test() {
	AVLTreeMap<Integer, Integer> avl = new AVLTreeMap<Integer, Integer>();
	avl.put(44, 44);
	avl.put(17, 17);
	avl.put(78, 78);
	avl.put(32, 32);
	avl.put(50, 50);
	avl.put(88, 88);
	avl.put(48, 48);
	avl.put(62, 62);
	System.out.println("Uso da impress�o parentizada de uma �rvore AVL para visualizar \n"
	+ "que ela fica balanceada ap�s as inser��es e remo��es\n");
	System.out.println("========================================");
	System.out.println("Antes da inser��o de 54\n" + avl.printExpression(avl.root()));
	avl.put(54, 54);
	assertEquals("[17, 32, 44, 48, 50, 54, 62, 78, 88]", avl.keySet().toString());
	System.out.println("Ap�s a inser��o de 54\n" + avl.printExpression(avl.root()));
	System.out.println("========================================");
	System.out.println("Antes da remo��o de 32\n" + avl.printExpression(avl.root()));
	avl.remove(32);
	assertEquals("[17, 44, 48, 50, 54, 62, 78, 88]", avl.keySet().toString());
	System.out.println("Ap�s a remo��o de 32\n" + avl.printExpression(avl.root()));
	}
}

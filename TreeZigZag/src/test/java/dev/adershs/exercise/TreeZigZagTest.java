package dev.adershs.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeZigZagTest {

	@Test
	void longest() {
		// Test data (5, (3, (20, (6, None, None), None), None), (10, (1, None, None), (15, (30, None, (9, None, None)), (8, None, None))))
		Tree tree = Tree.getBuilder().x(5)
				.left(Tree.getBuilder().x(3).left(Tree.getBuilder().x(20).left(Tree.getBuilder().x(6).build()).build()).build())
				.right(Tree.getBuilder().x(10).left(Tree.getBuilder().x(1).build())
						.right(Tree.getBuilder().x(15).right(Tree.getBuilder().x(8).build())
								.left(Tree.getBuilder().x(30).right(Tree.getBuilder().x(9).build()).build()).build()).build()).build();
		assertEquals(2, TreeZigZag.from(tree).longest());
	}
}

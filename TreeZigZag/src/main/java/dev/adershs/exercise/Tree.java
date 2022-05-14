package dev.adershs.exercise;

public class Tree {
	int x;
	Tree l;
	Tree r;

	private Tree(){

	}

	public static TreeBuilder getBuilder() {
		return new TreeBuilder();
	}

	public static final class TreeBuilder {
		private int x;
		private Tree l;
		private Tree r;

		private TreeBuilder() {
		}

		public static TreeBuilder aTree() {
			return new TreeBuilder();
		}

		public TreeBuilder x(int x) {
			this.x = x;
			return this;
		}

		public TreeBuilder left(Tree l) {
			this.l = l;
			return this;
		}

		public TreeBuilder right(Tree r) {
			this.r = r;
			return this;
		}

		public Tree build() {
			Tree tree = new Tree();
			tree.x = this.x;
			tree.r = this.r;
			tree.l = this.l;
			return tree;
		}
	}
}

package dev.adershs.exercise;

/**
 * Class to help Zig zag travel throught the root tree nodes
 */
public class TreeZigZag {
	private Integer maxLength = null;

	private final Tree root;

	public static TreeZigZag from(Tree root){
		return new TreeZigZag(root);
	}

	/**
	 * ZigZag object for the given root
	 * @param root the root node
	 */
	private TreeZigZag(Tree root){
		this.root = root;
	}

	/**
	 * Calculate and return the max zig Zag length
	 * @return Max zig zag length
	 */
	public int longest(){
		//No need to recalualte
		if(maxLength != null){
			return maxLength;
		}
		maxLength = 0;
		moveZigZag(root, true);
		return maxLength;
	}

	/**
	 * Zig zag move will start from the given node
	 * @param node starting node
	 * @param isLeft is left move?
	 * @return total move zig zag move from the node
	 */
	private int moveZigZag(Tree node, boolean isLeft) {
		if (node == null) {
			// if no node prev move is invalid
			return -1;
		}
		int l = moveZigZag(node.l, false);
		int r = moveZigZag(node.r, true);
		maxLength = Math.max(maxLength, l);
		maxLength = Math.max(maxLength, r);
		if (isLeft) {
			return 1+l;
		} else {
			return 1+r;
		}
	}
}

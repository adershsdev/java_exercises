import dev.adershs.exercise.Tree;
import dev.adershs.exercise.TreeZigZag;

public class Solution {

    public int solution(Tree root) {
        return TreeZigZag.from(root).longest();
    }


}

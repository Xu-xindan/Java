package 自己实现treemap;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/29
 * TIME:19:36
 */
public class TreeNode {
    String key;
    Integer value;

    TreeNode right;
    TreeNode left;

    public TreeNode(String key, Integer value) {
        this.key = key;
        this.value = value;
    }
}


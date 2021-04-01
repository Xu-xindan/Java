package binary_search_tree;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/25
 * TIME:11:48
 */
public class TestCase {
    public static void main(String[] args) {
        BST tree=new BST();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(9);
        tree.insert(10);
        tree.insert(8);
        tree.insert(4);
        tree.insert(1);
        tree.insert(6);
        for(int i=-1;i<=11;i++){
            System.out.println(i+":"+tree.search(i));
        }
        System.out.println(new BST().search(10));
    }
}

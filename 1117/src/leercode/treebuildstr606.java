package leercode;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/17
 * TIME:14:28
 */
public class treebuildstr606 {
    public String tree2str(TreeNode t) {
        StringBuilder sb=new StringBuilder();
        preOrder(sb,t);
        return sb.toString();
    }

    private void preOrder(StringBuilder sb, TreeNode node) {
        if(node!=null){
            sb.append(node.val);
            if(node.left==null&&node.right==null){
                return;
            }else if(node.left!=null&&node.right==null){
                sb.append("(");
                preOrder(sb,node.left);
                sb.append(")");
            }else{
                sb.append("(");
                preOrder(sb,node.left);
                sb.append(")");

                sb.append("(");
                preOrder(sb,node.right);
                sb.append(")");
            }
        }
    }
}

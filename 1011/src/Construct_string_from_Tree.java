/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/11
 * TIME:10:50
 */
//从树中读取字符串 根（左）（右）没有的括号省略
public class Construct_string_from_Tree {
    private void preorder(StringBuilder sb,TreeNode node){
        if(node!=null){
            sb.append(node.val);
            if(node.right==null&&node.left==null){
                return;
            }else if(node.left!=null&&node.right==null){
                sb.append("(");
                sb.append(node.left);
                sb.append(")");
            }else{
                sb.append("(");
                sb.append(node.right);
                sb.append(")");
            }

            sb.append("(");
            sb.append(node.left);
            sb.append(")");

            sb.append("(");
            sb.append(node.right);
            sb.append(")");
        }
    }
    public String tree2str(TreeNode t){
        if(t==null){
            return "()";
        }
        StringBuilder sb=new StringBuilder();
        preorder(sb,t);
        return sb.toString();
    }
}

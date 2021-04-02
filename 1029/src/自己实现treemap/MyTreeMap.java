package 自己实现treemap;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/10/29
 * TIME:19:35
 */
public class MyTreeMap {
    private TreeNode root;

    public  Integer put(String key,Integer value){
        if(root==null){
            root=new TreeNode(key,value);
        }
        TreeNode parent=null;
        TreeNode current=root;
        while(current!=null){
            int cmp=key.compareTo(current.key);
            if(cmp==0){
                Integer oldValue=current.value;
                current.value=value;
                return oldValue;
            }else if(cmp<0){
                parent=current;
                current=current.left;
            }else {
                parent=current;
                current=current.right;
            }
        }
        TreeNode node =new TreeNode(key,value);
        int cmp=key.compareTo(parent.key);
        if(cmp<0){
            parent.left=node;
        }else{
            parent.right=node;
        }
        return null;
    }

    public Integer get(String key) {
        TreeNode current =root;
        while(current!=null){
            int cmp=key.compareTo(current.key);
            if(cmp==0){
                return current.value;
            }else if(cmp<0){
                current=current.left;
            }else{
                current=current.right;
            }
        }
        return null;
    }

    public Integer getOrDefault(String key, Integer defaultValue) {
        Integer v = get(key);
        if (v != null) {
            return v;
        }
        return defaultValue;
    }
}


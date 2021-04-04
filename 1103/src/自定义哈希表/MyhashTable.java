package 自定义哈希表;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/11/3
 * TIME:19:31
 */
public class MyhashTable {
    //数组
    private Node[] array=new Node[11];
    //维护哈希表中元素个数
    private  int size;
    //true key不在表中
    private boolean insert(Integer key){
        //把对象转成int
        int hasValue=key.hashCode();
        //把hashValue转成合法下标
        int index=hasValue%array.length;
        //遍历index位置处的链表，确定key是否在元素中
        Node current=array[index];
        while(current!=null){
            if(key.equals(current.key)){
                return false;
            }
            current=current.next;
        }
        //把key装入节点中，插入到链表里
        //头插尾插都可 头插相对简单
        Node node=new Node(key);
        node.next=array[index];
        array[index]=node;
        //维护元素个数
        size++;
        //通过维护负载因子，进而维护较低的冲突率
        if(size/array.length*100>=75){
            扩容();
        }
        return true;
    }

    public boolean remove(Integer key){
        int hasValue=key.hashCode();
        int index=hasValue%array.length;
        Node pre=array[index];
        Node cur=array[index].next;
        if(pre!=null&&key.equals(cur.key)){
            array[index]=cur;
            return true;
        }
        while(pre!=null){
            if(cur!=null&&key.equals(pre.key)){
                cur=cur.next;
                size--;
                return true;
            }
            pre=cur;
            cur=cur.next;
        }
        return false;
    }

    public boolean contains(Integer key){
        int hasValue=key.hashCode();
        int index=hasValue%array.length;
        Node cur=array[index];
        while(cur!=null){
            if(key.equals(cur.key)){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    private void 扩容(){
        Node[] newArray=new Node[array.length*2];
        // 搬原来的元素过来
        // 不能直接按链表搬运，因为元素保存的下标和数组长度有关
        // 数组长度变了，下标也会变
        // 所以，需要把每个元素重新计算一次

        // 遍历整个数组
        for (int i = 0; i < array.length; i++) {
            // 遍历每条链表
            Node current = array[i];
            while (current != null) {
                // 高效的办法是搬节点，写起来麻烦
                // 我们采用复制节点，简单一点
                Integer key = current.key;
                int hashValue = key.hashCode();
                int index = hashValue % newArray.length;

                // 头插尾插都可以，头插简单
                Node node = new Node(key);
                node.next = newArray[index];
                newArray[index] = node;

                current = current.next;
            }
        }
        array = newArray;
    }
}

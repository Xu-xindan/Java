import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User:XuXindan
 * DATE:2020/7/27
 * TIME:11:30
 */
public class MyArrayList {
    public int[] elem;
    public int usedsize;

    public MyArrayList(){
        this.elem=new int[10];
    }

    //打印顺序表
    public void display(){
        for(int i=0;i<this.usedsize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    //在pos位置新增元素
    public void add(int pos,int data){
        if(pos<0||pos>this.usedsize){
            System.out.println("不合法");
            return ;
        }
        if(this.usedsize==this.elem.length){
            this.elem= Arrays.copyOf(this.elem,this.elem.length-1);
        }
        for(int i=this.usedsize-1;i>=pos;i--){
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedsize++;
    }

    //判断是否包含某个元素
    public boolean Contains(int tofind){
        for(int i=0;i<this.usedsize;i++){
            if(this.elem[i]==tofind){
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应的位置
    public int Search(int tofind){
        for(int i=0;i<this.usedsize;i++){
            if(this.elem[i]==tofind){
                return i;
            }
        }
        return -1;
    }

    //获取pos位置的元素
   public int GetPos(int pos){
        if(pos<this.usedsize&&pos>0){
            return this.elem[pos];
        }
        return -1;
    }

    //给pos位置的元素设为value
    public void setPos(int pos,int value){
        if(pos<this.usedsize&&pos>0) {
            this.elem[pos] = value;
        }else{
            return;
        }
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove){
        int index=Search(toRemove);
        if(index==-1){
            return;
        }
        for(int i=index;i<this.usedsize-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.usedsize--;
    }

    //获取顺序表长度
    public int size(){
        return this.usedsize;
    }

    //清空顺序表
    public void clear(){
        this.usedsize=0;
    }
}

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListFile {
    public static void main(String[] args) {
        File dir=new File("C:\\Users\\xxd\\Desktop\\锦囊\\大二下\\毛概笔记");
        List<File> files=listDir(dir);
        //jdk1.8集合框架使用stream操作，可以lambda表达式
        files.stream()
                .forEach(System.out::println);
    }

    public static List<File> listDir(File dir){
        List<File> list=new ArrayList<>();
        if(dir.isFile()){
            list.add(dir);
        }else if(dir.isDirectory()){
            File[] children=dir.listFiles();
            if(children!=null){
                for(File child:children){
                    List<File> files=listDir(child);
                    list.addAll(files);
                }
            }
        }
        return list;
    }

    public static List<File> listDir2(File dir){
        List<File> list=new ArrayList<>();
        File[] children=dir.listFiles();
        if(children!=null){
            for(File child:children){
                /*if(child.isDirectory()){
                    list.addAll(listDir2(child));
                }else {
                    list.add(child);
                }*/
                list.add(child);
                if(child.isDirectory()){
                    list.addAll(listDir2(child));
                }
            }
        }
        return null;
    }
}

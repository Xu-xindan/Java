import java.io.*;

public class FileInput {
    public static void main(String[] args) throws IOException {
        //File file=new File("C:\\Users\\xxd\\Desktop\\锦囊\\大二下\\毛概笔记\\第八章\\IMG_20200605_174152_1.jpg");
        File file=new File("C:\\Users\\xxd\\Desktop\\锦囊\\java\\1023.txt");
        //文件输入字节流
        FileInputStream fis=new FileInputStream(file);
        //输入流比较固定的写法：读取到一个字节/字符数组，定义read的返回值变量，while
        byte[] bytes=new byte[1024];
        int len=0;
        //读取到的长度，数组可能读满，也可能没读满，当次读取内容，一般使用数组【0，len】
        while((len=fis.read(bytes))!=-1){
            String str=new String(bytes,0,len);
            System.out.println(str);
        }
        //一般来说，输入输出流使用完，一定要关闭，关闭的顺序是反向关系（创建顺序相反）
        //2.文件输入字符流
        FileReader fr=new FileReader(file);
        char[] chars=new char[1024];
        int len1=0;
        while((len1=fr.read(chars))!=-1){
            String str1=new String(chars,0,len1);
            System.out.println(str1);
        }
        //3.缓冲流：缓冲字节流/缓冲字符流
        FileInputStream fis1=new FileInputStream(file);//文件字节输入流
        //缓冲字节输入流
        BufferedInputStream bis=new BufferedInputStream(fis);
        InputStreamReader isr=new InputStreamReader(fis1);
        //字节流转字符流，一定要经过字节字符转换流转换，并且可以制定编码
        //和文件编码格式一致，否则会是乱码
        BufferedReader br=new BufferedReader(isr);
        String string;
        while((string=br.readLine())!=null){
            System.out.println(string);
        }
        //释放资源：反向释放
        br.close();
        isr.close();
        fis.close();

        //路径上没有该文件，new File不会报错，操作输入输出流会抛FileNotFoundException
        File f=new File("");
        //把a-z换行输出到某个文件，需要考虑文件是否存在问题
        if(!file.exists()){
            file.createNewFile();
        }
        //缓冲字符输出流
        BufferedWriter bw=new BufferedWriter(new FileWriter(file));

        //打印输出流

    }
}

import java.io.FileInputStream;

public class Files_inputStream {
    public static void main(String[] args) {
        try{    
            FileInputStream fin=new FileInputStream("E:\\My Java\\University\\Final\\File\\testout.txt");    
            int data;
            while ((data = fin.read()) != -1) {
                System.out.print((char) data);
            }    
  
            fin.close();    
          }catch(Exception e){
            System.out.println(e);
        }    
    }
}

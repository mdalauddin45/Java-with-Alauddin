import java.io.FileOutputStream;

/**
 * Files
 */
public class Files_ouputStream {

    public static void main(String[] args) {
         try{    
             FileOutputStream fout=new FileOutputStream("E:\\My Java\\University\\Final\\File\\testout.txt"); 
             String data = "Hello World";
             byte[] bytes = data.getBytes();   
             fout.write(bytes);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){
                System.out.println(e);
            }    
    }
}
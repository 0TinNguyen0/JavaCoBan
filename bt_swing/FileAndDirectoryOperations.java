
package bt_swing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileAndDirectoryOperations {

    public FileAndDirectoryOperations() {
    }
    
    public File[] getDirectoryContent(String folder){
        File directory = new File(folder);
        if(directory.isFile())
            return null;
        File[] results = directory.listFiles();
        return results;
    }

    public String displaycontent(File[] content){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < content.length; i++){
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
        }
        return sb.toString();
    }
    public File[] getSubDirectories(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for(int i = 0; i < content.length; i++){
            if(content[i].isDirectory()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    public File[] getFiles(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for(int i = 0; i < content.length; i++){
            if(content[i].isFile()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
        //duyệt đệ quy xuất tất cả các tập tin và thư mục
    public void getContentRecursively(String folder){
        File content = new File(folder);
        
        //Điều kiện dừng
        if(content.isFile()){
            System.out.println(content.getPath() + File.separator + content.getName());
            return;
        }
        //câu gọi đệ quy trong stack
        System.out.println("Thư mục: " + folder);
        File[] sub = content.listFiles();
        for(int i = 0; i < sub.length; i++){
            getContentRecursively(folder + File.separator + sub[i].getName());
        }
    }
    //
    public String readTextFile(String filename){
        StringBuilder content = new StringBuilder();
        
        try {
            //open file
            FileReader fr = new FileReader(filename);
            //Dừng bộ đệm
            BufferedReader br = new BufferedReader(fr);
            
            String line = null;
            while((line = br.readLine()) != null){
                content.append(line);
                content.append("\n");
                
            }
            //close file
            br.close();
            fr.close();
            
        } catch (FileNotFoundException ex) {
            return "Không tìm thấy file " + filename;
        } catch (IOException ex) {
            return "Không thể đọc file " + filename;
        }
        
        return content.toString();
    }
    
    // thao tác lưu tập tin văn bản
    public boolean writeTextFile(String filename, String content, boolean flag ){
        boolean falg = true; 
        
        try {
            //open file

            FileWriter fw = new FileWriter(filename);
            
            //sử dụng buffer
            
            BufferedWriter bw = new BufferedWriter(fw);
            
            // Ghi ra file
            bw.write(content);
            //Đóng file
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            return false;
        }
        return flag;
    }

    public boolean writeTextFile(String absolutePath, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

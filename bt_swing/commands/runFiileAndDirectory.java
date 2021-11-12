/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_swing.commands;

import bt_swing.FileAndDirectoryOperations;
import java.io.File;


public class runFiileAndDirectory {
    
    public static void main (String[] args) {
          FileAndDirectoryOperations fo = new FileAndDirectoryOperations();
//        File[] content = fo.getDirectoryContent("D:\sóng của tin");
//        System.out.println(fo.displaycontent(content));
//        File[] thumuc = fo.getSubDirectories(content);
//        System.out.println("Danh sách các thư mục con là");
//        System.err.println(fo.displaycontent(thumuc));
//        File[] taptin = fo.getFiles(content);
//        System.err.println("Danh sách các tập tin");
//        System.out.println(fo.displaycontent(taptin));
        fo.getContentRecursively("D:\\sóng của tin");


    }

}

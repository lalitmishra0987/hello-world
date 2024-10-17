package com.lalit.filesearch;

import java.io.File;
import java.util.List;

public class FindFile {

	public void readFileFromFolders(File folder){
		System.out.println("File Path/t"+folder.getAbsoluteFile());
		if(folder.isDirectory()){
			String[] subFolder = folder.list();
			for(String fileName: subFolder){
				this.readFileFromFolders(new File(folder,fileName));
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       FindFile file = new FindFile();
       file.readFileFromFolders(new File("C:\\Images"));
       System.out.println("Just like that");
       System.out.println("Just like that");
	}

}

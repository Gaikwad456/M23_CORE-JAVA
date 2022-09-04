package com.capgemini.lambdaexpression;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {

	public static void main(String[] args) {
		FileFilter obj =(File pathname)->pathname.getName().endsWith(".pptx");
        File dir= new File("Komal");
        File contents[]= dir.listFiles(obj);
        //enhanced for loop
        /*if any particular extension file is open 
         * on your system then you will get that file
         * in two times with one file in $ sign*/
        for(File i:contents)
        {
        	System.out.println(i);
        }
	}

}

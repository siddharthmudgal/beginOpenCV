package com.beginOpenCV.beginOpenCV;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import com.beginOpenCV.beginOpenCV.constants.FileConstants;

public class App 
{
    public static void main( String[] args )
    {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        grayOutFiles();
    }
    public static void grayOutFiles(){
    	for (int i=0;i<FileConstants.file_names.length;i++){
    		grayOutFile(FileConstants.file_names[i], FileConstants.write_to);
            System.out.println("gray-ing complete for file " + FileConstants.file_names[i]);
    	}
    }
    public static void grayOutFile(String file_name, String write_to){
    	Mat rawImage = Imgcodecs.imread(App.class.getClassLoader().getResource(file_name).getPath());
        Imgproc.cvtColor(rawImage, rawImage, Imgproc.COLOR_BGR2GRAY);
        Imgcodecs.imwrite(
        		write_to
        		, rawImage);
    }
}

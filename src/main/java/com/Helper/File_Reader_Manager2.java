package com.Helper;

public class File_Reader_Manager2 {
	private File_Reader_Manager2() {
		
	}
	public static File_Reader_Manager2 getInstanceFRM2() {
		File_Reader_Manager2 reader = new File_Reader_Manager2();
		return reader;

	}
public  Configuration_Readers getInstanceCR2() throws Throwable {
	
	Configuration_Readers reader = new Configuration_Readers();
	return reader;


}
}

package IOstreams;

import java.io.File;

public class WorkWithFile {

	public static void main(String[] args) {
		
		String path = "E:\\Tests\\test.txt";
		File file = new File(path);
		
		System.out.println("File name: " + file.getName());
		
		System.out.println("Path: " + file.getPath());
		
		System.out.println("Parent directory: " + file.getParent());
		
		System.out.println("File length: " + file.length() + " bytes \n");
		
		System.out.println("File " + (file.exists() ? "exists" : "does not exist"));
		
		System.out.println("File " + (file.canWrite() ? "writable" : "not writable"));
		
		System.out.println("File " + (file.canRead() ? "readable" : "not readable"));
		
		System.out.println("File " + (file.isHidden() ? "hidden" : "is not hidden \n"));
		
		System.out.println("Total space: " + CapacityFormatter.toGigabytes(file.getTotalSpace()) + "Gb");
		
		System.out.println("Free space: " + CapacityFormatter.toGigabytes(file.getFreeSpace()) + "Gb");
		

	}
	
	private static class CapacityFormatter {
		
		private static long toGigabytes(long capacity){
			return capacity / (long) Math.pow(10, 9);
		}
	}

}

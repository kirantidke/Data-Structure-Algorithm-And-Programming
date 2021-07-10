package com.bridgelabz.datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//Class with a static function to read file data

class ReadFile {
		public static ArrayList<String> readFile() {
			ArrayList<String> dataArray = new ArrayList<>();
			String data = " ";
			try {
				String filePath = "C:\\Users\\HP\\eclipse-workspace\\DataStructureAndAlgorithms\\src\\main\\DataStructure\\com\\bridgelabz\\datastructure\\Data.txt";
				File myObj = new File(filePath);
				Scanner myReader = new Scanner(myObj);
				while (myReader.hasNextLine()) {
					data = myReader.nextLine().replaceAll(",", data);
					String[] newData = data.split("\\W+");
					for (String s : newData)
						dataArray.add(s);
				}
				myReader.close();
			} catch (FileNotFoundException e) {
				System.out.println("File not found.");
				e.printStackTrace();
			}
			return dataArray;
		}
	}
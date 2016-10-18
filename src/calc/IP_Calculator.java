package calc;

import java.util.Scanner;

public class IP_Calculator {

	public static void main(String[] args) {
		Scanner menu = new Scanner(System.in);
		// arbitrary option menu
		System.out.println(
				"*******************************\n".concat(
				"*                             *\n").concat(		
				"*       IPv4 Calculator       *\n").concat(
				"*                             *\n").concat(
				"*******************************\n").concat(
				"*           Options           *\n").concat(
				"* (1) decimal input to binary *\n").concat(
				"*                             *\n").concat(
				"* (2) binary input to decimal *\n").concat(		
				"*******************************\n")
		);
		
		int option = menu.nextInt();
		if (option == 1){
				menu.close();
				IPv4_Header header = new IPv4_Header();
				Validator valD = new Validator(header);
				
				// fetch user input for header information
				valD.setVersion();
				
				valD.setIhl();
				
				valD.setTos();
				
				valD.setID();
				
				valD.setFlag();

				valD.setFragment_offset();
				
				valD.setTtl();
				
				valD.setProtocol();
				
				valD.setSourceIp();
				
				valD.setDestinationIp();
		} else if (option == 2) {
			menu.close();
			Binary header = new Binary();
//			BinaryValidator bVal = new BinaryValidator(header);
		}
		
		/*
		header.setHeader(); // set the header via user input

		header.printDecimal(); // print the header information

		header.printBinary(); // print the header in binary format
		*/
	}

}

package view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import controller.MainController;
import service.MemberService;
import service.TicketService;
import util.ScanUtil;
import vo.GameVo;
import vo.MemberVo;
import vo.RestaurantVo;
import vo.TicketVo;

public class EaglesPrint {
	
	public static final String black = "\u001B[30m";
	public static final String red = "\u001B[31m";
	public static final String green = "\u001B[32m";
	public static final String yellow = "\u001B[33m";
	public static final String blue = "\u001B[34m";
	public static final String purple = "\u001B[35m";
	public static final String cyan = "\u001B[36m";
	public static final String white = "\u001B[37m";
	public static final String orange = "\u001B[38;5;208m";
	public static final String exit = "\u001B[0m";

	public static void main(String[] args) {
		System.out.println(red + "test" + exit);
		System.out.println(black + "test" + exit);
		System.out.println(green + "test" + exit);
		System.out.println(yellow + "test" + exit);
		System.out.println(blue + "test" + exit);
		System.out.println(purple + "test" + exit);
	}

	TicketService ticketService = TicketService.getInstance();
	MemberService memberService = MemberService.getInstance();
	
	public void printLn(int num) {
		for (int i = 0; i < num; i++)
			System.out.println();
	}

	public void printVar() {
		System.out.println(blue+"─────────────────────────────────────────────────────────────────────────────────────────────────────────────"+exit);
	}

	public void printVar1() {
		System.out.println(blue+"\t\t\t\t\t    ─────────°•⚾•°─────────"+exit);
	}

	public void printVar2() {
		System.out.println(blue+"\t\t\t\t\t    ────────────────────────"+exit);
	}

	public void printMenuVar1() {
		System.out.println(blue+"\t─────────°•⚾•°─────────"+exit);
	}

	public void printMenuVar2() {
		System.out.println(blue+"\t────────────────────────"+exit);
	}
	
	public void printSlogan() {
	      System.out.println("\r\n" + 
	            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
	            "⠀⠀⠀⠀⠀⠀⠀⠀⣾⣾⣾⣾⣾⡆⣠⣶⡖⠀⣤⣶⡆⢠⣴⡶⠀⣤⣴⣶⣷⣷⡀⠀⠀⢠⣶⡶⠀⣤⣶⣶⣿⣶⠀⠀⠀⠀⠀⢠⣶⣾⣿⣿⣷⡀⢰⣶⣟⠀⢰⣶⡟⢀⣶⣶⣿⣿⣷⡄⠀⠀⢰⣶⡗⠀⢰⣶⣿⠀⢠⣶⣾⠀⢠⣶⣾⡇⠀⣤⣶⡀⣠⣶⡎⠀⠀⠀⠀⠀⠀⠀\r\n" + 
	            "⠀⠀⠀⠀⠀⠀⠀⠀⠁⣽⣿⡇⠁⠁⣾⣿⡃⢀⣿⣿⠂⣸⣿⡏⢸⣿⡿⠀⣿⣿⡃⠀⠀⣼⣿⡇⢸⣿⡏⠀⣿⣿⠅⠀⠀⠀⢀⣿⣿⠅⠀⣿⣿⡃⣾⣿⡇⠀⣿⣿⠇⣸⣿⡗⢀⣿⣿⡃⠀⠀⢸⣿⡏⢀⣿⣿⡿⠀⣼⣿⡃⠀⣾⣿⣿⡇⠀⢿⣿⡆⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
	            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠂⠀⢐⣿⣿⣠⣼⣿⡿⠀⣿⣿⡃⢸⣿⣿⣄⠉⠉⠀⠀⢀⣿⣿⠂⢹⣿⣷⣈⠉⠉⠀⠀⠀⠀⢸⣿⣟⠀⢰⣿⣿⢀⣿⣿⠂⢠⣿⣿⠁⣾⣿⠇⢰⣿⣿⠀⠀⠀⢸⣿⡇⣸⣿⣿⡯⢰⣿⡏⠀⣸⣿⢳⣿⡇⠀⢹⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
	            "⠀⠀⠀⠀⠀⠀⠀⠀⢨⣿⡿⠀⠀⢸⣿⡿⡟⣿⣿⡇⢰⣿⡿⠀⠀⠙⢿⣿⣷⡄⠀⠀⢰⣿⣟⠀⠀⠙⢿⣿⣷⡀⠀⠀⠀⠀⣾⣿⡇⠀⣸⣿⡗⢸⣿⡿⠀⢸⣿⡯⢠⣿⣿⣿⣿⡿⠃⠀⠀⠀⢸⣿⢅⣿⡯⣿⣇⣿⣿⡡⢤⣿⠯⢸⢿⠇⠂⠀⣿⣻⡻⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
	            "⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⡏⠀⠀⣿⣿⡃⠀⣿⣿⠅⣸⣿⡏⢰⣶⡖⠀⣽⣿⡇⠀⠀⣾⣿⡇⢰⣶⡆⠀⣿⣿⠅⠀⠀⠀⢀⣿⣿⠁⠀⣿⣿⡃⣾⣿⡇⠀⣿⣿⡇⣸⢿⢯⢻⠿⠧⠴⠔⠖⠒⢛⣋⣋⡫⢋⣭⣭⣭⠆⠀⣶⣶⣥⣼⣿⡇⠀⠀⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
	            "⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠂⠀⢠⣿⣿⠀⢸⣿⣟⠀⣾⣿⡃⢼⣿⣧⣠⣿⣿⠁⠀⢀⣿⣿⠁⣽⣿⣇⣬⣿⡿⠀⠀⠀⠀⠘⠟⠛⠀⢊⢋⠙⠀⣉⣉⣤⣥⣥⡤⠀⣴⣴⠆⣲⣾⣇⠀⠀⠀⠀⢸⣿⣿⠇⢐⣿⣿⡯⠀⢸⣿⡟⠋⢻⣿⡇⠀⠀⣿⣿⠅⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
	            "⠀⠀⠀⠀⠀⠀⠀⠘⠋⠋⠀⠀⠘⠋⠉⠀⠚⠋⠁⠐⠛⠉⠀⠈⠻⠻⠛⠉⠁⠀⠀⠐⠋⠋⠀⠘⠻⠻⠛⠙⠁⠀⠀⠀⠀⠀⠘⠛⠋⠉⠉⠀⠀⠈⠛⠋⠉⠈⠀⠀⠋⠉⠀⠘⠉⠁⠀⠀⠀ ⠀⠘⠉⠉⠀⠐⠉⠉    ⠀⠋⠉⠀⠀⠙⠉⠀⠀⠀⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
	            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
	            "");
	   }
	
	
	public void printLogo() {
        System.out.println(blue+"\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                  ⣀⣴⡾⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                ⢀⣠⣤⣶⣿⣿⣿⠇⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀               ⢀⣀⣀⣤⣴⣶⡿⢻⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⣀⣀⣀⣤⣤⣴⣴⣶⣶⣶⣿⣿⢿⣿⣿⡿⡿⡿⡿⢿⠿⡿⡿⡿⡿⣿⣿⣿⣿⣿⣷⣷⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣾⣿⣿⣿⣿⢿⠿⠛⡩⠁⣠⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⢀⣀⣠⣤⣴⣶⣾⣿⠿⠿⠻⠛⠛⠙⣉⡉⣉⢨⢠⢄⠤⡤⠤⡤⡰⡰⡰⡰⡰⡰⡰⡄⡆⡦⠤⡄⡤⡠⡠⡠⡨⣈⢉⢉⢉⢉⡉⣉⢉⡉⣉⢉⣁⢡⢠⢄⢆⢆⠇⢁⣴⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⠀⢀⣀⣤⣴⣶⣿⠿⠻⠛⢙⢉⡁⡤⡠⡢⡲⡸⡸⡪⡝⣔⢕⢕⢕⢕⢕⢝⢜⢝⢜⢜⢎⢎⢎⢎⢎⢮⢪⡪⡪⡝⣜⢜⢜⢜⢎⢎⢎⢎⢇⢗⢕⢕⢕⢕⢕⢕⢕⢎⢮⢪⠪⠊⢀⣤⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀   ⠀⢀⣴⣾⠿⠟⢋⢩⢠⢤⢲⢸⢜⢎⢎⢎⠎⠎⠎⠎⠎⠎⠎⠎⠎⠎⠎⠇⠳⠱⠱⠱⠱⠱⠕⡕⣕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⢕⠕⠕⠑⠁⢀⣠⣴⣿⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣤⣾⡿⢁⢔⢕⠕⠑⠑⠁⠁⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢀⠤⡄⣆⢦⢣⢳⢹⢸⡸⡪⠃⠃⠃⠑⠁⠃⠑⠁⠃⠑⠁⠃⠑⠁⠁⠁⠁⠁⠁⠀⢀⣀⣠⣴⣶⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣶⡿⠿⠟⠛⡋⣋⡁⡎⠮⠠⠤⠰⢰⢰⠔⠂⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢔⢜⢜⢕⢝⢜⢜⢜⢜⢎⢎⢇⠃⠀⢀⣤⣴⣴⣴⣴⣴⣴⣴⣴⣴⣴⣴⣦⣶⣶⣶⣾⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⢀⣾⣿⠋⡠⡢⡲⡱⡹⡸⡢⡃⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢎⢎⢮⢪⡪⡪⡪⡣⡣⡣⡳⡱⡅⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⢸⣿⣯⠐⡕⠕⠑⠁⠉⠈⠈⠊⠊⠊⠒⠲⢰⠤⢤⢠⡀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⡎⡇⡧⡣⡣⡫⡪⡪⡪⡪⡪⡪⠀⠀⣾⢿⡿⣿⢿⡿⣿⢿⡿⣿⢿⡿⡿⠿⠿⢛⠉⠀⣼⣿⣿⣿⣿⣿⡟⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⢿⣿⣄⠘⠀⢰⣾⣿⣿⣿⣾⣶⣶⣤⣤⣀⡈⠈⠑⠱⢍⢏⢎⢆⢆⢄⡀⠀⠀⠀⢰⢱⢕⢕⢕⢕⢝⢜⢜⢎⢎⢎⢮⢢⢢⠤⡤⢤⠤⡤⢤⠤⡤⢤⠤⡤⢤⢔⢔⡲⡸⠂⠀⣼⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠈⢿⣿⣦⡀⢸⣿⣿⣿⠿⠿⣿⣿⣿⣿⣿⣿⣷⣶⣤⡀⠁⠃⢇⢧⢣⢳⢹⢰⢄⢇⢧⢳⢱⡱⡕⣕⢕⢕⢕⢕⢕⢕⢕⢕⢝⢜⢎⢇⢏⢎⢇⢏⢎⢇⢏⢎⢮⠪⠊⠀⣠⣾⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⣿⣷⣿⣿⣯⠀⠀⠀⠈⠈⠛⠿⢿⣿⣿⣿⣿⣷⣦⣀⠈⠘⢎⢮⢪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡣⡳⡱⠱⠱⠱⠱⠱⠱⠱⠱⠱⠕⠕⠕⠕⠑⠁⠁⢀⣠⣾⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⢿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠉⠛⢿⣿⣿⣿⣿⣷⣄⠀⠑⢱⡱⡹⡸⡜⡜⡎⣎⢮⢪⢪⢪⡪⡊⠀⢀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣤⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⢿⣿⣿⣿⣷⠀⡎⣎⢮⢪⡪⡪⡪⡪⡪⡪⡣⡣⡓⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣿⣿⠇⢰⢱⡱⡱⡱⡱⡕⡕⡝⡜⡎⡮⡪⠂⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⡟⢀⢇⢇⢇⢏⢎⢎⢮⢪⡪⡪⡪⡪⡊⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⡿⠟⡛⠉⢨⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⠁⡜⡜⡕⡕⡕⡕⡕⡕⡕⡕⡝⡜⡎⡆⡤⡠⡠⡠⡠⡠⡠⡠⡠⡠⡠⡠⡠⡠⡠⡄⡖⠜⠀⢠⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⡇⢰⢱⢹⢸⢪⢪⢪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⠪⠊⠀⣴⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⡿⠀⡎⡇⡗⡕⡕⡕⡕⡕⡕⡕⡝⡜⡎⡎⡮⡪⡪⡪⡪⡪⡪⡪⡪⡪⡪⠪⠪⠊⠊⠀⢀⣴⣾⣿⣿⣿⣿⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣤⣴⣾⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠚⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠋⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              ""+exit);
        System.out.println("\r\n" + 
              "         ⠀⠀   ⠀⠀  ⠀⠠⣿⣷⣿⣿⣾⡗⢰⣼⡞⠀⣴⣶⡇⢠⣶⣷⠐⣤⣶⣷⣿⣷⡄⠀⠀⢢⣾⡾⢀⣴⣼⣾⣾⣷⡀⠀⠀     ⢨⣶⣷⣿⣿⣷⡄⢢⣷⡿⠀  ⣸⣾⣟ ⢠⣾⣾⣿⣿⣷⡆⠀⠀⢼⣾⡯⠀⣰⣷⣿⠀⢰⣵⣿⠁⢠⣷⣿⡇ ⢠⣰⣼⡄⣰⣾⡞⠀⠀⠀⠀⠀     \r\n" + 
              "         ⠀⠀⠀⠀⠀⠀⠀⠈⠉⣽⣿⡏⠁⠁⣿⣿⡇⢐⣿⣿⠃⢼⣿⡏⢸⣿⡿⠀⣿⣿⡇⠀⠀⣽⣿⡇⢼⣿⡟⠈⣿⣿⡃⠀⠀⠀⢠⣿⣿⠃⢀⣿⣿⠇⣾⣿⡏⠀ ⣾⣿⡇  ⢸⣿⡯⢀⣿⣿⠇⠀⠀⢺⣿⡏⢀⣿⣿⣿⠀⣾⣿⠇⢀⣿⣿⣿⡇⠀ ⣿⣿⣇⣿⣿⠁⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "         ⠀⠀⠀⠀⠀⠀⠀⠀⠠⣿⣿⠅⠀⢰⣿⣿⣤⣼⣿⡿⢀⣿⣿⠇⢹⣿⣿⣤⡉⠈⠀⠀⢠⣿⣿⠅⢹⣿⣿⣌⡉⠉⠀⠀⠀⠀⣸⣿⡿⠀⢸⣿⣿⢡⣿⣿⠅  ⢰⣿⣿⠁ ⣿⣿⡇⢸⣿⣿⠁⠀⠀⣸⣿⡇⣼⣿⣿⣗⢰⣿⡟⠀⣸⣿⢽⣿⡇⠀ ⢸⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
              "         ⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⡿⠀⠀⣸⣿⡿⠛⣿⣿⡏⢰⣿⣿⠀⠀⠉⠿⣿⣿⡄⠀⠀⢸⣿⣟⠀⠀⠙⠿⣿⣷⡄⠀⠀⠀⠀⣾⣿⡇⠀⣺⣿⡗⢸⣿⣟⠀  ⣸⣿⡟  ⢰⣿⣿⣿⣿⡿⠃⠀⠀⠀⢸⣿⣧⣿⣟⣿⣧⣿⡿⠥⢴⢿⠟⠸⣿⡋⠈⠈ ⣿⣟⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + 
				"         ⠀⠀⠀⠀⠀⠀⠀ ⣾⣿⡏⠀⠀⣿⣿⠇ ⢐⣿⣿⠅⢼⣿⡗⢸⣷⡗⠀⣿⣿⡇⠀⠀⣿⣿⡇⢼⣾⡇⢀⣿⣿⠇⠀⠀⠀⢰⣿⣿⠅⢀⣿⣿⠇⣿⣿⡇⢀⢿⠿⠇ ⠼⠿⠯  ⠞⡟⡓⠒⠚⠊⠋⢹⣭⣭⡵⢉⣷⣷⣾⠂⣾⣿⣷⣾⣿⡇⠀      ⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "         ⠀  ⠀⠀   ⠀⢰⣿⣿⠅⠀⢸⣿⣿⠁⢸⣿⣟⢀⣿⣿⡃⢹⣿⣷⣾⣿⡿⠂⠀ ⢐⣿⣿⠂⢻⣿⣷⣾⣿⡟⠁⠀⠀⠈⣉⣉⣁⣌⡍⠌⠀⢴⣴⣴⣶⠶⠖ ⢀⣿⢿⠃   ⢽⣿⡯⠀⠀⠀⠀  ⣸⣿⡿⠃⢨⣿⡿⡏⣼⡿⠏⠁⢽⣿⠇⠀      ⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀   \r\n"
				+ "         ⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠈⠈⠀⠀⠉⠁⠀⠀⠉⠀⠀⠀⠉⠋⠉⠀⠀⠀⠀  ⠈⠉⠀⠀  ⠈⠉⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀       ⠀⠈⠀⠀⠀⠀⠁⠀⠀⠀⠁⠀⠀⠀⠁⠀⠀ ⠀⠀   ⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "");
	}

	public void printHome() {
		printMenuVar1();
		System.out.println("\t1. 로그인");
		System.out.println("\t2. 회원가입");
	}

	public void printAdmin() {
		printLn(2);
		System.out.println("1. 경기 정보 수정");
		System.out.println("2. 회원 목록 조회");
	}

	public void printMember() {
		printMenuVar1();
		printLn(1);
		System.out.println("\t1. 경기내역 조회 ");
		System.out.println("\t2. 티켓 예매");
		System.out.println("\t3. 예매티켓 조회");
		System.out.println("\t4. 응원도 식후경");
		System.out.println("\t5. 마이페이지");
		System.out.println("\t6. 홈");
		printLn(1);
		printMenuVar2();
	   }
	
	public void printTicketList() {
		printVar();
		System.out.println("티켓목록");
		printVar();
		System.out.println("------------------------------------------");
		System.out.println("구분 \t 1구간(화/수/목)\t 2구간(금/토/일)");
		System.out.println("------------------------------------------");
		System.out.println("1루 \t    7000원 \t   9000원");
		System.out.println("------------------------------------------");
		System.out.println("3루 \t    7000원 \t   9000원");
		System.out.println("------------------------------------------");
		System.out.println("외야 \t    5000원 \t   7000원");
		System.out.println("------------------------------------------");
	}
	
	public void printAvailGameList() {
		List<GameVo> list = ticketService.availGameList();
		System.out.println("\t      ◈ 예매 가능한 경기 ◈");
		printLn(1);
		System.out.println("번호\t      경기날짜\t         상대팀");
		for (GameVo gameVo : list) {
			int no = gameVo.getGame_no();
			Date date = gameVo.getGame_date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
			String str_date = sdf.format(date);
			String team = gameVo.getOpt_name();
			System.out.println(no+"\t"+str_date+"\t vs "+team);
		}
	}
	
	public void printAreaMenu() {
		System.out.println("1. 1루(홈)");
		System.out.println("2. 3루(원정팀)");
		System.out.println("3. 외야");
		System.out.println("4. 메인");
	}
	
	public void printSeatMenu(List<List<Object>> list) {
		String block = ScanUtil.nextLine("블록(A-J) 선택 >");
		block = block.toUpperCase();
		int row = ScanUtil.nextInt("번호선택 >");
		List<Object> param = new ArrayList<Object>();
		int blockNo = block.charAt(0) - 64;
		int gameNo =  (int) MainController.sessionStorage.get("gameNo");
		int areaNo = (int) MainController.sessionStorage.get("area");
		param.add(gameNo);
		param.add(areaNo);
		param.add(blockNo);
		param.add(row);
		list.add(param);

	}

	public void printSeatSel() {
		System.out.println("1. 추가 좌석 선택");
		System.out.println("2. 결제 진행");
		System.out.println("3. 취소");

	}

	public void printMypage() {
		printVar();
		System.out.println("1. 회원정보 수정");
		System.out.println("2. 회원 탈퇴");
		System.out.println("3. 로그아웃");
		System.out.println("4. 홈");
	}

	public void printUpdate() {
		printVar();
		System.out.println("1. 패스워드 변경");
		System.out.println("2. 전화번호 변경");
		System.out.println("3. 마이페이지");
	}
	
	public void printGameList(List<GameVo> gameList) {
		for (GameVo gameVo : gameList) {
			Date date = gameVo.getGame_date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
			String str_date = sdf.format(date);
			String result = gameVo.getGame_result();
			String team = gameVo.getOpt_name();
			System.out.println(str_date + "\t\t  한화이글스 vs " + team + "\t\t" + result);
		}
		System.out.println("1. 이전페이지");
		System.out.println("2. 다음페이지");
		System.out.println("3. 메인화면");
	}
	
	public void printSeatList(int gameNo) {
		System.out.println("\t [1루] \n");
		ticketService.seatList(1, gameNo);
		System.out.println("\t [3루] \n");
		ticketService.seatList(2, gameNo);
		System.out.println("\t [외야] \n");
		ticketService.seatList(3, gameNo);
	}

	public void printMemList() {
		List<MemberVo> list = memberService.memList();
		for (MemberVo memberVo : list) {
			int no = memberVo.getMem_no();
			String id = memberVo.getMem_id();
			String pw = memberVo.getMem_pw();
			String name = memberVo.getMem_name();
			Date date = memberVo.getMem_birth();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
			String str_birth = sdf.format(date);
			String phone = memberVo.getMem_phone();

			System.out.println("NO: " + no + "\n" + "ID: " + id + "\n" + "이름: " + name + "\n" + "생년월일: " + str_birth
					+ "\n" + "전화번호: " + phone);
			System.out.println("");
		}
	}

	public void printGameUpdate(List<GameVo> list) {
		System.out.println("번호\t      경기날짜\t         상대팀\t   경기결과");
		for (GameVo gameVo : list) {
			int no = gameVo.getGame_no();
			Date date = gameVo.getGame_date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E)");
			String str_date = sdf.format(date);
			String team = gameVo.getOpt_name();
			String result = gameVo.getGame_result();
			System.out.println(no + "\t" + str_date + "\t vs " + team + "\t\t" + result);
		}
	}
	public void printReservationList(int memNo) {
        
           List<TicketVo> reserveList  = ticketService.ticketingList(memNo);
           
           int a=0;
           for (TicketVo ticketVo : reserveList) {
              int payNo = ticketVo.getPay_no();
              Date payDate = ticketVo.getPay_date();
              SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");
              String str_payDate = sdf.format(payDate);
              Date gameDate = ticketVo.getGame_date();
              SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E)");
              String str_gameDate = sdf2.format(gameDate);
              String opt = ticketVo.getOpt_name();
              String gugan = ticketVo.getGugan_no();
              String area = ticketVo.getArea_name();
              String block = ticketVo.getBlock_nm();
              String row = ticketVo.getSeat_row();
              String cancel = ticketVo.getCancel_yn();
              int pay = ticketVo.getPrice_pay();
              if(a!=payNo)   {
                 System.out.println();
                 System.out.println("예매번호 "+payNo);
                 System.out.println("예매일시 "+str_payDate);
                 System.out.println("경기정보 "+str_gameDate+"  vs "+opt);
                 a = payNo;
              }
              
              System.out.println(" ["+gugan+"]"+area+" "+block+" "+row+" "+pay+"원 \t"+cancel);
           }
        }
	public void printReservationListByPay(List<Object> param) {
        
        List<TicketVo> reserveListByPay  = ticketService.ticketingListbyPay(param);
        
        int a=0;
        for (TicketVo ticketVo : reserveListByPay) {
           int payNo = ticketVo.getPay_no();
           Date payDate = ticketVo.getPay_date();
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");
           String str_payDate = sdf.format(payDate);
           Date gameDate = ticketVo.getGame_date();
           SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E)");
           String str_gameDate = sdf2.format(gameDate);
           String opt = ticketVo.getOpt_name();
           String gugan = ticketVo.getGugan_no();
           String area = ticketVo.getArea_name();
           String block = ticketVo.getBlock_nm();
           String row = ticketVo.getSeat_row();
           String cancel = ticketVo.getCancel_yn();
           int ticketNo = ticketVo.getTk_no();
           int pay = ticketVo.getPrice_pay();
           if(a!=payNo)   {
              System.out.println();
              System.out.println("예매번호 "+payNo);
              System.out.println("예매일시 "+str_payDate);
              System.out.println("경기정보 "+str_gameDate+"  vs "+opt);
              a = payNo;
           }
           
           System.out.println(ticketNo+" ["+gugan+"]"+area+" "+block+" "+row+" "+pay+"원 \t"+cancel);
        }
     }
	
	public void printSelectSeatList(List<Object> ticketList) {
		List<Map<String, Object>> seatList = ticketService.selectSeatList(ticketList);
		for (Map<String, Object> map : seatList) {
			Date date = (Date) map.get("GAME_DATE");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 (E)");
			String str_date = sdf.format(date);
			String areaName = (String) map.get("AREA_NAME");
			String blockName = (String) map.get("BLOCK_NM");
			String seatRow = (String) map.get("SEAT_ROW");
			System.out.println(str_date+" "+areaName+" "+blockName+" "+seatRow);
		}
	}
	
	public void printRes() {
		System.out.println("<응원도 식후경>");
		System.out.println("1. 구장 근처 맛집");
		System.out.println("2. 구장 내부 먹거리");
		System.out.println("3. 홈");
	}

	public void printOutsideRes() {
		System.out.println("<구장 근처 맛집>");
		System.out.println("1. 전체 리스트");
		System.out.println("2. 식당검색");
		System.out.println("3. 뒤로가기");
	}

	public void printInsideRes() {
		System.out.println("<구장 내부 맛집>");
		System.out.println("1. 전체 리스트");
		System.out.println("2. 식당검색");
		System.out.println("3. 뒤로가기");
	}

	public void printResList(List<RestaurantVo> list) {
		
		for (RestaurantVo restaurantVo : list) {
			String name = restaurantVo.getRes_name();
			String location = restaurantVo.getRes_location();
			int no = restaurantVo.getRn();
			System.out.println(no + ". [ "+name+" ] \r" );
		}
		System.out.println("1. 이전페이지");
		System.out.println("2. 다음페이지");
		System.out.println("3. 가게 상세조회");
		System.out.println("4. 메인화면");
	}

	public void printResDetail(List<RestaurantVo> detailList) {
		System.out.println();
		printVar();
		printLn(2);
		String res = "A";
		for (RestaurantVo restaurantVo : detailList) {
			String resNo = restaurantVo.getRes_no();
			String name = restaurantVo.getRes_name();
			String location = restaurantVo.getRes_location();
			String tel = restaurantVo.getResTel();
			String distance = restaurantVo.getRes_distance();
			String menuName = restaurantVo.getMenu_name();
			String comment = restaurantVo.getRes_remark();
			int menuPrice = restaurantVo.getMenu_price();
			if(!res.equals(resNo)) {
				System.out.println();
				System.out.println("[ "+name+" ]");
				System.out.println("☎  "+tel);
				System.out.println("🏠  "+ location+"\t("+distance+")");
				System.out.println("✔️ : "+comment);
				System.out.println();
				res=resNo;
			}
			System.out.println("  ▷  "+menuName+"  "+menuPrice+"원");
		}
		printLn(3);
		printVar();
	}
	
	public void printFctListByLoc(List<RestaurantVo> list) {
		String loc = (String) MainController.sessionStorage.get("loc");
		if(loc.contains("1")) {
			System.out.println("1루");
		}else if(loc.contains("3")) {
			System.out.println("3루");
		}else {
			System.out.println("중앙");
		}
		
		for (RestaurantVo restaurantVo : list) {
			String name = restaurantVo.getRes_name();
			int rn = restaurantVo.getRn();
			System.out.println(rn+". "+name);
		}
	}
	
	
	
}

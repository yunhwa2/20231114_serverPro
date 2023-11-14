package day1114test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		System.out.println(formatter.format(today) + "_서버프로그램 구현 : 이윤화");
	}
}

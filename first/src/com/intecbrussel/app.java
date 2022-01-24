package com.intecbrussel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class app {
	
	public static void main(String[] args) {
		
		String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut volutpat tristique hendrerit. Quisque imperdiet, nibh pretium mollis convallis, enim mi placerat lacus, at finibus tellus purus a turpis. Nullam dictum erat neque, sit amet mattis ex finibus vel. Ut et massa iaculis, dapibus urna vitae, ultrices sapien. In id lorem felis. Phasellus ac eros et nulla iaculis placerat eget id velit. Pellentesque ultrices mi elit, tempor tristique tellus lobortis a.";
		
		Pattern pattern = Pattern.compile("sit");
		Matcher matcher = pattern.matcher(text.toLowerCase());
		
		while(matcher.find()) {
			System.out.println(matcher.start() + "-" + matcher.end());
		}

		String myStringData ="Jack,Mike,Bob,Jay";
		String[] myArrayData = myStringData.split(",");
		System.out.println(myStringData);
		System.out.println(myArrayData.length);
		System.out.println(myArrayData[2]);
		
		
		
		
		
		
		
		
		
}}

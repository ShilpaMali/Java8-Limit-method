package com.velocity.skip;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("mumbai");
		list.add("pune");
		list.add("delhi");
		list.add("bangalore");
		list.add("nagpur");

		//System.out.println(list.stream().skip(2));
		list.stream().skip(3).
		forEach(s -> System.out.println(s));

	}

}

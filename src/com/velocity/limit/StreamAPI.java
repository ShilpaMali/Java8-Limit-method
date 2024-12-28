package com.velocity.limit;

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

		// System.out.println(list.stream().limit(2));
		list.stream().limit(2).
		forEach(s -> System.out.println(s));

	}

}

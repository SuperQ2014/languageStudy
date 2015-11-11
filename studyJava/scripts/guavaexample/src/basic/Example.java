package basic;

import java.util.List;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

public class Example {

	public static void main(String[] args) {
		
		String myString = "foo,bar,,quiut,";
		String[] oldStringArray = myString.split(",");
		System.out.println(oldStringArray[0]);
		System.out.println(oldStringArray[1]);
		System.out.println(oldStringArray[2]);
		System.out.println(oldStringArray[3]);
		List<String> newStringArray = Lists.newArrayList(Splitter.on(',').split(myString));
		List<String> newStringList = Lists.newArrayList(Splitter.on(',').trimResults()
				.omitEmptyStrings().split(myString));
		System.out.println(newStringArray);
		System.out.println(newStringList);
	}
}

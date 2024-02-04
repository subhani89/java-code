package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatinationOfStreams {

	public static void main(String[] args) {
		// concatinating mean to cobine the different streams into one list is called concatination
		//in this case we add different lists into different streams and 
		//and combined those stream into single stream and it will stored in new list
		
		List<String> names=Arrays.asList("subhani","rabiya","subhani","subbu","alone");
		List<String> birds=Arrays.asList("parrot","cheeta","lion","owl","bird");
		Stream<String> stream1=names.stream();
		Stream<String> stream2=birds.stream();
		List<String> finalstream=Stream.concat(stream1, stream2).collect(Collectors.toList());
		System.out.println(finalstream);

	}

}

package com.maxtrain.greg;

public class Numbers {

	public static void main(String[] args) {

		int[] ints = {448,823,950,553,450,720,307,348,425,543,265,283,830,585,816};
		var largest = 0;
		var smallest = 1000;
		var sum = 0;
		var count = 0;
		for(var i : ints) {
			sum += i;
			count++;
			if(i > largest) largest = i;
			if(i < smallest) smallest = i;
		}
		System.out.println("Sum: " + sum + ", Avg: " + sum / count + 
							", largest: " + largest + ", smallest: " + smallest);
	}

}

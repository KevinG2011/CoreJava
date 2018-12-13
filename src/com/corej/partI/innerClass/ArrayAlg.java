package com.corej.partI.innerClass;

class ArrayAlg {
	static class Pair {
		private double first;
		private double second;
		
		public Pair(double first, double second) {
			this.first = first;
			this.second = second;
		}
		
		public double getFirst() {
			return this.first;
		}
		
		public double getSecond() {
			return this.second;
		}
	}
	
	public static Pair minmax(double[] values) {
		double min = Double.POSITIVE_INFINITY;
		double max = Double.NEGATIVE_INFINITY;
		for (double v : values) {
			if (min > v) min = v;
			if (max < v) max = v;
		}
		return new Pair(min, max);
	}
}

public class DiceMain {

	public static void main(String[] args) {
		
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		System.out.println(d1.toString() + ", " + d2.toString());
		d1.throwDice();
		d2.throwDice();
		System.out.println(d1.toString() + ", " + d2.toString());
		
		// Throw a dice 1000 times and calculate relative frequencies
		int[] frequencies = new int[6];
		int v;
		for(int i = 0; i < 1000; i++) {
			d1.throwDice();
			v = d1.getValue();
			frequencies[v-1] = frequencies[v-1] + 1; // first index in array is zero
		}
		
		double rel_freq;
		for(int i = 0; i < frequencies.length; i++) {
			rel_freq = frequencies[i]/1000.0; // make sure we get a float (double)
			System.out.println((i+1) + ": " + rel_freq);
		}
	}
}

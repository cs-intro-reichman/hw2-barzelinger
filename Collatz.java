// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];

		if (mode.equals("v")){
			// calculating the sequences from 1 to seed.
			for (int i = 1; i <= seed; i++){
				String sequence = i + "";
				int steps = 1;
				int temp_seed = i;

				// if seed is 1 then start from the second number.
				if (i==1) {
					sequence = 1 + " " + i + ""; // the final sequance.
					steps = 2; // the amount of steps it took to get to 1.
					temp_seed = 4;
				}

				// calculate the sequence.
				while (temp_seed != 1){
					// if even
					if (temp_seed % 2 == 0){
						temp_seed = temp_seed/2;
					} 
					// if odd
					else {
						temp_seed = temp_seed*3 +1;
					}
					steps++;
					sequence = sequence +  " " + temp_seed;
				}
				System.out.println(sequence + " (" + steps + ")");
			}
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");

	}
}


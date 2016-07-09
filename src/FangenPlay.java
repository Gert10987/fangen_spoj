import java.io.IOException;

public class FangenPlay {

    public static void main(String[] args) throws NumberFormatException, IOException {

	int[] length = new int[100];
	FanFactory fanFactory = new FanFactory();
	PrintLoop printLoop = new PrintLoop(fanFactory, length);
	printLoop.run();
    }
}
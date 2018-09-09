package methodargs;

public class KeepUnitInterfacesSmall {

	public static class Args {
		public int a;
		public int b;
		public int c;
		public int d;
		public int e;
		public int f;
	}

	public int oneArg(int a) {
		return a;
	}

	public int twoArg(int a, int b) {
		return a + b;
	}

	public int threeArg(int a, int b, int c) {
		return a + b + c;
	}

	public int fourArg(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public int fiveArg(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}

	public int sixArg(int a, int b, int c, int d, int e, int f) {
		return a + b + c + d + e + f;
	}

	public int varArg(int... ints) {
		return 0;
	}

	public int objectArg(Args args) {
		return args.a + args.b + args.c + args.d + args.e + args.f;
	}

}

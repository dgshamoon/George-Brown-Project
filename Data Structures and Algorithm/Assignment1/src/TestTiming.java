public class TestTiming {

	public static void main(String[] args) {
		testDaffy();
		testDonald();
		testMickey();
	}
	public static void testDaffy() {
		System.err.println("testing daffy method");
		Stopwatch timer=new Stopwatch();
		for (int i = 33; i < 45; i++) {
			timer.start();
			Timing.daffy(i);
			timer.stop();
			System.out.println(timer);
		}
		System.err.println("daffy test finished");
	}
	public static void testDonald() {
		System.err.println("testing donald method");
		Stopwatch timer=new Stopwatch();
		for (int i = 33; i < 45; i++) {
			timer.start();
			Timing.daffy(i);
			timer.stop();
			System.out.println(timer);
		}
		System.err.println("donald test finished");
	}
	public static void testMickey(){
		System.err.println("testing mickey");
		for (int i = 1000; i < 8192000; i*=2) {
			String time=runtMickey(i);
			System.out.println(time);
		}
		System.err.println("testing mickey finished");
		}
	public static String runtMickey(int n) {
		int[] arr=Timing.randomarr(n);
		Stopwatch timer=new Stopwatch();
		timer.start();
		Timing.mickey(arr);
		timer.start();
		return timer.toString();
	}
}

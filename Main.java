public class Main {

    public static void main(String[] args) {
	// write your code here
        OnTaskDoneListener listener = x -> System.out.println(x);
        OnTaskErrorListener errorListener = x -> System.err.println(x);


        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}

public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 's' to start the stopwatch");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("s")) {
            stopwatch.start();
        }
}
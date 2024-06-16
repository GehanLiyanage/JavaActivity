public class loading {

    public static void main(String[] args) {
        int totalLength = 20; // Total length of the loading bar
        int delay = 200; // Delay in milliseconds (1000 ms = 1 second)

        System.out.println("Loading:");

        for (int i = 0; i <= totalLength; i++) {
            printLoadingBar(i, totalLength);

            // Wait for 1 second
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(); // Move to the next line after loading is complete
    }

    public static void printLoadingBar(int progress, int totalLength) {
        StringBuilder bar = new StringBuilder("[");

        for (int i = 0; i < totalLength; i++) {
            if (i < progress) {
                bar.append("|");
            } else {
                bar.append(" ");
            }
        }
        bar.append("]");

        int percentage = (int) ((double) progress / totalLength * 100);

        // Print the loading bar with percentage
        System.out.print("\r" + bar + " " + percentage + "%");

        // Flush the output to ensure the carriage return is effective
        System.out.flush();

    }
}

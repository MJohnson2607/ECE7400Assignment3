/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ECE7400Assignment3;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        NeuralNetwork network = new NeuralNetwork("weights.txt", 3);
        network.run();
    }
}

package service;

import java.util.Scanner;

/** Owns the console input resource for one MiniBank run. */
public final class BankSession implements AutoCloseable {
    private final Scanner scanner = new Scanner(System.in);

    public Scanner scanner() {
        return scanner;
    }

    @Override
    public void close() {
        scanner.close();
        System.out.println("Bank session closed.");
    }
}

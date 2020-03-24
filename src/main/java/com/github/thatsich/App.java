package com.github.thatsich;

import picocli.CommandLine;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        final var exitCode = new CommandLine(new Example()).execute(args);
        System.out.println( "Hello World!" );
    }
}

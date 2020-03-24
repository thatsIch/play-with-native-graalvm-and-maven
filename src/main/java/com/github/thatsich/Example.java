package com.github.thatsich;

import picocli.CommandLine;

import java.io.File;


@CommandLine.Command(name = "example", mixinStandardHelpOptions = true, version = "Picocli example 4.0")
public class Example {
    @CommandLine.Option(names = { "-v", "--verbose" },
            description = "Verbose mode. Helpful for troubleshooting. Multiple -v options increase the verbosity.")
    private boolean[] verbose = new boolean[0];

    @CommandLine.Parameters(arity = "1..*", paramLabel = "FILE", description = "File(s) to process.")
    private File[] inputFiles;

    public void run() {
        if (verbose.length > 0) {
            System.out.println(inputFiles.length + " files to process...");
        }
        if (verbose.length > 1) {
            for (File f : inputFiles) {
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}

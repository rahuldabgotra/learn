package org.rahuldabgotra;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class SpringGeneratorCLI {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Prompt for project name
        System.out.println("Enter project name:");
        String projectName = scanner.nextLine();

        // Prompt for package name
        System.out.println("Enter package name (e.g., com.example):");
        String packageName = scanner.nextLine();

        // Prompt for project description
        System.out.println("Enter project description:");
        String projectDescription = scanner.nextLine();

        // Prompt for packaging type
        String packagingType = selectPackagingType(scanner);

        // Prompt for Java version
        String javaVersion = selectJavaVersion(scanner);

        // Prompt for dependencies
        List<String> dependencies = selectDependencies(scanner);

        // Generate project using Spring Initializr
        generateSpringProject(projectName, packageName, projectDescription, packagingType, javaVersion, dependencies);
    }

    private static String selectPackagingType(Scanner scanner) {
        System.out.println("Select packaging type:");
        System.out.println("1. jar");
        System.out.println("2. war");
        System.out.print("Enter your choice (1/2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        return (choice == 2) ? "war" : "jar";
    }

    private static String selectJavaVersion(Scanner scanner) {
        System.out.println("Select Java version:");
        System.out.println("1. 17");
        System.out.println("2. 21");
        System.out.print("Enter your choice (1/2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        return (choice == 2) ? "21" : "17";
    }

    private static List<String> selectDependencies(Scanner scanner) {
        System.out.println("Select dependencies (comma-separated by numbers, e.g., 1,2):");
        System.out.println("1. web");
        System.out.println("2. jpa");
        System.out.println("3. security");
        System.out.println("4. actuator");
        System.out.println("5. thymeleaf");
        System.out.print("Enter your choices: ");
        String[] choices = scanner.nextLine().split(",");
        List<String> dependencies = new ArrayList<>();
        for (String choice : choices) {
            switch (choice.trim()) {
                case "1": dependencies.add("web"); break;
                case "2": dependencies.add("jpa"); break;
                case "3": dependencies.add("security"); break;
                case "4": dependencies.add("actuator"); break;
                case "5": dependencies.add("thymeleaf"); break;
                default: System.out.println("Invalid choice: " + choice);
            }
        }
        return dependencies; // Return the list directly
    }


    private static void generateSpringProject(String projectName, String packageName, String projectDescription, String packagingType, String javaVersion, List<String> dependencies) throws IOException {
        String initializrUrl = "https://start.spring.io/starter.zip"
                + "?type=maven-project" // Can change to 'gradle-project' if needed
                + "&language=java"
                + "&groupId=" + packageName
                + "&artifactId=" + projectName
                + "&description=" + projectDescription
                + "&packaging=" + packagingType
                + "&javaVersion=" + javaVersion
                + "&dependencies=" + String.join(",", dependencies);

        // Connect to Spring Initializr API
        URL url = new URL(initializrUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Save the zip file locally
        InputStream inputStream = connection.getInputStream();
        FileOutputStream outputStream = new FileOutputStream(projectName + ".zip");

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        outputStream.close();
        inputStream.close();

        System.out.println("Project generated successfully: " + projectName + ".zip");
    }
}

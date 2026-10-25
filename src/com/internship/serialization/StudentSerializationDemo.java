package com.internship.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StudentSerializationDemo {
    public static void main(String[] args) {
        Path dataDirectory = Paths.get("data");
        Path filePath = dataDirectory.resolve("student.ser");

        try {
            Files.createDirectories(dataDirectory);

            Student student = new Student("Rahul", 101);

            try (ObjectOutputStream output = new ObjectOutputStream(
                    new FileOutputStream(filePath.toFile()))) {
                output.writeObject(student);
            }

            System.out.println("Serialized object: " + student);

            try (ObjectInputStream input = new ObjectInputStream(
                    new FileInputStream(filePath.toFile()))) {
                Student restoredStudent = (Student) input.readObject();
                System.out.println("Deserialized object: " + restoredStudent);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Serialization/deserialization failed: " + e.getMessage());
        }
    }
}

# Serialization and Deserialization

A Java project that serializes a `Student` object to a file and reads it back using deserialization.

## Features

- Defines a `Student` class with `name` and `id` attributes
- Implements the `Serializable` interface
- Writes a `Student` object to `data/student.ser`
- Reads the object back and displays its details
- Handles file and class-loading exceptions

## Project Structure

```text
SerializationAndDeserialization/
├── data/
├── src/
│   └── com/
│       └── internship/
│           └── serialization/
│               ├── Student.java
│               └── StudentSerializationDemo.java
├── .gitignore
└── README.md
```

## Run

Run these commands from the project root:

```bash
javac -d out src/com/internship/serialization/*.java
java -cp out com.internship.serialization.StudentSerializationDemo
```

The program creates `data/student.ser` when it runs, then reads the serialized object back and prints the student details.

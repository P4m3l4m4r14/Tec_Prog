JavaLar 🪐
JavaLar is a gravitational system simulation where the laws of physics meet the world of software development. Developed as a final project for the Object-Oriented Programming (OOP) Techniques course, this system replaces traditional celestial bodies with programming languages orbiting a central "Java" sun.

🌌 The Concept
In the JavaLar ecosystem, planets move in square orbits and interact with two types of entities that randomly appear in the space:

Bugs 🐛: When a planet collides with a Bug, it loses movement speed.

Devs 👨‍💻: When a planet collides with a Developer, it gains a speed boost.

Explosion 💥: Each planet has its own unique orbital speed. If a planet's speed reaches 0, it is destroyed and removed from the system.

🚀 Technical Features
Full-Stack Java: Entirely developed using Java, covering backend logic and frontend interface.

OOP Focused: Heavy use of encapsulation, inheritance, polymorphism, and abstraction to manage different planet behaviors and celestial interactions.

Database Integration: The system connects to a database to persist simulation data, logs, or user progress.

Square Orbit Algorithm: A custom mathematical implementation to handle movement across a grid-based square trajectory rather than a circular one.

🛠️ Technologies Used
Language: Java

Paradigm: Object-Oriented Programming (OOP)

Database: [Insert your DB here, e.g., MySQL / PostgreSQL]

GUI: [Insert library here, e.g., JavaFX / Swing]

📁 Project Structure
src/models: Contains the base classes for Planets, Bugs, and Devs.

src/logic: Handles the orbital mechanics and collision detection.

src/view: The graphical user interface (GUI) implementation.

src/database: Connection and Persistence logic.

🎮 How to Run
Clone the repository:

Bash

git clone https://github.com/your-username/javalar.git
Setup the Database:

Import the provided .sql schema.

Update the database credentials in the configuration file.

Compile and Run:

Open the project in your preferred IDE (IntelliJ, Eclipse, or NetBeans).

Run the Main.java file.

🎓 Academic Context
This project was developed as a practical application of OOP concepts, focusing on how objects interact in a dynamic environment, managing state changes (speed/life), and implementing persistent storage.

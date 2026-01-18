# JavaLar System 🪐
JavaLar is a graphical simulation of a planetary system developed purely in Java. In this unique universe, the Java language sits at the center like a sun, and other programming languages orbit around it as planets.

This project was created for the Object-Oriented Programming Techniques course, focusing on applying OOP principles to manage complex interactions, collision detection, and orbital physics.

## 📄 About the Project
The goal of JavaLar is to simulate a solar system with a twist:

The Center: Java is the central star.

The Planets: Other programming languages (e.g., C++, Python, PHP) orbit Java.

The Orbit: Unlike real physics, these planets follow a Square Orbit trajectory.

Persistence: The simulation state and event logs are stored in a database.

## 🌌 Simulation Mechanics & Rules
The system mimics a living ecosystem with specific rules for survival and movement:

### 1. Square Orbits 🔲
Planets do not move in circles or ellipses. They follow a strict coordinate-based square path around the center. This required a custom algorithm to calculate positions based on the planet's translation speed and the quadrant it occupies.

### 2. Events & Collisions 💥
Random entities appear in the universe, affecting the planets based on their grid position:

🐛 Bugs: If a planet collides with a Bug, its speed decreases.

👨‍💻 Developers (Devs): If a planet collides with a Dev, its speed increases (optimization).

### 3. Life & Death ☠️
Each planet starts with a specific rotation and translation speed.

If a planet's speed drops to 0 (due to too many bugs), it explodes and is removed from the simulation.

The system tracks active and destroyed planets in real-time.

## 🛠️ Technologies Used
Language: Java (100% pure Java for Backend, Frontend, and Logic).

Paradigm: Object-Oriented Programming (OOP).

Database: MySQL.

GUI: Java Swing.

IDE: Eclipse

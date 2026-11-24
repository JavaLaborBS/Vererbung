# Vererbung

Java-Konsolenanwendung für den ITL-Unterricht, die Vererbung am Beispiel
der Basisklasse `Person` und der abgeleiteten Klasse `Employee` zeigt.

## Screenshot

![Konsolenausgabe der Java-Anwendung](./media/image.png)

## Features

- Erstellt ein `Employee`-Objekt und verwendet die von `Person` geerbten Eigenschaften.
- Verwaltet die Mitarbeiter-ID (`employeeId`), die Vorgesetzten-ID (`supervisorId`) und das Gehalt (`salary`).
- Liest und ändert die Vorgesetzten-ID und das Gehalt über Getter und Setter.
- Erhöht das Gehalt über die Methode `salaryIncrease(float)`.
- Gibt die Personendaten und die zusätzlichen Mitarbeiterdaten auf der Konsole aus.

## Voraussetzungen

- JDK 25 oder neuer mit den Befehlen `javac` und `java`
- Git, falls das Repository geklont wird

## Installation

Klone das Repository oder lade es als ZIP herunter. Öffne das Hauptverzeichnis
des Projekts im Terminal und kompiliere den Quellcode:

```bash
javac -d out src/Domain/Models/Person.java src/Domain/Models/Employee.java src/Main.java
```

> [!NOTE]
> Das Projekt benötigt keine externen Bibliotheken.

## Verwendung

Starte das Programm im Hauptverzeichnis:

```bash
java -cp out Main
```

Das Programm erstellt einen Mitarbeiter mit festen Beispieldaten und gibt
seine Daten auf der Konsole aus. Die Beispieldaten lassen sich in
[`src/Main.java`](src/Main.java) ändern. Kompiliere das Programm nach einer
Änderung erneut.

## Projektstruktur

| Datei | Aufgabe |
|---|---|
| [`Person.java`](src/Domain/Models/Person.java) | Basisklasse für gemeinsame Personendaten und Methoden |
| [`Employee.java`](src/Domain/Models/Employee.java) | Leitet sich von `Person` ab und ergänzt mitarbeiterspezifische Daten und Methoden |
| [`Main.java`](src/Main.java) | Erstellt das Beispielobjekt und gibt seine Daten aus |

## Einschränkungen

- Das Beispiel verwendet fest vorgegebene Daten und hat keine interaktive Eingabe.
- Die Daten werden nicht dauerhaft gespeichert.

## Hilfe und Mitwirken

Fehler und Verbesserungsvorschläge können über den Tab **Issues** im
GitHub-Repository gemeldet werden. Beschreibe bei einem Fehler den
ausgeführten Befehl und füge die Konsolenausgabe hinzu.

README-Änderungen erhalten eine Commit-Nachricht mit dem Präfix `docs:`,
zum Beispiel `docs: README überarbeiten`.

## Projektinformationen

| Feld | Inhalt |
|---|---|
| Autor | Auer Alexander |
| Klasse | 2aAPC |
| Schuljahr | 2026/27 |
| Abgabedatum | 20.11.2026 |
| Lehrer | Gerhard Jarz |
| Fach | ITL1/ITL2 |
| Entwicklungsumgebung | Ubuntu 24.04 LTS, VS Code, JDK 25 und Git |

## Quellen

- [Offizielle Java-Dokumentation](https://docs.oracle.com/en/java/)
- OpenCode und ChatGPT zur Überarbeitung der README

## Lizenz

Dieses Projekt steht unter der [MIT-Lizenz](https://opensource.org/license/mit).

# Social Media App (Java)

This is a beginner-friendly Java project I built in a level 100 programming class.  
It is a simple menu-driven social media simulation where users can create accounts, post content, search posts, react to posts, and try a small math quiz.

## Project Type

- Language: Java
- Style: Local, console-based interactive application—not a networked social platform
- Purpose: Practice core programming fundamentals (methods, arrays, loops, conditionals, input handling)

## Features

- Create users with a password-format check: at least eight characters, uppercase/lowercase letters, a digit and a non-letter/digit character
- Match an existing username/password and select that user for post ownership
- Create and view **single-token posts**; spaces are not supported by the `Scanner.next()` input path
- Search using a single-token, case-sensitive substring
- Like or dislike posts while stepping through the existing list
- View posts and reaction counts through **Top Posts**; this lists insertion order, not a sorted ranking
- Select a random joke from a fixed list
- Take a five-question arithmetic quiz; division uses integer arithmetic

## What I Practiced

- Breaking logic into methods
- Managing app state with arrays and counters
- User input with `Scanner`
- Basic validation and control flow
- Building a full end-to-end program structure in Java

## Run Locally

A JDK with `javac` and `java` is required; there are no third-party libraries. Eclipse settings target Java 14 and reference `jdk-15`. These are historical configuration values, not a tested minimum. [JDK 15 is superseded](https://jdk.java.net/15/); prefer a maintained JDK, with compatibility checked before relying on it.

**Source-checked, unexecuted PowerShell instructions**, from the repository root:

```powershell
New-Item -ItemType Directory -Force -Path .readme-build | Out-Null
javac -d .readme-build Final/src/Social_Media.java
```

After successful compilation:

```powershell
java -cp .readme-build Social_Media
```

The public class and entrypoint are `Social_Media`, with no package declaration. The separate output folder keeps class files out of the source directory; do not commit it. Startup asks you to create the first user, then presents the menu. Both **5 (quit)** and **6 (go home)** currently exit the loop.

## File Structure

- `Final/src/Social_Media.java` — main application and all menu methods
- `Final/.classpath`, `Final/.project`, `Final/.settings/` — Eclipse configuration

## Notes

- This project was created as coursework for an introductory class and is intentionally focused on fundamentals.
- All users, passwords, posts and reactions live in memory and disappear on exit. Arrays have space for 20 users and 100 posts, without capacity guards.
- **Use invented credentials only.** Passwords are stored as plain strings and console input is not masked. Login is not an authorization boundary: menu actions are not gated on successful login, and the current user initially defaults to the first account.
- Duplicate usernames and repeated reactions are not prevented. Invalid numeric quiz input and capacity overflow can terminate the program.
- No automated tests, durable storage, network service or production authentication are supplied.

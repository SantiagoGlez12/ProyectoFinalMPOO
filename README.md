# Employee Records — Java University Project

A menu-driven console application developed during my Object-Oriented Programming coursework at UNAM. It models fictional employees, addresses, years of service, and project assignments.

**Java · OOP · Console application · CSV · Model–View–Controller organization**

## What it demonstrates

- Employee and address models, with generated sample attributes.
- Separate human-resources and employee menu paths.
- Viewing and modifying employee records.
- CSV export through the table controller.
- Java packages organized into model, view, and controller responsibilities.

These are academic implementations; the menu includes a fixed demonstration password (`123`), not production authentication.

## Repository guide

| Path | Purpose |
| --- | --- |
| `Main.java` | Starts the console menu. |
| `Modelo/` | Data and address models. |
| `Vista/Menu.java` | Console interaction and menu flow. |
| `Controlador/` | Employee and table operations. |
| `Direcciones.csv` | Address data read from the working directory. |
| `TablaTrabajadores.csv` | Included example export; running the export can overwrite it. |
| `resources/reference/` | Five supporting name, address, and project files consolidated from the companion repository. |
| `docs/` | Existing generated documentation and consolidation notes. |

## Compile and run

Install a JDK and run these commands from the repository root:

```bash
javac -encoding UTF-8 -d build Main.java Modelo/*.java Vista/*.java Controlador/*.java
java -cp build Main
```

Keep the working directory at the repository root so the program can find `Direcciones.csv`. Supporting reference files are retained for context; they do not replace the root runtime CSV.

**Validation:** source and resource integrity was checked during consolidation. Compilation and interactive behavior have not been verified in the current environment, which has no JDK installed.

## Academic context

The sample records are fictional or based on public example material, as confirmed by the author. Original Spanish class names and comments are preserved to reflect the work as developed.

The companion resources have been copied into this repository without changing their contents. The Java code is unchanged. Existing compiled binaries and generated documentation remain historical artifacts; the commands above build from source rather than relying on those binaries.

See the [consolidation record](docs/consolidation.md) for provenance. Related introductory exercises are available in [Java university labs](https://github.com/SantiagoGlez12/java-oop-university-labs).

**Status:** Historical university coursework.

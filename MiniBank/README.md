# MiniBank

MiniBank is a Java 17 console banking application. Its source files are organized
into `model`, `util`, and `service` packages under `src/main/java`.

## Build and run

From this folder, run:

```bash
./build.sh
java -jar build/minibank.jar
```

The menu lets you open accounts, deposit, withdraw, transfer, list accounts,
view a statement, and exit. New accounts ask for a valid email and mobile number.
Withdrawal rules are demonstrated with both an anonymous class and a lambda.
Runtime annotations (`@Id`, `@Positive`, and `@MaxLength`) are checked by
`util.AnnotationValidator` using reflection.

## Package layout

- `model`: accounts, customers, transactions, and account interfaces
- `util`: input and annotation validation, command parsing, and statement formatting
- `model.annotation`: runtime field annotations used for identifiers and validation
- `service`: the menu application and withdrawal rule
